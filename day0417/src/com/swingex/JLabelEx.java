package com.swingex;

import java.awt.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/*
 * 스윙 구현의 사 단계
 * 임포트.자바엑스.스윙.*;
 * 제이프레임 클래스 상속
 * 컴포넌트에 맞게 앞에 제이 이니셜 추가
 * 컨테이너 컨 = 디스. 겟컨틴트패인();
 */
/*
 * 이미지 추가 방법
 * new ImageIcon(이미지파일경로 및 이름);
 *  new ImageIcon("src/img/ic01.jpg");
 */

public class JLabelEx extends JFrame {

	private Icon icon = new ImageIcon("src/img/ico01.jpg");

	private JLabel jlib1 = new JLabel(icon);
	private JLabel jlib2 = new JLabel("Two", JLabel.CENTER);
	private JLabel jlib3 = new JLabel("Three", icon, SwingConstants.RIGHT);

	public JLabelEx() {

		super(" JLabel ");
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(3, 1));

		con.add(jlib1);
		con.add(jlib2);
		
		jlib2.setIcon(icon);

		con.add(jlib3);
	
		setSize(300, 200);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new JLabelEx();

	}

}
