package com.awtex;
import java.awt.*;
public class LabelEx extends Frame {
	Label la1, la2, la3, la4;
	Font f1;
	Font f2;
	public LabelEx() {
		super("라벨 ");
		f1 = new Font("굴림체", Font.BOLD, 20);
		f2 = new Font("바탕체", Font.ITALIC, 25);
		la1 = new Label("안녕하세요");
		la2 = new Label("홍길동입니다.", Label.CENTER);		
		la3 = new Label("홍길동입니다.", Label.RIGHT);			
		la4 = new Label("홍길동입니다.");	
		setLayout(new GridLayout(4, 2));
		
		//1개짜리 배열이 4개 있다. 5(가로와 가로 사이의 띄어쓰기), 5(세로와 세로 사이의 띄어쓰기)
		//(4, 1, 5, 5)
		la1.setFont(f1);
		la2.setFont(f2);
		la3.setFont(f2);
		la4.setFont(f1);

		add(la1); add(la2);	add(la3);add(la4);
		la1.setForeground(Color.CYAN);
		la1.setBackground(Color.red);
		la2.setBackground(Color.blue);
		la3.setBackground(Color.green);
		la4.setBackground(Color.pink);
		WinEvent we = new WinEvent();
		addWindowListener(we);
 		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new 	LabelEx();
		
		 
	}

}
