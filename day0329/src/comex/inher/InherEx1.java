package comex.inher;

import java.io.*;

public class InherEx1 extends SuperEx1 {

	public InherEx1() {
		// TODO Auto-generated constructor stub
		System.out.println("����� sub Ŭ����");
	}

	public void circle() throws IOException {
		int r = 10;
		super.area = r * r * 3.14;
		write("��:");

	}

	public void rect() throws IOException {
		int w = 20, h = 15;
		area = w * h;
		write("�簢��:");
	}
//�ڹ��� Ŭ������ ���� ����� �ȵȴ�
	public static void main(String[] args) throws IOException {

		InherEx1 r = new InherEx1();
		r.circle();
		r.rect();

	}

}
