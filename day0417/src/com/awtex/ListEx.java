package com.awtex;

import java.awt.*;
import java.awt.event.*;

public class ListEx extends Frame {

	private Label lb = new Label("�ο����");
	private List li = new List(4, true);
	private Button bt = new Button("Ȯ��");
	private String[] name;

	public ListEx(String[] a) {

		super("����Ʈ ���");

		name = a;

		setLayout(new BorderLayout());

		for (int i = 0; i < name.length; i++) {

			li.add(name[i]);

		}

		add("North", lb);
		add("South", bt);
		add("Center", li);
		li.setFont(new Font("����ü", Font.BOLD, 30));

		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] ar) {
		new ListEx(ar);
	}
}
