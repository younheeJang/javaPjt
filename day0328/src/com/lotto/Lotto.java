package com.lotto;

import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;
//============================================================
public class Lotto {

	private Scanner sc = new Scanner(System.in);

	private int num[]; // �ζ� ��ȣ

	public Lotto() {
		/*
		 * ������ �Լ��̸�, ������ ��� �ʵ��� �ʱ�ȭ�� �������� �Ѵ�.
		 */
		num = new int[6];

	}
//=============================================================
	public void randNum() {
		// ���� ���۷��� ����
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {

			num[i] = rand.nextInt(45) + 1;// 0~44
			// 1~45������ ������

			for (int j = 0; j < i; j++) {

				if (num[i] == num[j]) {
					i--;
					break;
				}
			}

		}

	}

	// ��ȣ ����
	public void sorting() {
		Arrays.sort(num);
	}

	// ���
	public void write() {
		sorting();// ���ĵ� ���� �����ͼ� ����ؾ� �ϱ� ������ ���� �޼ҵ带 ��� �޼ҵ�� �ҷ��´�.
		for (int n : num)
			System.out.printf("%4d", n);

		System.out.println();
	}

	//�ζ� ��ȣ ����

	public void LottoStart() {
		int n;
		do{
			
		System.out.print("�ζ� ���� ���� �Է�:(1~5):");	
	n= sc.nextInt();
		}while(n<1||n>5);
		//���Ű�����ŭ ����Ѵ�.
		for(int i=1; i<=n; i++) {
		randNum(); //�Է�
			System.out.print(i+"��°:");
			write();//���
		}
		
		
	} 
}
