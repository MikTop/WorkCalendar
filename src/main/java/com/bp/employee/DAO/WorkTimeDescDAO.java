package com.bp.employee.DAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class WorkTimeDescDAO {
	
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("employee");

}
