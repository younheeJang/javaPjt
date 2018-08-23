package com.swingex;

import java.awt.*;
import javax.swing.*;

public class GraphicEx {

	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("���� �׷���");

		
		
		f.setPreferredSize(new Dimension(400, 400));
		f.setLocation(500, 200);
		Container contentPane = f.getContentPane();
		

		JPanel controlPanel = new JPanel();
		JTextField text1 = new JTextField(3);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(3);
		JButton button1 = new JButton("�׷��� �׸���");
		
		DrawingPanel drawPanel = new DrawingPanel();
		contentPane.add(drawPanel, BorderLayout.CENTER);
		
		button1.addActionListener( new DrawActionListener(text1, text2, text3, drawPanel));
		
		
		controlPanel.add(new JLabel("��������"));
		controlPanel.add(text1);
	
		
		controlPanel.add(new JLabel("��������"));
		controlPanel.add(text2);
	
		
		controlPanel.add(new JLabel("��������"));
		controlPanel.add(text3);
	
		
		controlPanel.add(button1);
		contentPane.add(controlPanel, BorderLayout.SOUTH);
		
		
		f.setSize(500, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	
	}

	
}
