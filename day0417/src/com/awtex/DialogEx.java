package com.awtex;

import java.awt.*;

public class DialogEx extends Frame {

	private Dialog d = new Dialog(this, " Service for Search", false);
	// 새로운 창을 만들 수 있는지의 여부를 가지고 모달이라고 하는데, 트루와 펄스로 나눠 표기한다.
	//트루값이면 모달이 있는 창을 생성하고, 펄스값이면 모달이 없는 창을 생성하게 된다.
	//모달의 뜻은, 추상적이라 지금 내가 확실하게 정의하기 어렵다......ㅜㅜ
	
	private Label dlb = new Label("Searching Password with Name and PrivateNum");
	private Label dlb1 = new Label("Name", Label.RIGHT);
	private Label dlb2 = new Label("PrivateNum", Label.RIGHT);
	private Label dlb3 = new Label("-", Label.CENTER);

	//텍스트 입력할 필드가 세 개 필요.  이름, 주민번호-주민번호 이렇게.
	private TextField dtf = new TextField(20);
	private TextField dtf1 = new TextField(6);
	private TextField dtf2 = new TextField(7);
	
	//버튼만들기
	private Button dbt = new Button("Confirmation");
	private Button dbt1 = new Button("Cancel");
	
	public DialogEx() {
		super("Communication Box");

		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setDialog();
		setSize(300, 200); 
		setVisible(true);
		
		d.setVisible(true);
	}

	private void setDialog() {
		
		d.setLayout(new BorderLayout());
		d.add("North", dlb);
		
		
		//라벨을 패널로 묶는다.
		Panel p1 = new Panel(new BorderLayout());

		
		Panel p2 = new Panel(new GridLayout(2, 1));
		p2.add(dlb1);
		p2.add(dlb2);
		p1.add("West", p2);

		
		
		
		
		Panel p3 = new Panel(new GridLayout(2, 1));
		Panel tPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
		tPanel.add(dtf); //이름
		p3.add(tPanel);
		
		
		
		Panel p4 = new Panel(new FlowLayout(FlowLayout.LEFT));
		p4.add(dtf1 ); //6자리
		p4.add(dlb3 ); // -
		p4.add(dtf2 );//7자리
		p3.add(p4);

		
		p1.add("Center", p3);
		d.add("Center", p1);
		
		
		
		Panel p = new Panel(new  FlowLayout());
		p.add(dbt);
		p.add(dbt1);
		d.add("South",p);
		//다이얼로그 박스까지 지워지는 효과가 있음
		WinEvent we = new WinEvent();
		d.addWindowListener(we);
		d.setSize(300, 130);
		d.setResizable(false); //대화창의 크기를 바꿀 수 없도록 펄스값을 넣으면 
	
	
	}

	public static void main(String[] args) {
		new DialogEx();
	}

}
