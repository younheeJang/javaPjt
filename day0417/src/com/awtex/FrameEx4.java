package com.awtex;

import java.awt.*;
import java.awt.event.*;

public class FrameEx4 extends Frame {
	public FrameEx4() {

		super("네번째 프레임");
		addWindowListener(new WinEventEx());
		setSize(300, 200);
		setVisible(true);

	}

	class WinEventEx extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new FrameEx4();

	}

}
