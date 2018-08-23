package com.awtex;

import java.awt.*;

public class FrameEx1 {

	public static void main(String[] args) {
		Frame f = new Frame("2D프로그래밍");

		WinEvent we = new WinEvent();

		f.addWindowListener(we);

		f.setSize(300, 200);

		f.setVisible(true);
	}

}
