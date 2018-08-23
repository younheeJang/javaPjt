package com.awtex;

import java.awt.*;

public class CheckBoxEx extends Frame {

	private Label la = new Label("Favorite Fruit?");
	
	private Checkbox[] cb = {
			
			new Checkbox("banana"),
			new Checkbox("apple"),
			new Checkbox("strawberry"),
			new Checkbox("pineapple"),
	};
	
	private Button bt = new Button("Check End");
	
	public CheckBoxEx() {
		super("체크박스");
	
		setLayout(new GridLayout(6, 1));
		add(la);
		
		for(int i = 0; i <cb.length; i++) {
			add(cb[i]);
		}
		
		add(bt);
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new CheckBoxEx();

	}
}
