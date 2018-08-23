package com.awtex;

import javax.swing.JFrame;
//스윙은 메소드를 따로 안 가져와도 된다.
public class FrameEx2 extends JFrame {

	public FrameEx2() {

		super("프레임 두번째");
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//닫고서 빠져나오는 메소드가 지원이 되기 때문에 따로 다른 클래스 파일을 만들어서 가져올 필요가 없다.

	}

	public static void main(String[] args) {
		new FrameEx2();
		/*JFrame f = new JFrame("프레임 두번째");
		f.setSize(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//닫고서 빠져나오는 메소드가 지원이 되기 때문에 따로 다른 클래스 파일을 만들어서 가져올 필요가 없다.
*/
		
		
		
	}
}
