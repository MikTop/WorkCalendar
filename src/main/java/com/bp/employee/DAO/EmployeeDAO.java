package com.bp.employee.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bp.employee.domain.Employee;

public class EmployeeDAO {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("employee");
	
	public static void addEmployee (Employee employee) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		
		try {
			et = em.getTransaction();
			et.begin();
			
			Employee empl = employee;
			em.persist(empl);
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

}
