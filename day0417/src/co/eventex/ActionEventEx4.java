package co.eventex;

import java.awt.*;
import java.awt.event.*;

import com.awtex.WinEvent;

public class ActionEventEx4 extends Frame implements ActionListener {

	// ��ư 4��
	private Button[] bt = new Button[4];

	// �г� 4��

	private Panel[] pp = new Panel[4];
	// �÷� 4��
	private Color[] cc = { Color.red, Color.green, Color.BLUE, Color.YELLOW };
	// ���̾ƿ� -> ī�� ���̾ƿ�
	private CardLayout card = new CardLayout();

	private Panel pptop;

	public ActionEventEx4() {

		super("CardLayout");

		setLayout(new BorderLayout());
		Panel p = new Panel(new GridLayout(1, 4));
		for (int i = 0; i < bt.length; i++) {
			bt[i] = new Button(i + 1 + "�� ��ư");
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

		card.show(pptop, "0");// �ι�° ���ڰ��� �ǹ̴� �ε��� ����

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
