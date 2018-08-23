package com.swingex;


import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class PrintActionListener implements ActionListener {

	JTable table;
	
	public PrintActionListener(JTable table) {
	
	this.table = table; //생성자에서 인자값으로 넘겨준다.
	
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//모델을 가져옴
		TableModel model = table.getModel();
		
		//모델에서 행과 열을 가져옴
		int rowNum = model.getRowCount();
		int colNum = model.getColumnCount();
		
		//컬럼의 이름을 가져와서 출력
		for(int col = 0; col < colNum; col ++) {
			
			String colName = model.getColumnName(col);
			System.out.print(colName+"\t");
			
		}
		System.out.println();
		for(int row = 0; row < rowNum; row ++) {
			
			for(int col = 0; col < colNum; col ++) {
				Object obj = model.getValueAt(row, col);
				System.out.print(obj + "\t");
			}
		System.out.println();
		}
System.out.println("=============================================");
	}

}
