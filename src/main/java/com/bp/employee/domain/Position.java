package com.bp.employee.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "position")
public class Position implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "posDesc")
	private String positionDesc;
	
	@Column(name = "department_ID")
	private int departmentID;

	public Position() {
		super();
		
	}

	public Position(int id, String positionDesc, int departmentID) {
		super();
		this.id = id;
		this.positionDesc = positionDesc;
		this.departmentID = departmentID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPositionDesc() {
		return positionDesc;
	}

	public void setPositionDesc(String positionDesc) {
		this.positionDesc = positionDesc;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	
	
	
	

}
