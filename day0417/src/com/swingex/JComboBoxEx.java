package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxEx extends JFrame {

	public JComboBoxEx() {

		super("ComboBox");
		setLayout(new FlowLayout());

		String[] citems = { "�뵷", "����" };

		JComboBox combo = new JComboBox(citems);
		add(combo);

		DefaultComboBoxModel cmodel =
				new DefaultComboBoxModel();
		
		cmodel.addElement("¥���");
		cmodel.addElement("ġŲ");
		cmodel.addElement("����");
		combo = new JComboBox();
		combo.setModel(cmodel); //�� �޼ҵ忡 ������ �߰����� Ȱ��
		add(combo);
		
		setBounds(300, 200, 300, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new JComboBoxEx();

	}

}
