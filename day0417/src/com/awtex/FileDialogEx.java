package com.awtex;

import java.awt.*;

public class FileDialogEx extends Frame {

	// ���̺��� �޼ҵ带 �̿��� ����

	FileDialog fd = new FileDialog(this, "save", FileDialog.SAVE);

	public FileDialogEx() {

		super("���� ��ȭ����");
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 300);
		fd.setVisible(true);
		
		System.out.println(fd.getFile());
		System.out.println(fd.getDirectory());
	}

	public static void main(String[] args) {
		new FileDialogEx();

	}
}
