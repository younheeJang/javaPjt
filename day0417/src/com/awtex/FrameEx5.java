package com.awtex;

import java.awt.*;
import java.awt.event.*;

public class FrameEx5 extends Frame {

	public FrameEx5() {

		super("�ټ���° ������");

		addWindowListener(new WindowAdapter() {

			@Override

			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);

			}

		});

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FrameEx5();
	}

}
