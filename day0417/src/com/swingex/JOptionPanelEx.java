package com.swingex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JOptionPanelEx extends JFrame implements ActionListener {
	JButton b1, b2, b3, b4;
	String[] str = { "LOGIN", "MEMBERSHIPJOIN" };
	public JOptionPanelEx() {
		super("OptionPanel");
		setLayout(new FlowLayout());
		b1 = new JButton("MessageDialog");
		b2 = new JButton("ConfirmDialog");
		b3 = new JButton("InputDialog");
		b4 = new JButton("OptionDialog");
		add(b1); add(b2); add(b3); add(b4);
		setLocation(300, 200);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//버튼을 누를 때마다 동작할 수 있게끔 창이 하나씩 뜸. 이러한 기능은 제이옵션에서 지원하고 있음
		if(e.getSource()==b1) {
			JOptionPane.showMessageDialog(this, "MessageDialogBox", "Message", JOptionPane.INFORMATION_MESSAGE);
		}else if(e.getSource()==b2) {
			JOptionPane.showConfirmDialog(this, "ConfirmDialogBox", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
		}else if(e.getSource()==b3) {
			JOptionPane.showInputDialog(this, "InputDialogBox", "Input", JOptionPane.YES_NO_OPTION);
		}else if(e.getSource()==b4) {
		JOptionPane.showOptionDialog(this, "OptionDialogBox", "Option", JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, null, str, str[0]);
		}
	}
	public static void main(String[] args) {
		new JOptionPanelEx();
	}
}
