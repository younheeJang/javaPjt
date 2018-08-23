package com.awtex;

import java.awt.*;

public class CheckBoxGroupEx extends Frame {

	GridLayout gl = new GridLayout(4, 1);

	Label la = new Label("your Gender?");
	CheckboxGroup cg = new CheckboxGroup();
	Checkbox man = new Checkbox("man", cg, true);
	Checkbox woman = new Checkbox("woman", cg, false);
	Button bt = new Button("Choice End");

	public CheckBoxGroupEx() {

		super("Radio Button");
		setLayout(gl);
		add(la);
		add(man);
		add(woman);
		add(bt);
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {

		new CheckBoxGroupEx();

	}
}
