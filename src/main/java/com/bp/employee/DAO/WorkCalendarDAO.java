package com.bp.employee.DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bp.employee.domain.WorkCalendar;

public class WorkCalendarDAO {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("employee");
	
	
	public static List<WorkCalendar> getCalendarList(){
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		
		List <WorkCalendar> calendarList = null;
		String query = "SELECT * FROM calendar  ";
		
		try {
			
			calendarList = em.createNativeQuery(query, WorkCalendar.class).getResultList();	
		//calendarList = em.createQuery(query, WorkCalendar.class).getResultList();
		/*
		for(WorkCalendar x:calendarList ) {
			System.out.println(x.getId() + " " +x.getDay().toString());
		}
		*/
		//System.out.println(calendarList.size());		
		}catch (Exception e) {
			
		}
		return calendarList  ;
	}
	
	
	public static void updateCalendarByFile(String path, String year) {
		// "F:\\Education\\workingCalendar.csv.txt"- тестовый путь
		// получить файл csv c сайта https://data.gov.ru/opendata/7708660670-proizvcalendar
		
		File file = new File(path);
		String str;
		int i= 0;
		Calendar calend = new GregorianCalendar();
		Date date ;
		try {
			
		BufferedReader reader = new BufferedReader(new FileReader(file));
		str = reader.readLine();
		
		while(str != null) {
			if(str.startsWith(year)) {
				for(String s : str.split("\"")) {
					if(s.startsWith(",")) {
						continue;
					}
					
					
					for(String s1 : s.split(",")) {
						if(s1.contains("*")   ) {
							continue;
						}
						if(s1.length() > 3) continue;
						if(s1.contains("+")) {
							s1 = s1.substring(0, s1.length ()-1);
						}
						if (s1.length() < 2) {
							//s1 = "0" + s1;
						}
						//System.out.println(i + ") "+ s1);
						int changeDay = Integer.parseInt(s1);
						int changeYear = Integer.parseInt(year);
						calend.set(changeYear, i-1, changeDay);
						date = calend.getTime();
						updateDayByDate(date);
						
					}
					i++;
				}
				
				
			}
			str = reader.readLine();
		}
		
		//TODO Организовать через stream API
		
		
		}catch (IOException ex) {
			
		}
		
		
		
		
		
		
		
		

		
		
		
	}
	
	public static void addDay (WorkCalendar calendar) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		
		try {
			et = em.getTransaction();
			et.begin();
			
			WorkCalendar calend = calendar;
			em.persist(calend);
			et.commit();
		}catch (Exception ex) {
            
            if (et != null) {
                et.rollback();
            }
            ex.printStackTrace();
        } finally {
            
            em.close();
        }
	}
		
		public static void updateDayByDate (Date date) {
			EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
			EntityTransaction et = null;
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			WorkCalendar calendar = null;
			
			try {
	            
	            et = em.getTransaction();
	            et.begin();
	 
	            String query = "FROM WorkCalendar  WHERE day =: date";
	            calendar =  em.createQuery(query, WorkCalendar.class).setParameter("date", date).getSingleResult();
	            calendar.setDayType(1);
	        	//System.out.println(calendar.getId() + " " + calendar.getDay() + " " + calendar.getDayType());
	            
	 
	            
	            em.persist(calendar);
	            et.commit();
	        } catch (Exception ex) {
	            
	            if (et != null) {
	                et.rollback();
	            }
	            ex.printStackTrace();
	        } finally {
	            
	            em.close();
	        }
			
		}
		
		
		public static void addNewYear (String year) {
		
		//TODO Добавить проверку правильности ввода
		int intYear = Integer.parseInt(year);
		Calendar calend = new GregorianCalendar(intYear, 0, 1 );
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = calend.getTime();
		
		WorkCalendar calendar = new WorkCalendar(0, date, 1 );
		
		addDay(calendar);
		
		for (int i= 1; i<366; i++) {
			
			calendar.setId(i);
			calend.add(Calendar.DAY_OF_YEAR, 1);
			calendar.setDay((Date)calend.getTime());
			addDay(calendar);
			
		}
			
		}
		
		public static List<WorkCalendar> getWorkCalendarByMonth(int month){
			Stream<WorkCalendar> stream = getCalendarList().stream();
			
			List<WorkCalendar> workCalendarListByMonth = stream.filter(x -> x.getDay().getMonth() == month).collect(Collectors.toList());
			/*
			for(WorkCalendar x:workCalendarListByMonth ) {
				System.out.println(x.getDay().toString());
			}
			*/
			return workCalendarListByMonth;
			
		}
		
		public static List<Date> getCalendarList1(){
			EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
			EntityTransaction et = null;
			
			List <Date> calendarList = null;
			String query = "SELECT day FROM WorkCalendar  ";
			
			try {
				
				calendarList = em.createQuery(query, Date.class).getResultList();	
			//calendarList = em.createQuery(query, WorkCalendar.class).getResultList();
			/*
			for(Date x:calendarList ) {
				System.out.println(x.toString());
			}
			*/
			System.out.println(calendarList.size());		
			}catch (Exception e) {
				
			}
			return calendarList  ;
		}
		

}

