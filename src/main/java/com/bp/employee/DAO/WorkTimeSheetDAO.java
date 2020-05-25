package com.bp.employee.DAO;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bp.employee.domain.WorkCalendar;
import com.bp.employee.domain.WorkTimeDesc;
import com.bp.employee.domain.WorkTimeSheet;



public class WorkTimeSheetDAO {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("employee");
	
	
	
	public static void addWorkTimeSheetInstance(int employeeID, int dateID, int workTimeDescID) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		
		try {
			et = em.getTransaction();
			et.begin();
			
			WorkTimeSheet inst = new WorkTimeSheet(employeeID, dateID, workTimeDescID);
			em.persist(inst);
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
	
	public static List<WorkTimeSheet> getWorkTimeSheetListByEmployeeIDAndMonth(int employeeID, int month){
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		List <WorkTimeSheet> workTimeSheetListTemp = null;
		List <WorkTimeSheet> workTimeSheetList = null;
		
		try {
			String query = "FROM WorkTimeSheet wts JOIN WorkCalendar wc  WHERE wts.employeeID =: employeeID";
			Query query1 =  em.createQuery(query, Object.class).setParameter("employeeID", employeeID);
			query1.setParameter("month", month);
			workTimeSheetList = query1.getResultList();
			
			
			
		}catch (Exception ex) {
            
            
            
        }
		
		return 	workTimeSheetList;	
		
	}
	public static List<WorkTimeSheet> getWorkTimeSheetListByEmployeeID(int employeeID){
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		List <WorkTimeSheet> workTimeSheetListTemp = null;
		List <WorkTimeSheet> workTimeSheetList = null;
		
		try {
			String query = "FROM WorkTimeSheet wts  WHERE wts.employeeID =: employeeID ";
			Query query1 =  em.createQuery(query, Object.class).setParameter("employeeID", employeeID);
			
			workTimeSheetList = query1.getResultList();
			
			
			
		}catch (Exception ex) {
            
            
            
        }
		
		return 	workTimeSheetList;	
		
	}
	
	
	

}
