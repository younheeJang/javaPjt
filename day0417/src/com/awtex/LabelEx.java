package com.awtex;
import java.awt.*;
public class LabelEx extends Frame {
	Label la1, la2, la3, la4;
	Font f1;
	Font f2;
	public LabelEx() {
		super("�� ");
		f1 = new Font("����ü", Font.BOLD, 20);
		f2 = new Font("����ü", Font.ITALIC, 25);
		la1 = new Label("�ȳ��ϼ���");
		la2 = new Label("ȫ�浿�Դϴ�.", Label.CENTER);		
		la3 = new Label("ȫ�浿�Դϴ�.", Label.RIGHT);			
		la4 = new Label("ȫ�浿�Դϴ�.");	
		setLayout(new GridLayout(4, 2));
		
		//1��¥�� �迭�� 4�� �ִ�. 5(���ο� ���� ������ ����), 5(���ο� ���� ������ ����)
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
