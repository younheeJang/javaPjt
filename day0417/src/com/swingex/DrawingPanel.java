package com.swingex;

import java.awt.*;
import javax.swing.*;

public class DrawingPanel extends JPanel {

	int kor, eng, mat;

	@Override
	public void paint(Graphics g) {

		// 깨끗하게 지우고, 규격을 잡아 놓음 가로 세로의 폼을 가져 옴
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawLine(50, 250, 350, 250);// 이 메소드의 좌표 값은 엑스1 엑스2 와이1 와이2이므로 가로, 세로의 그릴 수 있는 범위를
		// 지정해 주었다고 이해하면 됌

		for (int cnt = 1; cnt < 11; cnt++) {

			g.drawString(cnt * 10 + " ", 25, 255 - 20 * cnt);
			g.drawLine(50, 250 - 20 * cnt, 350, 250 - 20 * cnt);
		}
		g.drawLine(50, 20, 50, 250);
		g.drawString("kor", 100, 270); // 스트링 위에 가로 좌표 세로 최대값
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
//인자값을 받아올 수있도록 메소드에 this를 사용해 매개값의 처리를 지
	void setScores(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

}
