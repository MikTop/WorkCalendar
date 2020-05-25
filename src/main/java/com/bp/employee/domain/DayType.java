package com.bp.employee.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "daytype")
public class DayType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name ="id")
	private int id;
	
	@Column(name= "abbreviarion")
	private String abbreviation;
	
	@Column(name = "typeDesc")
	private String typeDesc;
	
	

	public DayType() {
		super();
		
	}

	
	
	public DayType(int id, String abbreviation, String typeDesc) {
		super();
		this.id = id;
		this.abbreviation = abbreviation;
		this.typeDesc = typeDesc;
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

	public String getTypeDesc() {
		return typeDesc;
	}

	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}
	
	

}
