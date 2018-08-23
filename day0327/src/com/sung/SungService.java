package com.sung;

import java.util.Scanner;

public class SungService {
	// ���� ó���� ���� Ŭ����

	// Ŭ�������� ��ü�� �迭
	private SungVO[] ss = new SungVO[50];
	// �ִ� 50�� ���� �����͸� ���� �� �ִ� ������ ����(�迭(����))�� ����

	// �ο����� ������ ����
	private int count;
	// ī��Ʈ ������ �Է� Ŭ�������� ������ �ʰ� ���⿡�� ���־��� ������ �Է� Ŭ������ ȣ���� �߾
	// �� Ŭ�������� �����ߴ� �迭 �ȿ� �ٽ� ī��Ʈ ������ �־��ִ� ������ �ʿ��ϴ�.
	// �л�����ŭ ���� �Ŷ�. "ss[count] = new SungVO();"�䷱������.

	private Scanner sc = new Scanner(System.in);
	// ������� ���� ��ĳ�� ���۷��� ���� ����

	// �ڷ� �Է� �޼ҵ�(�Լ�)�� ���� �� ���
	public void input() {
		// �ο����� 50������ �����Ѵ�.
		if (count >= 50) {
			// �迭�̱� ������ 50�� �����Ѵ�.
			System.out.println("�ο� �ʰ�");
			return;

		}
		System.out.println("\n �ڷ� �Է� ..........");

		String[] title = { "����", "����", "����" };

		ss[count] = new SungVO();
		// �ο�����ŭ �޸𸮸� �Ҵ��� �ش�.

		System.out.print("�̸� : ");

		ss[count].name = sc.next();//�ؽ�Ʈ������ �������� [�츮�� �ϳ�], �ؽ�Ʈ�� [�츮��]������ ��ū ���� ������ ����
		// �Է� Ŭ������ �ҷ��ͼ� �� �� �ȿ��� �ο���(�迭��)��ŭ �̸��� �Է¹޴� ó�� ��ȣ ����
		// �ٽñ� ���� �Է� Ŭ������ ������
	//VO��� Ŭ������ �ִ� name�̶�� �ʵ�� ����:

		
		
		// �ο�����ŭ ������ �Է¹޾� ���� ����� ����//���� ������~ ���ھ�(������) ���� �����鼭 ���� �ް� ��Ż���� ���//
		for (int i = 0; i < ss[count].score.length; i++) {
			// Ŭ���� ī��Ʈ �� ������ �޾Ƽ� ������ �ް� ���� �迭�� ����

			// Ÿ��Ʋ
			System.out.print(title[i]+" :");

			// ���� �Է� �ޱ�
			ss[count].score[i] = sc.nextInt();
			// ī��Ʈ �迭 �Է¹��� ������ ������� �����Ѵٴ� ��

			// ���� ���ϱ�
			ss[count].tot += ss[count].score[i];
			// ī��Ʈ �迭 ������ ī��Ʈ �迭 �Է¹��� ������ �����̶�� ��

		}

		ss[count].avg = ss[count].tot / 3;
		count++; // �ο��� ���� �������� ��Ǯ�̵Ǵ� ���� ������ ������� ���� �����Է¹ް� (����, ���)�� ����
		System.out.println();
	}


	// ���� ������ ���
	public void write() {
		// ����Ʈ �޼ҵ带 Ȱ���� ��´� �����!

		System.out.println("\n .........��ü ���...........");
		
		ranking();
		
		for (int i = 0; i < count; i++) {
			System.out.println(ss[i].name + "\t");

			for (int j = 0; j < ss[i].score.length; j++) {
	
				// ���� �������� ����ŭ ����� ���ش�.
				System.out.printf("%5d", ss[i].score[j]);
			}
			System.out.printf("%5d%5d%5d", ss[i].tot, ss[i].avg, ss[i].rank);
			 System.out.print("\t");
			 
			 for(int j=0; j<ss[i].score.length; j++) {
				 System.out.printf("%5s", grade(ss[i].score[j]));
			 
			 }
				
			System.out.println();
		}

	}

	/*public void write() {
		System.out.println("��ü ���");
	
	
	ranking();

	
	 for(int i; i<count; i++){
	 
	 
	 System.out.print(ss[i].name+"\t\t");
	 for(int j=0; j<ss[i].score.length; j++) {
		 
		 System.out.printf("%5d", ss[i].score[j]);
	 
	 }
	 System.out.printf("%5d%5d%5d", ss[i].tot, ss[i].avg, ss[i].rank);
	 
	 System.out.print("\t\t");
	 
	 for(int j=0; j<ss[i].score.length; j++) {
		 System.out.printf("%5d", grade(ss[i].score[j]));
	 
	 }
		
	 System.out.println();
	 }
	 
}*/
	
	// ���� ���ϱ�

	public void ranking() {

		for (int i = 0; i < count; i++) {
			ss[i].rank = 1;// ó�� ���� �����Ͱ� 1��
		}
		for (int i = 0; i < count - 1; i++) {
			for (int j = i + 1; j < count; j++) {
				if (ss[i].tot > ss[j].tot)
					ss[j].rank++;
				else if (ss[i].tot < ss[j].tot)
					ss[i].rank++;

			}

		}

	}

	// ���� ���ϱ�
	public char grade(int s) {

		char c;

		switch (s / 10) {

		case 10:
		case 9: c='A'; break;
		case 8:c='B'; break;
		case 7:c='C'; break;
		case 6:c='D'; break;
		default:c='F'; break;
		}

		return c;
	}

	// �̸����� �˻�
	
	public void search() {

		
		System.out.println("\n ..........�ڷ� �˻�..........");
		System.out.print("�˻� �� �̸� : ");
		String name = sc.next();
		//VO�� �ִ� name�� ��
		
		
		for(int i = 0; i<count; i++) {
			
			
			
			if(ss[i].name.equals(name)) {
				//���ڿ� �񱳽� equals �޼ҵ带 �̿��� ��
				System.out.print(ss[i].name+"\t\t");
			for(int j =0; j<ss[i].score.length; j++) {
				System.out.printf("%5d", ss[i].score[j]);
				//�̸� �˻��ؼ� ���� ���� ������ ����(���ھ� �� �� ��)�� ����ϰڴ�
				
				
			}//���� for
			
			}//���� ��
		System.out.println();
		}//�ܺ� for
		
		
	}

}
