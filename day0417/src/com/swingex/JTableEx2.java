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

		// 패널 추가
		Panel p = new Panel();
		// 텍스트 필드 추가
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(2);
		JTextField text4 = new JTextField(30);
		// 버튼
		JButton button1 = new JButton("Add");
		JButton button2 = new JButton("Delete");
		JButton button3 = new JButton("PrintOut");
		// 라벨
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

		// 추가
		//해당 클래스에서 생성자 함수를 만들었고, 매개 변수를 지정을 해 줬다면 다른 클래스에서 아래와 같이 해당 매개 변수를 사용할 수 있다.
		button1.addActionListener(new AddActionListener(table, text1, text2, text3, text4));
		button2.addActionListener(new RemoveActionListener(table));
		button3.addActionListener(new PrintActionListener(table));

		f.setSize(1000, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
