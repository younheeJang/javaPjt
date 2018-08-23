package com.awtex;

import java.awt.*;
import java.awt.event.*;

public class BorderEx extends Frame {

	// �󺧸����
	Label a, b, c, d, e;

	public BorderEx() {

		super("�������̾ƿ�");
		// �� �̺�Ʈ Ŭ�������� â �ݱ� ����� ������ ������
		WinEvent we = new WinEvent();
		addWindowListener(we);
		// ���̾ƿ��� �����Ѵ�.
		setLayout(new BorderLayout());

		a = new Label("��", Label.CENTER);
		b = new Label("��", Label.CENTER);
		c = new Label("��", Label.CENTER);
		d = new Label("��", Label.CENTER);
		e = new Label("�̵�", Label.CENTER);

		// ��ü���� ��׶����� ���� �����ϰ� �� ������ ���� �����Ѵ�.
		setBackground(Color.yellow);
		a.setBackground(Color.gray);
		b.setBackground(Color.MAGENTA);
		c.setBackground(Color.orange);
		d.setBackground(Color.LIGHT_GRAY);
		e.setBackground(Color.blue);

		a.setForeground(Color.white);
		b.setForeground(Color.white);
		c.setForeground(Color.white);
		d.setForeground(Color.white);
		e.setForeground(Color.white);

		add("North", a);
		add("South", b);
		add(c, BorderLayout.WEST);
		add(d, BorderLayout.EAST);
		add("Center", e);

		setLocation(300, 300);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {

		new BorderEx();

	}

}
