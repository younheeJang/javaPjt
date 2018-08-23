package com.swingex;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawActionListener implements ActionListener {

	JTextField text1, text2, text3;
	DrawingPanel drawingPanel;

	public DrawActionListener(JTextField text1, JTextField text2, JTextField text3, DrawingPanel drawingPanel) {

		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		this.drawingPanel = drawingPanel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		try {
			int kor = Integer.parseInt(text1.getText());
			int eng = Integer.parseInt(text2.getText());

			int mat = Integer.parseInt(text3.getText());

			drawingPanel.setScores(kor, eng, mat);
			drawingPanel.repaint();

		} catch (NumberFormatException e) {

			JOptionPane.showMessageDialog(drawingPanel, "�߸��� ���� �����Դϴ�.", " �����޽���", JOptionPane.ERROR_MESSAGE);
		}

	}

}
