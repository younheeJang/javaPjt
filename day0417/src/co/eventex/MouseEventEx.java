package co.eventex;

import java.awt.*;
import java.awt.event.*;

import com.awtex.WinEvent;

public class MouseEventEx extends Frame implements MouseListener {

	private Button bt = new Button("Confirm");
	private Button bt1 = new Button("Cancel");

	public MouseEventEx() {

		super(" MouseEvent");

		setLayout(new FlowLayout());

		add(bt);
		add(bt1);

		bt.addMouseListener(this);
		bt1.addMouseListener(this);

		WinEvent we = new WinEvent();

		addWindowListener(we);
		setSize(300, 300);
		setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == bt)
			System.out.println("확인버튼");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == bt || e.getSource() == bt1)
			System.out.println("마우스가 버튼 위로 올라갔음");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == bt || e.getSource() == bt1)
			System.out.println("마우스가 버튼 위에서 내려왔음");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == bt1)
			System.out.println("취소버튼을 눌렀음");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == bt1)
			System.out.println("취소버튼을 눌렀다가 떼었음 ");
	}

	public static void main(String[] args) {
		new MouseEventEx();
	}
}

