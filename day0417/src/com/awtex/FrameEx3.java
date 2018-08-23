package com.awtex;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

//윈도우즈리스너를 임플리먼트 받아 윈도우 창을 사용하려면 모든 메소드를 다 상속받아야만 한다.
public class FrameEx3 extends Frame implements WindowListener {
	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	public FrameEx3() {
		super("세번째 프레임");
		addWindowListener(this);
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new FrameEx3();
	}

}
