package com.inner;

import java.awt.TextField;
import java.awt.*;
import java.awt.event.*;

public class ActionEventEx extends Frame implements ActionListener {

	private TextField tf = new TextField(10);

	public ActionEventEx() {

		super("�׼��̺�Ʈ");

		setLayout(new FlowLayout());
		add(tf);
		tf.addActionListener(this);

		setSize(300, 200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==tf) {
			
			String imsi = tf.getText();
			System.out.println("�޽���:"+imsi);
			tf.setText("");
			
		}

	}

	public static void main(String[] args) {
		
		new   ActionEventEx ();
		
		
		
		
	}
	
	
}
