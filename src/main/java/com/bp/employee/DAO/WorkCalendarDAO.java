package com.bp.employee.DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bp.employee.domain.WorkCalendar;

public class WorkCalendarDAO {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("employee");
	
	
	public static void updateCalendarByFile(String path, String year) {
		// "F:\\Education\\workingCalendar.csv.txt"- тестовый путь
		
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
							s1 = "0" + s1;
						}
						System.out.println(i + ") "+ s1);
						
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
	            // Get transaction and start
	            et = em.getTransaction();
	            et.begin();
	 
	            String query = "FROM WorkCalendar  WHERE day =: date";
	            calendar =  em.createQuery(query, WorkCalendar.class).setParameter("date", date).getSingleResult();
	        	
	        	System.out.println(calendar.getId() + " " + calendar.getDay() + " " + calendar.getDayType());
	            calendar.setDayType(2);
	 
	            // Save the customer object
	            em.persist(calendar);
	            et.commit();
	        } catch (Exception ex) {
	            // If there is an exception rollback changes
	            if (et != null) {
	                et.rollback();
	            }
	            ex.printStackTrace();
	        } finally {
	            // Close EntityManager
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

}

