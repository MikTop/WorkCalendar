package com.bp.employee.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="worktimedesc")
public class WorkTimeDesc implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	@Column(name ="abbreviation")
	private String abbreviation;
	
	@Column(name = "worktimedesc")
	private String workTimeDesc;

	public WorkTimeDesc() {
		super();
	
	}

	public WorkTimeDesc(int id, String abbreviation, String workTimeDesc) {
		super();
		this.id = id;
		this.abbreviation = abbreviation;
		this.workTimeDesc = workTimeDesc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getWorkTimeDesc() {
		return workTimeDesc;
	}

	public void setWorkTimeDesc(String workTimeDesc) {
		this.workTimeDesc = workTimeDesc;
	}
	
	
	

}
