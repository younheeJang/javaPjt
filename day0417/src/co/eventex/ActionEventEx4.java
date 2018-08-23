package co.eventex;

import java.awt.*;
import java.awt.event.*;

import com.awtex.WinEvent;

public class ActionEventEx4 extends Frame implements ActionListener {

	// 버튼 4개
	private Button[] bt = new Button[4];

	// 패널 4개

	private Panel[] pp = new Panel[4];
	// 컬러 4개
	private Color[] cc = { Color.red, Color.green, Color.BLUE, Color.YELLOW };
	// 레이아웃 -> 카드 레이아웃
	private CardLayout card = new CardLayout();

	private Panel pptop;

	public ActionEventEx4() {

		super("CardLayout");

		setLayout(new BorderLayout());
		Panel p = new Panel(new GridLayout(1, 4));
		for (int i = 0; i < bt.length; i++) {
			bt[i] = new Button(i + 1 + "번 버튼");
			bt[i].addActionListener(this);
			p.add(bt[i]);
		}

		add("North", p);
		pptop = new Panel(card);
		for (int i = 0; i < pp.length; i++) {
			pp[i] = new Panel();
			pp[i].setBackground(cc[i]);
			pptop.add("" + i, pp[i]);
		}

		
		add("Center", pptop);

		card.show(pptop, "0");// 두번째 숫자값의 의미는 인덱스 값임

		WinEvent we = new WinEvent();

		addWindowListener(we);
		setSize(300, 300);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < 4; i++) {
			if (e.getSource() == bt[i]) {
				card.show(pptop, "" + i);
			}
		}

	}

	public static void main(String[] args) {

		new ActionEventEx4();
	}
}
