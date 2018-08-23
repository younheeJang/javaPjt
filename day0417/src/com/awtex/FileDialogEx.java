package com.awtex;

import java.awt.*;

public class FileDialogEx extends Frame {

	// 세이브라는 메소드를 이용해 저장

	FileDialog fd = new FileDialog(this, "save", FileDialog.SAVE);

	public FileDialogEx() {

		super("파일 대화상자");
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
