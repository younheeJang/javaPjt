package co.eventex;

import java.awt.event.*;

import com.awtex.WinEvent;

import java.awt.*;

public class ActionEventEx2 extends Frame implements ActionListener {

	private Button bt1 = new Button("Confirmation");
	private Button bt2 = new Button("End");

	public ActionEventEx2() {

		super("ButtonEvent");

		setLayout(new FlowLayout());
		add(bt1); // 레이아웃에 추가
		add(bt2);

		bt1.addActionListener(this);
		bt2.addActionListener(this);
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 300);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bt1) {
			System.out.println("why did you push the button?");
		} else if (e.getSource() == bt2) {
			System.exit(0);
		}

	}

	public static void main(String[] args) {

		new ActionEventEx2();

	}

}
