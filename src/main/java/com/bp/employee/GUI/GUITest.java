package com.bp.employee.GUI;


import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

import com.bp.employee.DAO.DepartmentDAO;
import com.bp.employee.DAO.WorkCalendarDAO;
import com.bp.employee.domain.Department;
import com.bp.employee.domain.WorkCalendar;
import com.bp.employee.util.TableUtil;

public class GUITest extends JFrame{
	
	
	
	private String[] monthRu = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
								"Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"}; 
	
	
	public GUITest() {
		super("Производственный календарь");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JTabbedPane tabsRight = new JTabbedPane(JTabbedPane.LEFT, JTabbedPane.SCROLL_TAB_LAYOUT);
		tabsRight.addTab("Департаменты", new JPanel());
		tabsRight.setEnabledAt(0, false);
	    
	    List <Department> departmentList = DepartmentDAO.getDepartmentsList();
	    
	    
	     for (int i = 0; i < departmentList.size(); i++) {     
	    	
	         
	         JTabbedPane monthTab = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
	         for(int j = 0; j<12 ;j++) {
	        	 
	        	 List <WorkCalendar> workCalend =  WorkCalendarDAO.getWorkCalendarByMonth(j);
	        	 String [] headersArray = TableUtil.getColumnsHeaderByMonth(j);
	        	 	        	
	        	 JTable table1 = new JTable(TableUtil.dateForTable(i, j), headersArray);
	        	 
	        	 
	        	 TableColumn column = null;
	        	 
	        	 for (int i1 = 0; i1 < headersArray.length; i1++) {
	        		 
	        	     column = table1.getColumnModel().getColumn(i1);
	        	     if(i1>4) {
		        	     for (int m = 0; m < workCalend.size(); m++) {
		        	    	 if(headersArray[i1].equals(Integer.toString(workCalend.get(m).getDay().getDate()))) {
		        	    	 if(workCalend.get(m).getDayType() == 1) {
		        	    		 column.setCellRenderer(new TableRendererRed() );
		        	    	 }else
		        	    	    	    	
		        	    	 
		        	    	 column.setCellRenderer(new TableRendererGreen() );
		        	     }
		        	     }
	        	     }
	        	     
	        	     
	        	     else if (i1 < 5) {
	        	         column.setPreferredWidth(400); 
	        	     } else {
	        	         column.setPreferredWidth(50);
	        	     }
	        	 }
	        	 JScrollPane scrollPane = new JScrollPane(table1);
	        	 
	        	 monthTab.add(String.format("%s", monthRu[j]), scrollPane);
	         }
	        
	         tabsRight.addTab(departmentList.get(i).getDepartDesc(), 
	                          new ImageIcon("images/copy.png"), monthTab, "Нажмите " + i);
	     }
	     getContentPane().add(tabsRight);
	     setSize(1200, 400);
	     setVisible(true);
		
	}
	

}

class TableRendererGreen extends DefaultTableCellRenderer {
	Color lightGreen = new Color(105,255,102);
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
      Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
      
        c.setBackground(lightGreen);
      
      return c;
    }
    
}
    class TableRendererRed extends DefaultTableCellRenderer {
    	Color lightRed = new Color(255, 102,102);
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
          Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
          
            c.setBackground(lightRed);
          
          return c;
        }
  }
