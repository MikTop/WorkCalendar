package com.bp.employee;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.bp.employee.DAO.DepartmentDAO;
import com.bp.employee.DAO.EmployeeDAO;
import com.bp.employee.DAO.PositionDAO;
import com.bp.employee.DAO.WorkCalendarDAO;
import com.bp.employee.DAO.WorkTimeDescDAO;
import com.bp.employee.DAO.WorkTimeSheetDAO;
import com.bp.employee.GUI.CalendarFrame;
import com.bp.employee.GUI.GUITest;
import com.bp.employee.domain.Employee;
import com.bp.employee.domain.Position;
import com.bp.employee.domain.WorkTimeSheet;
import com.bp.employee.util.TableUtil;

public class MainClass  {

   
    public static void main(String[] args) {
        //new CalendarFrame();
    	new GUITest();
    	//WorkTimeDescDAO.getWorkTimeDescByID(1);
    	//WorkCalendarDAO.getCalendarList();
    	//WorkCalendarDAO.getCalendarList1();
    	//DepartmentDAO.getDepartmentsList();
    	//Calendar calend = new GregorianCalendar(2020, 1, 15);
    	//Date date = calend.getTime();
    	//WorkTimeSheetDAO.addWorkTimeSheetInstance(7, 15, 1);
    	//WorkTimeSheetDAO.addWorkTimeSheetInstance(8, 169, 4);
    	/*
    	 * 
    	List <WorkTimeSheet> list = WorkTimeSheetDAO.getWorkTimeSheetListByEmployeeIDAndMonth(7, 1);
    	List <WorkTimeSheet> list1 = WorkTimeSheetDAO.getWorkTimeSheetListByEmployeeID(7);
    	if(list == null) System.out.println("Ничего нет");
    	else {
    		for(WorkTimeSheet e: list) {
    		System.out.println(e.getEmployeeID() + " " + e.getDateID());
    		}
    	}
    	for(WorkTimeSheet e: list1) {
    		System.out.println(e.getEmployeeID() + " " + e.getDateID());
    	}
    	*/
    	//List<Employee> list = EmployeeDAO.getEmployeeListByDepartment(0);
    	//for(Employee e: list) {
    	//	System.out.println(e.getLastName() + " " + e.getId() );
    	//}
    	
    	/*
    	String[] x = TableUtil.getColumnsHeaderByMonth(2);
    	for(String i: x) {
    		System.out.println(i);
    	}
    	*/
    	
    	//WorkCalendarDAO.getWorkCalendarByMonth(1);
    	
    	/*TODO
    	 * Доработать утилиту для таблицы
    	 * Доработать метод получения записей табеля, разобраться с запросом JOIN
    	 * Доработать генерацию таблицы
    	 * 
    	 */
    	//WorkTimeDescDAO.getWorkTimeDescList();
    }
}