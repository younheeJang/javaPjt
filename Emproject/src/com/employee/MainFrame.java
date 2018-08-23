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

		// 프레임에 추가될 컴포넌트 초기화
		tp = new JTabbedPane();
		ap = new AddPane();
		fp = new FindPane();
		tpa = new TotalPane();

		// 탭에 추가
		tp.add("사원정보입력", ap);
		tp.add("사원정보조회", fp);
		tp.add("사원전체보기", tpa);

		// JTabbedPane을 프레임에 추가시킴
		getContentPane().add(tp);

		setTitle("사원관리프로그램");

		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		
		MainFrame mf = new MainFrame();
		mf.setSize(600, 600);
	}

}
