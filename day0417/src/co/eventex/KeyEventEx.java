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
		setForm(); // �Ʒ��� �޼ҵ带 �����ڿ��� ȣ��
		jumin1.addKeyListener(this);
		jumin2.addKeyListener(this);

		WinEvent we = new WinEvent();
		addWindowListener(we);
		// setSize(400, 100);
		pack(); // â�� ����� �˾Ƽ� �����ϵ��� �� �ִ� ����� ����
		setVisible(true);

	}

	// �޼ҵ� ����
	public void setForm() {
		setLayout(new BorderLayout());
		add("West", la);
		// �������� ������ �������ش�
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
		// Ű�� �����ٰ� ������ ��
		if (e.getSource() == jumin1) {

			if(jumin1.getText().trim().length() == 6)
				jumin2.requestFocus();//������ �����ڸ� ���ڸ� ������ �ڵ����� �������� �Ѿ���� �� ��
		}

		if (e.getSource() == jumin2) {
			if(jumin2.getText().trim().length() == 7) {
				bt.requestFocus();
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// Ű�� ���ȴٰ� �������� ��

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Ű�� ���� �����ų� ���Ű�� ���� ���� ��
	}

	public static void main(String[] args) {
		new KeyEventEx();
	}
}
