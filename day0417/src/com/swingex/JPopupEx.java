package com.swingex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPopupEx extends JFrame implements MouseListener {
	// The listener object created from that class
	// is then registered with a component using the component's addMouseListener
	// method.
	private JTextField jtf = new JTextField("None");
	private JPopupMenu jpm = new JPopupMenu();
	private JMenuItem jmi = new JMenuItem("Copy");
	private JMenuItem jmi1 = new JMenuItem("Cut");
	private JMenuItem jmi2 = new JMenuItem("Paste");

	public JPopupEx() {
		// 마우스 오른쪽 버튼 누르면 나오는 팝업창 메뉴들 설계(복, 붙, 잘)
		super("PopUp");

		// 아이템을 메뉴에 넣어준다
		jpm.add(jmi);
		// 익명클래스를 통한 구현
		jmi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf.setText("Copy");
				// System.out.println("Copy");

			}
		});

		jpm.add(jmi1);
		jmi1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf.setText("Cut");
				// System.out.println("Copy");

			}
		});
		
		jpm.add(new JSeparator());// 분리선 경계선
		
		jpm.add(jmi2);
		jmi2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf.setText("Paste");
				// System.out.println("Copy");
			}
		});
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", jtf);
		this.addMouseListener(this);

		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jtf.setEditable(false); // 편집을 못하게 하기 위해서
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// A mouse event is generated when the mouse is pressed, released clicked
		// (pressed and released).
		// A mouse event is also generated when the mouse cursor enters or leaves a
		// component.
		if (e.getSource() == this) {
			if (e.isPopupTrigger()) {// 아래와 같이 좌표를 가져온다.
				jpm.show(e.getComponent(), e.getX(), e.getY());
			}
		}

	}

	public static void main(String[] args) {
		new JPopupEx();
	}

}
