package com.swingex;

import java.awt.*;
import javax.swing.*;

public class DrawingPanel extends JPanel {

	int kor, eng, mat;

	@Override
	public void paint(Graphics g) {

		// �����ϰ� �����, �԰��� ��� ���� ���� ������ ���� ���� ��
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawLine(50, 250, 350, 250);// �� �޼ҵ��� ��ǥ ���� ����1 ����2 ����1 ����2�̹Ƿ� ����, ������ �׸� �� �ִ� ������
		// ������ �־��ٰ� �����ϸ� ��

		for (int cnt = 1; cnt < 11; cnt++) {

			g.drawString(cnt * 10 + " ", 25, 255 - 20 * cnt);
			g.drawLine(50, 250 - 20 * cnt, 350, 250 - 20 * cnt);
		}
		g.drawLine(50, 20, 50, 250);
		g.drawString("kor", 100, 270); // ��Ʈ�� ���� ���� ��ǥ ���� �ִ밪
		g.drawString("eng", 200, 270);
		g.drawString("mat", 300, 270);

		g.setColor(Color.pink);
		if (kor > 0)
			g.fillRect(110, 250 - kor * 2, 10, kor * 2);
		if (eng > 0)
			g.fillRect(210, 250 - eng* 2, 10, eng* 2);
		if (mat > 0)
			g.fillRect(310, 250 - mat * 2, 10, mat * 2);
		}
//���ڰ��� �޾ƿ� ���ֵ��� �޼ҵ忡 this�� ����� �Ű����� ó���� ��
	void setScores(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

}
