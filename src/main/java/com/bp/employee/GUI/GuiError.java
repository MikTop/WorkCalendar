package com.bp.employee.GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiError extends JFrame{

	JPanel panel = new JPanel();
	
	public GuiError() {
		super("Ошибка БД");
		
		JPanel panel = new JPanel();
		JLabel label  = new JLabel("Ошибка связи с БД");
		panel.add(label);
		getContentPane().add(panel);
	     setSize(300, 300);
	     setVisible(true);
	}
}
