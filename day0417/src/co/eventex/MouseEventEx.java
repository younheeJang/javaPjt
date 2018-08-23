package co.eventex;

import java.awt.*;
import java.awt.event.*;

import com.awtex.WinEvent;

public class MouseEventEx extends Frame implements MouseListener {

	private Button bt = new Button("Confirm");
	private Button bt1 = new Button("Cancel");

	public MouseEventEx() {

		super(" MouseEvent");

		setLayout(new FlowLayout());

		add(bt);
		add(bt1);

		bt.addMouseListener(this);
		bt1.addMouseListener(this);

		WinEvent we = new WinEvent();

		addWindowListener(we);
		setSize(300, 300);
		setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == bt)
			System.out.println("Ȯ�ι�ư");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == bt || e.getSource() == bt1)
			System.out.println("���콺�� ��ư ���� �ö���");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == bt || e.getSource() == bt1)
			System.out.println("���콺�� ��ư ������ ��������");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == bt1)
			System.out.println("��ҹ�ư�� ������");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == bt1)
			System.out.println("��ҹ�ư�� �����ٰ� ������ ");
	}

	public static void main(String[] args) {
		new MouseEventEx();
	}
}

