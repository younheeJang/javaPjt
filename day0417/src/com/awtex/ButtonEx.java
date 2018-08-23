package com.awtex;

import java.awt.*;
import java.awt.event.*;

public class ButtonEx extends Frame{

	private String[] str = {
			"7","8","9","+", "4","5","6","-", 
			"1","2","3","*",	"0","C","=","/" };
	
	private Button bt[] = new Button [str.length];
	
	public ButtonEx() {
	super("버튼");
	setLayout(new GridLayout(4, 4, 10, 10));
	
	for(int i = 0; i <bt.length; i ++) {
		
		
		bt[i] = new Button(str[i]);
		bt[i].setFont(new Font("굴림체", Font.BOLD, 30));
		add(bt[i]);
		
	}
	//기본 세팅
	WinEvent we = new WinEvent();
	addWindowListener(we);
	setSize(400, 400);
	setVisible(true);
	
	}
	public static void main(String[] args) {

 new  ButtonEx ();		
	}
}
