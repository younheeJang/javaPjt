package com.swingex;

import java.awt.*;
import javax.swing.*;

public class JTableEx {

	public static void main(String[] args) {

		JFrame f = new JFrame("information of student");
		f.setPreferredSize(new Dimension(300, 200));
		f.setLocation(500, 400);
		Container contentPane = f.getContentPane();

		String colNames[] = { "name", "age", "sex", "address" };

		Object data[][] = {

				{ "name1", "10", "man", "gangnamGu" }, 
				{ "name2", "11", "man", "gangnamGu" }, 
				{ "name3", "12", "man", "seochoGu" }, 
				{ "name4", "13", "woman", "nonhyeonDong" }, 
				{ "name5", "14", "man", "nonhyeon1Dong" }

		};

		JTable table = new JTable(data, colNames);
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);

		JButton button = new JButton("PrintOut");
		
		//다른 클래스에서 생성하여 만들어 놓았음. 이벤트 리스너
		button.addActionListener(new PrintActionListener(table));
		
		 
		contentPane.add(button, BorderLayout.SOUTH);
		
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
