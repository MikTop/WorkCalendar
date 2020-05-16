package com.bp.employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.bp.employee.DAO.WorkCalendarDAO;
import com.bp.employee.domain.DayType;
import com.bp.employee.domain.Employee;
import com.bp.employee.domain.WorkCalendar;

public class MainClass {
	
	

	public static void main(String[] args) {
		Employee empl = new Employee ("To", "Mi" ,"Se", 0, 0, 1);
		
		
		WorkCalendarDAO.updateCalendarByFile("F:\\Education\\workingCalendar.csv.txt", "2020");
		
		
		
		
		
		
		 
		
	}
	
	
}
