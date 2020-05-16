package com.bp.employee.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {

	

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "employee_ID")
	private int id;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "secondName")
	private String secondName;
	
	@Column(name = "department_ID")
	private int departmentID;
	
	@Column(name = "position_ID")
	private int positionID;
	
	@Column(name = "personalNumber")
	private int personalNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public int getPositionID() {
		return positionID;
	}

	public void setPositionID(int positionID) {
		this.positionID = positionID;
	}

	public int getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(int personalNumber) {
		this.personalNumber = personalNumber;
	}

	public Employee() {
		super();
		
	}

	public Employee(String lastName, String firstName, String secondName, int departmentID, int positionID,
			int personalNumber) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.secondName = secondName;
		this.departmentID = departmentID;
		this.positionID = positionID;
		this.personalNumber = personalNumber;
	}
	
	
	
}
