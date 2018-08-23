package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxEx extends JFrame {

	public JComboBoxEx() {

		super("ComboBox");
		setLayout(new FlowLayout());

		String[] citems = { "용돈", "월급" };

		JComboBox combo = new JComboBox(citems);
		add(combo);

		DefaultComboBoxModel cmodel =
				new DefaultComboBoxModel();
		
		cmodel.addElement("짜장면");
		cmodel.addElement("치킨");
		cmodel.addElement("피자");
		combo = new JComboBox();
		combo.setModel(cmodel); //이 메소드에 씨모델을 추가시켜 활용
		add(combo);
		
		setBounds(300, 200, 300, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new JComboBoxEx();

	}

}
