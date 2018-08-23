package co.eventex;

import java.awt.*;
import java.awt.event.*;

import com.awtex.WinEvent;

public class KeyEventEx extends Frame implements KeyListener {

	Label la = new Label("Social Number :", Label.RIGHT);
	Label la1 = new Label("-", Label.CENTER);

	TextField jumin1 = new TextField(10);
	TextField jumin2 = new TextField(10);

	Button bt = new Button("confirm");

	public KeyEventEx() {
		super("Key Event");
		setForm(); // 아래의 메소드를 생성자에서 호출
		jumin1.addKeyListener(this);
		jumin2.addKeyListener(this);

		WinEvent we = new WinEvent();
		addWindowListener(we);
		// setSize(400, 100);
		pack(); // 창의 기능을 알아서 조절하도록 해 주는 기능을 가짐
		setVisible(true);

	}

	// 메소드 구현
	public void setForm() {
		setLayout(new BorderLayout());
		add("West", la);
		// 왼쪽으로 방향을 설정해준다
		Panel p = new Panel(new FlowLayout(FlowLayout.LEFT));
		p.add("West", jumin1);
		p.add("Center", la1);
		p.add("East", jumin2);
		add("Center", p);
		Panel p1 = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(bt);
		add("South", p1);

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 키를 눌렀다가 놓았을 때
		if (e.getSource() == jumin1) {

			if(jumin1.getText().trim().length() == 6)
				jumin2.requestFocus();//지정된 여섯자리 숫자를 넘으면 자동으로 다음으로 넘어가도록 해 줌
		}

		if (e.getSource() == jumin2) {
			if(jumin2.getText().trim().length() == 7) {
				bt.requestFocus();
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// 키가 눌렸다가 떼어졌을 때

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// 키가 같이 눌리거나 기능키와 같이 누를 때
	}

	public static void main(String[] args) {
		new KeyEventEx();
	}
}
