package com.swingex;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class JProgressEx extends JFrame implements ActionListener, Runnable {

	private JProgressBar jpb = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
	// 프라잉빗 고정값으로, 수평 방향으로, 범위는 0부터 100까지

	private JButton jbt = new JButton("start");
	private JButton jbt1 = new JButton("stop");
	// 버튼 생성

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

		if (ii == 100)// 100이 되었을 떄 다시 영으로 돌아가도록 설정
			ii = 0;
		for (int i = ii; i <= 100; i++) {
			if (!bb) // 펄스이면 브레이크
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

		// 스레드의 시작 구현

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
