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
		// ���콺 ������ ��ư ������ ������ �˾�â �޴��� ����(��, ��, ��)
		super("PopUp");

		// �������� �޴��� �־��ش�
		jpm.add(jmi);
		// �͸�Ŭ������ ���� ����
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
		
		jpm.add(new JSeparator());// �и��� ��輱
		
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
		jtf.setEditable(false); // ������ ���ϰ� �ϱ� ���ؼ�
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
			if (e.isPopupTrigger()) {// �Ʒ��� ���� ��ǥ�� �����´�.
				jpm.show(e.getComponent(), e.getX(), e.getY());
			}
		}

	}

	public static void main(String[] args) {
		new JPopupEx();
	}

}
