package com.swingex;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveActionListener implements ActionListener {

	JTable table;

	//������ �Լ��� �Ű� ������ ���� �־� ��� ��
	public RemoveActionListener(JTable table) {

		this.table = table;

		// �����ÿ��� �ο쿡�� �����Ͱ� ���� �� �ֵ��� �Ѵ�.

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ���õ� ��, �̶�� �� ����Ʈ�ο� �޼ҵ带 ����
		int row = table.getSelectedRow();
		if (row == -1)
			return;
		
		
		
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.removeRow(row); //�� ����Ʈ �ο��� �޼ҵ忡�� ��ȯ���� �ο츦 �� �޼ҵ忡�� ����
		
	}

}
