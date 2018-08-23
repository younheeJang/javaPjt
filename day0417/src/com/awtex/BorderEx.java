package com.awtex;

import java.awt.*;
import java.awt.event.*;

public class BorderEx extends Frame {

	// 라벨만들기
	Label a, b, c, d, e;

	public BorderEx() {

		super("보더레이아웃");
		// 윈 이벤트 클래스에서 창 닫기 기능을 구현해 놓았음
		WinEvent we = new WinEvent();
		addWindowListener(we);
		// 레이아웃을 설정한다.
		setLayout(new BorderLayout());

		a = new Label("상", Label.CENTER);
		b = new Label("하", Label.CENTER);
		c = new Label("좌", Label.CENTER);
		d = new Label("우", Label.CENTER);
		e = new Label("이동", Label.CENTER);

		// 전체적인 백그라운드의 색을 지정하고 각 방향의 색도 지정한다.
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
