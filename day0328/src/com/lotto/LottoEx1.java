package com.lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// ����Ŭ������ �̿��Ͽ� �������� ���ڸ� ����
		Random rnd = new Random();
		// ��ȣ�� ������ ������ �迭�� ����
		int num[] = new int[6];

		int cnt;
		// ������ ����

		do {

			System.out.print("�ζ� ���� ����:");
			cnt = sc.nextInt();

		} while (cnt < 1 || cnt > 5);
		// ================================================Step1

		// for�� �� ��
		for (int i = 0; i <= cnt; i++) {
			// ���� ���� ��ŭ ��ȣ�� �޴´�

			// ��ȣ�� �迭�� �Ǿ� �����Ƿ� �ʱⰪ�� ������ 0���� ����
			for (int j = 0; j < num.length; j++) {
				num[j] = rnd.nextInt(45) + 1;
				// �ε����� �޾����Ƿ� 0���� �����ϴ� ���� �ʱⰪ�� 1�� ����ֱ� ���� 45+1�� �����Ѵ�

				// �ߺ�����

				for(int k=0; k<j; k++) {
					//���� �����鼭 ���� ���ǿ� ���� �ٷιٷ� ���ؼ� ������ ��ȣ�� �ް� �ִ� �迭�� ���̷κ��� �ߺ��ȴٰ� �Ǵܵ� ���� ����.
					if(num[j]==num[k]) {
						j--;
						break;
					}
				}
				
			}
			
		
			Arrays.sort(num);
			System.out.print("\n"+(i+1)+"��°:");
		//System.out.println();
		
		//�ζ� ��ȣ ���
			for(int n:num) {
				
				System.out.printf("%4d", n);
			//System.out.println();
			}
		}

		//������
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
	}

}
