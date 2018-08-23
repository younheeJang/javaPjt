package com.swingex;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class JProgressEx extends JFrame implements ActionListener, Runnable {

	private JProgressBar jpb = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
	// �����׺� ����������, ���� ��������, ������ 0���� 100����

	private JButton jbt = new JButton("start");
	private JButton jbt1 = new JButton("stop");
	// ��ư ����

	public JProgressEx() {

		super("ProgressBar");

		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", new JLabel("This is JProgressBar......."));
		con.add("Center", jpb);
		jpb.setStringPainted(true);
		jpb.setString("0%");

		JPanel jp = new JPanel(new FlowLayout(FlowLayout.RIGHT));

		jp.add(jbt);
		jp.add(jbt1);

		jbt.addActionListener(this);
		jbt1.addActionListener(this);

		con.add("South", jp);
		setSize(300, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private boolean bb = true;
	private static int ii;

	@Override
	public void run() {

		if (ii == 100)// 100�� �Ǿ��� �� �ٽ� ������ ���ư����� ����
			ii = 0;
		for (int i = ii; i <= 100; i++) {
			if (!bb) // �޽��̸� �극��ũ
				break;

			try {
				Thread.sleep(50);

			} catch (InterruptedException ie) {
				System.out.println("error");
				ie.printStackTrace();
			}
			jpb.setValue(i);
			ii = i;
			jpb.setString(i + "%");

		}

		jbt.setEnabled(true);
		jbt1.setEnabled(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// �������� ���� ����

		if (e.getSource() == jbt) {
			bb = true;
			new Thread(this).start();
			jbt.setEnabled(false);
			jbt1.setEnabled(true);

		} else if (e.getSource() == jbt1) {
			bb = false;
			jbt.setEnabled(true);
			jbt1.setEnabled(false);

		}

	}

	public static void main(String[] args) {
		new JProgressEx();

	}

}
