package com.bp.employee.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name ="worktimesheet")
public class WorkTimeSheet  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "employee_ID")
	private int employeeID;
	
	
	@Column(name ="date_ID")
	private int dateID;
	
	@Column(name = "workTimeDesc_ID")
	private int workTimeDescID;

	public WorkTimeSheet() {
		super();
		
	}

	public WorkTimeSheet(int employeeID, int dateID, int workTimeDescID) {
		super();
		this.employeeID = employeeID;
		this.dateID = dateID;
		this.workTimeDescID = workTimeDescID;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getDateID() {
		return dateID;
	}

	public void setDateID(int dateID) {
		this.dateID = dateID;
	}

	public int getWorkTimeDescID() {
		return workTimeDescID;
	}

	public void setWorkTimeDescID(int workTimeDescID) {
		this.workTimeDescID = workTimeDescID;
	}
	
	
	

}
