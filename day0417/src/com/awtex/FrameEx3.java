package com.awtex;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

//����������ʸ� ���ø���Ʈ �޾� ������ â�� ����Ϸ��� ��� �޼ҵ带 �� ��ӹ޾ƾ߸� �Ѵ�.
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
		super("����° ������");
		addWindowListener(this);
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new FrameEx3();
	}

}
