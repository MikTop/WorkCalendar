package com.bp.employee.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bp.employee.GUI.GuiError;
import com.bp.employee.domain.Department;

public class DepartmentDAO {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("employee");

	
	
	
	
	public static List<Department> getDepartmentsList(){
		if(ENTITY_MANAGER_FACTORY == null)new GuiError();
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		
		List <Department> departmentsList= null;
		
		String query = "FROM Department ";
		
		try {
			departmentsList = em.createQuery(query, Department.class).getResultList();
			
		}catch (Exception e) {
			new GuiError();
		}
		
		
		return departmentsList; 
	}
}
