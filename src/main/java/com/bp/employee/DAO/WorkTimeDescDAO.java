package com.bp.employee.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bp.employee.domain.WorkCalendar;
import com.bp.employee.domain.WorkTimeDesc;

public class WorkTimeDescDAO {
	
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("employee");
	
	public static List<WorkTimeDesc> getWorkTimeDescList (){
		List<WorkTimeDesc> workTimeDescList =null;
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		String query = "FROM WorkTimeDesc ";
		
		try {
			
			workTimeDescList = em.createQuery(query, WorkTimeDesc.class).getResultList();
			
			
		}catch (Exception e) {
			
		}
		for(WorkTimeDesc e: workTimeDescList) {
			System.out.println(e.getId() + " "+ e.getWorkTimeDesc());
		}
		
		return workTimeDescList;
	}
	
	public static void addDesc(int id, String abbreviation, String describe) {
		
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		
		try {
			et = em.getTransaction();
			et.begin();
			
			WorkTimeDesc desc = new WorkTimeDesc(id, abbreviation, describe);
			em.persist(desc);
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
	
	public static void updateDescById(int id, String abbr, String describe) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		
		try {
			et = em.getTransaction();
			et.begin();
			
			WorkTimeDesc desc = new WorkTimeDesc(id, abbr, describe);
			em.merge(desc);
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
	public static WorkTimeDesc getWorkTimeDescByID (int id){
		WorkTimeDesc workTimeDesc =null;
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		String query = "FROM WorkTimeDesc WHERE id =:id ";
		
		try {
			
			workTimeDesc = em.createQuery(query, WorkTimeDesc.class).setParameter("id", id).getSingleResult();
			
			
		}catch (Exception e) {
			
		}
		
		return workTimeDesc;
	}

}
