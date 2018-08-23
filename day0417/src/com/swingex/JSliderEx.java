package com.swingex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderEx extends JFrame {

	JSlider red = new JSlider(JSlider.HORIZONTAL, 0, 255, 0); //(제이슬라이더.방향은 가로, 시작, 끝, 스타트위치); 
	JSlider green = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider blue = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);

	JLabel rgb = new JLabel("RGB(0,0,0)", JLabel.CENTER);

	JPanel p1 = new JPanel(new BorderLayout());
	JPanel west = new JPanel(new GridLayout(0, 1));
	JPanel cen = new JPanel(new GridLayout(0, 1));
	JPanel p2 = new JPanel();

	int r, g, b;

	public JSliderEx() {

		super("JSlider");

		red.setMajorTickSpacing(50);
		red.setMinorTickSpacing(5);
		red.setPaintTicks(true);
		red.setPaintLabels(true);

		green.setMajorTickSpacing(50);
		green.setMinorTickSpacing(5);
		green.setPaintTicks(true);
		green.setPaintLabels(true);

		blue.setMajorTickSpacing(50);
		blue.setMinorTickSpacing(5);
		blue.setPaintTicks(true);
		blue.setPaintLabels(true);

		JLabel rlabel = new JLabel("red");
		JLabel glabel = new JLabel("green");
		JLabel blabel = new JLabel("blue");

		rlabel.setForeground(Color.red);
		glabel.setForeground(Color.green);
		blabel.setForeground(Color.blue);

		rgb.setFont(new Font("돋움체", Font.BOLD, 30));

		west.add(rlabel);
		west.add(glabel);
		west.add(blabel);
		cen.add(red);
		cen.add(green);
		cen.add(blue);

		p1.add("West", west);
		p1.add("Center", cen);

		add("North", rgb);
		add("South", p1);
		add("Center", p2);
		setBounds(300, 200, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		red.addChangeListener(new Sevent());
		green.addChangeListener(new Sevent());
		blue.addChangeListener(new Sevent());
	}

	// 이벤트는 내부 클래스로 처리
	class Sevent implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {

			// JSlider를 가지고 소스를 만든다.
			JSlider source = (JSlider) e.getSource();
			if (e.getSource() == red) 
				r = source.getValue();
			if (e.getSource() == green) 
				g = source.getValue();
			if (e.getSource() == blue) 
				b= source.getValue();
			
			
				p2.setBackground(new Color(r, g, b));

				rgb.setText("RGB(" + r + "," + g + "," + b + ")"); 
			

		}

	}

	public static void main(String[] args) {
		new JSliderEx();
	}
}
