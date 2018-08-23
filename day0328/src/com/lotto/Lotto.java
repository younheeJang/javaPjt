package com.lotto;

import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;
//============================================================
public class Lotto {

	private Scanner sc = new Scanner(System.in);

	private int num[]; // 로또 번호

	public Lotto() {
		/*
		 * 생산자 함수이며, 목적은 멤버 필드의 초기화를 목적으로 한다.
		 */
		num = new int[6];

	}
//=============================================================
	public void randNum() {
		// 랜덤 레퍼런스 변수
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {

			num[i] = rand.nextInt(45) + 1;// 0~44
			// 1~45까지의 랜덤값

			for (int j = 0; j < i; j++) {

				if (num[i] == num[j]) {
					i--;
					break;
				}
			}

		}

	}

	// 번호 정렬
	public void sorting() {
		Arrays.sort(num);
	}

	// 출력
	public void write() {
		sorting();// 정렬된 수를 가져와서 출력해야 하기 때문에 정렬 메소드를 출력 메소드로 불러온다.
		for (int n : num)
			System.out.printf("%4d", n);

		System.out.println();
	}

	//로또 번호 시작

	public void LottoStart() {
		int n;
		do{
			
		System.out.print("로또 구매 개수 입력:(1~5):");	
	n= sc.nextInt();
		}while(n<1||n>5);
		//구매개수만큼 출력한다.
		for(int i=1; i<=n; i++) {
		randNum(); //입력
			System.out.print(i+"번째:");
			write();//출력
		}
		
		
	} 
}
