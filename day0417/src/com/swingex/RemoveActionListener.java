package com.swingex;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveActionListener implements ActionListener {

	JTable table;

	//생성자 함수에 매개 변수를 집어 넣어 줘야 함
	public RemoveActionListener(JTable table) {

		this.table = table;

		// 삭제시에는 로우에서 데이터가 빠질 수 있도록 한다.

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 선택된 행, 이라는 겟 셀렉트로우 메소드를 선택
		int row = table.getSelectedRow();
		if (row == -1)
			return;
		
		
		
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.removeRow(row); //겟 셀렉트 로우의 메소드에서 반환받은 로우를 이 메소드에서 지움
		
	}

}
