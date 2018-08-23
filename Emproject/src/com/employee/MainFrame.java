package com.employee;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class MainFrame extends JFrame {

	private JTabbedPane tp;
	private AddPane ap;
	private FindPane fp;
	private TotalPane tpa;

	public MainFrame() {

		// �����ӿ� �߰��� ������Ʈ �ʱ�ȭ
		tp = new JTabbedPane();
		ap = new AddPane();
		fp = new FindPane();
		tpa = new TotalPane();

		// �ǿ� �߰�
		tp.add("��������Է�", ap);
		tp.add("���������ȸ", fp);
		tp.add("�����ü����", tpa);

		// JTabbedPane�� �����ӿ� �߰���Ŵ
		getContentPane().add(tp);

		setTitle("����������α׷�");

		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		
		MainFrame mf = new MainFrame();
		mf.setSize(600, 600);
	}

}
