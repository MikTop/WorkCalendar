package com.bp.employee.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bp.employee.domain.Employee;
import com.bp.employee.domain.Position;

public class PositionDAO {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("employee");

	
	
	public static void addPosition (Position newPos){
		
		
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		
		try {
			et = em.getTransaction();
			et.begin();
			
			Position pos = newPos;
			em.persist(newPos);
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
	
	public static String getPositionDescByID (int id) {
		String positionDesc = null;
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		try {
			String query = "SELECT positionDesc FROM Position WHERE id =: id ";
			positionDesc = (String) em.createQuery(query).setParameter("id", id).getSingleResult();
			
		}catch (Exception e) {
			
		}
		
		
		return positionDesc;
	}

}
