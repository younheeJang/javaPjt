package study;

import java.util.*; // �Է¹��� �� ������ ��ĳ�� ����

public class Square {

	public static void main(String[] args) {
		
		// ��ĳ�� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		// ���� ����
		int base;
		int height;
		int area;
		
		// ó�� ���� ����
		
		// 1. base�� height�� �Է¹޴´�.
		System.out.print("�غ�:");
		base = sc.nextInt();
		System.out.print("����:");
		height = sc.nextInt();
		
		//   1.1.  base�� ��ȯ�Ѵ�.
		
		base = base + 7; 
		
		//   1.2.  height�� ��ȯ�Ѵ�.
		
		height = height * 3;
		
		//   1.3.  area�� ���Ѵ�.
		
		area = base * height;
	
		
		// 2. area�� ����Ѵ�.
		
		System.out.printf("%d\n", area);
		
		// 3. ������.
		
		
	}

}

