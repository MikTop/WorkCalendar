package com.bp.employee.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "calendar")
public class WorkCalendar implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "day")
	@Temporal(TemporalType.DATE)
	private Date day;
	
	@Column(name = "dayType")
	private int dayType;

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public int getDayType() {
		return dayType;
	}

	public void setDayType(int dayType) {
		this.dayType = dayType;
	}

	public WorkCalendar(int id, Date day, int dayType) {
		super();
		this.id = id;
		this.day = day;
		this.dayType = dayType;
	}

	public WorkCalendar() {
		super();
		
	}
	
	
	

}
