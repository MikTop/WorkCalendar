package com.bp.employee.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.bp.employee.DAO.EmployeeDAO;
import com.bp.employee.DAO.WorkCalendarDAO;
import com.bp.employee.DAO.WorkTimeDescDAO;
import com.bp.employee.DAO.WorkTimeSheetDAO;
import com.bp.employee.domain.Employee;
import com.bp.employee.domain.WorkCalendar;
import com.bp.employee.domain.WorkTimeSheet;

public class TableUtil {
	
	public static String[][] dateForTable(int departmentID, int month){
		
		long tempInt;
		int i =0;
		int j = 0;
		String [] columnsHeader = null; 
		String[][] preparedDateList = null;
		List <WorkCalendar> calendarListByMonth= WorkCalendarDAO.getWorkCalendarByMonth(month);
		List <Employee> employeeListByDepartment = EmployeeDAO.getEmployeeListByDepartment(departmentID);
		//Stream <WorkCalendar> calendarListStream = calendarList.stream();
		tempInt = calendarListByMonth.size() + 5 ;
		preparedDateList = new String[employeeListByDepartment.size()][(int) tempInt];
		 
		
		for ( i = 0; i <employeeListByDepartment.size() ; i++ ) {
			List <WorkTimeSheet> workTimeSheetList = WorkTimeSheetDAO.getWorkTimeSheetListByEmployeeID(employeeListByDepartment.get(i).getId());
			int x = 0;
			for( j = 0 ; j < tempInt; j++) {
				if (j == 0) preparedDateList[i][j] = employeeListByDepartment.get(i).getLastName();
				else if (j == 1) preparedDateList[i][j] = employeeListByDepartment.get(i).getFirstName();
				else if (j == 2) preparedDateList[i][j] = employeeListByDepartment.get(i).getSecondName();
				else if (j == 3) preparedDateList[i][j] = Integer.toString(employeeListByDepartment.get(i).getPositionID());
				else if (j == 4) preparedDateList[i][j] = Integer.toString(employeeListByDepartment.get(i).getPersonalNumber());
				else if(j>4 && x < workTimeSheetList.size()) {
					for(int y = 0; y < workTimeSheetList.size() ; y++) {
						if(workTimeSheetList.get(y).getDateID() == calendarListByMonth.get(j-5).getId()) {
							WorkTimeDescDAO.getWorkTimeDescByID(workTimeSheetList.get(y).getWorkTimeDescID()).getWorkTimeDesc();
							preparedDateList[i][j] = WorkTimeDescDAO.getWorkTimeDescByID(workTimeSheetList.get(y).getWorkTimeDescID()).getAbbreviation();
						}else preparedDateList[i][j] = "";
					}
				}else preparedDateList[i][j] = "";
				
			}
		}
		
		
		
		return preparedDateList;
	}
	 public static String[] getColumnsHeaderByMonth (int month) {
		 
		 
		 //Stream<WorkCalendar> workCalendarStream = WorkCalendarDAO.getWorkCalendarByMonth(month).stream();
		 List<WorkCalendar> workCalendarList = WorkCalendarDAO.getWorkCalendarByMonth(month);
		 String [] columnsHeader = new String[workCalendarList.size() + 5];
		 columnsHeader[0] = "Фамилия";
		 columnsHeader[1] = "Имя";
		 columnsHeader[2] = "Отчество";
		 columnsHeader[3] = "Должность";
		 columnsHeader[4] = "Табельный номер";
		 for(int i = 5; i <= workCalendarList.size() +4; i++) {
			 columnsHeader[i] = Integer.toString(i-4);
		 }
		 
		 return columnsHeader;
	 }

}
