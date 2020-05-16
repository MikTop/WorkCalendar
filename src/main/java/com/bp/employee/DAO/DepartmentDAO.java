package com.bp.employee.DAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DepartmentDAO {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("employee");

}
