package com.awtex;

import javax.swing.JFrame;
//������ �޼ҵ带 ���� �� �����͵� �ȴ�.
public class FrameEx2 extends JFrame {

	public FrameEx2() {

		super("������ �ι�°");
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ݰ� ���������� �޼ҵ尡 ������ �Ǳ� ������ ���� �ٸ� Ŭ���� ������ ���� ������ �ʿ䰡 ����.

	}

	public static void main(String[] args) {
		new FrameEx2();
		/*JFrame f = new JFrame("������ �ι�°");
		f.setSize(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ݰ� ���������� �޼ҵ尡 ������ �Ǳ� ������ ���� �ٸ� Ŭ���� ������ ���� ������ �ʿ䰡 ����.
*/
		
		
		
	}
}
