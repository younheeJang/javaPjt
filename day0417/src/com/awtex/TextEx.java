package com.awtex;

import java.awt.*;
import java.awt.event.*;

public class TextEx extends Frame {

	private TextField tf = new TextField("����:");
	private TextArea ta = new TextArea("�޸�:", 10, 15);
	private Button bt = new Button("Ȯ��");
	private Label la = new Label("����");

	public TextEx() {

		super("�޸���");
		
		setLayout(new BorderLayout());
		add("North", tf);
		add("South", bt);
		add("West", la);
		add("Center", ta);

		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(400, 400);
		setVisible(true);

	}

	public static void main(String[] args) {
		new TextEx();
	}

}
