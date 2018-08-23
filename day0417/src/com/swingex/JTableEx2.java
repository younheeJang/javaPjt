package com.swingex;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class JTableEx2 {

	public static void main(String[] args) {

		JFrame f = new JFrame("information of student");
		f.setPreferredSize(new Dimension(300, 200));
		f.setLocation(500, 400);
		Container contentPane = f.getContentPane();

		String colNames[] = { "name", "age", "sex", "address" };

		DefaultTableModel model = new DefaultTableModel(colNames, 0);

		JTable table = new JTable(model);

		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);

		// �г� �߰�
		Panel p = new Panel();
		// �ؽ�Ʈ �ʵ� �߰�
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(2);
		JTextField text4 = new JTextField(30);
		// ��ư
		JButton button1 = new JButton("Add");
		JButton button2 = new JButton("Delete");
		JButton button3 = new JButton("PrintOut");
		// ��
		p.add(new JLabel("name"));
		p.add(text1);
		p.add(new JLabel("age"));
		p.add(text2);
		p.add(new JLabel("sex"));
		p.add(text3);
		p.add(new JLabel("address"));
		p.add(text4);

		p.add(button1);
		p.add(button2);
		p.add(button3);
		contentPane.add(p, BorderLayout.SOUTH);

		// �߰�
		//�ش� Ŭ�������� ������ �Լ��� �������, �Ű� ������ ������ �� ��ٸ� �ٸ� Ŭ�������� �Ʒ��� ���� �ش� �Ű� ������ ����� �� �ִ�.
		button1.addActionListener(new AddActionListener(table, text1, text2, text3, text4));
		button2.addActionListener(new RemoveActionListener(table));
		button3.addActionListener(new PrintActionListener(table));

		f.setSize(1000, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
