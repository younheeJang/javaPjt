package com.swingex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class AddActionListener implements ActionListener {

	JTable table;
	JTextField text1, text2, text3, text4; 
	
	//생성자 함수에 매개 변수를 집어 넣어 줘야 함.
	public AddActionListener(JTable table, JTextField text1, JTextField text2, JTextField text3, JTextField text4) {
	this.table = table;
	this.text1 = text1;
	this.text2 = text2;
	this.text3 = text3;
	this.text4 = text4;
	
	
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
		String arr[] = new String[4];
		arr[0] = text1.getText();
		arr[1] = text2.getText();
		arr[2] = text3.getText();
		arr[3] = text4.getText();
	
	
	DefaultTableModel model = (DefaultTableModel)table.getModel();
	model.addRow(arr);
	
	}

}
