package com.swingex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class JSlider1 extends JFrame {

	/*
	 * A component that lets the user graphically select a value by sliding a knob
	 * within a bounded interval. The knob is always positioned at the points that
	 * match integer values within the specified interval. The slider can show both
	 * major tick marks, and minor tick marks between the major ones. The number of
	 * values between the tick marks is controlled with setMajorTickSpacing and
	 * setMinorTickSpacing. Painting of tick marks is controlled by setPaintTicks.
	 * 
	 * Sliders can also print text labels at regular intervals (or at arbitrary
	 * locations) along the slider track. Painting of labels is controlled by
	 * setLabelTable and setPaintLabels.
	 * 
	 * For further information and examples see How to Use Sliders, a section in The
	 * Java Tutorial.
	 * 
	 */

	JSlider red = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider green = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider blue = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);

	JLabel rgb = new JLabel("RGB(0,0,0)", JLabel.CENTER);

	JPanel p1 = new JPanel(new BorderLayout());
	JPanel west = new JPanel(new GridLayout());
	JPanel cen = new JPanel(new GridLayout());
	JPanel p2 = new JPanel();

	public JSlider1() {
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

		JLabel jLabel = new JLabel("RED");
		JLabel jLabel1 = new JLabel("GREEN");
		JLabel jLabel2 = new JLabel("BLUE");

		jLabel.setForeground(Color.red);
		jLabel1.setForeground(Color.green);
		jLabel2.setForeground(Color.BLUE);

		west.add(jLabel);
		west.add(jLabel1);
		west.add(jLabel2);
		cen.add(red);
		cen.add(green);
		cen.add(blue);

	}

	public static void main(String[] args) {

		new JSlider1();
	}
}
