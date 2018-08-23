package com.swingex;

import java.awt.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/*
 * ���� ������ �� �ܰ�
 * ����Ʈ.�ڹٿ���.����.*;
 * ���������� Ŭ���� ���
 * ������Ʈ�� �°� �տ� ���� �̴ϼ� �߰�
 * �����̳� �� = ��. ����ƾƮ����();
 */
/*
 * �̹��� �߰� ���
 * new ImageIcon(�̹������ϰ�� �� �̸�);
 *  new ImageIcon("src/img/ic01.jpg");
 */

public class JLabelEx extends JFrame {

	private Icon icon = new ImageIcon("src/img/ico01.jpg");

	private JLabel jlib1 = new JLabel(icon);
	private JLabel jlib2 = new JLabel("Two", JLabel.CENTER);
	private JLabel jlib3 = new JLabel("Three", icon, SwingConstants.RIGHT);

	public JLabelEx() {

		super(" JLabel ");
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(3, 1));

		con.add(jlib1);
		con.add(jlib2);
		
		jlib2.setIcon(icon);

		con.add(jlib3);
	
		setSize(300, 200);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new JLabelEx();

	}

}
