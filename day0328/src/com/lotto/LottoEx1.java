package com.lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 랜덤클래스를 이용하여 랜덤으로 숫자를 얻음
		Random rnd = new Random();
		// 변호를 저장할 변수를 배열로 선언
		int num[] = new int[6];

		int cnt;
		// 구매할 개수

		do {

			System.out.print("로또 구매 개수:");
			cnt = sc.nextInt();

		} while (cnt < 1 || cnt > 5);
		// ================================================Step1

		// for문 두 개
		for (int i = 0; i <= cnt; i++) {
			// 구매 개수 만큼 번호를 받는다

			// 번호는 배열로 되어 있으므로 초기값은 무조건 0부터 간다
			for (int j = 0; j < num.length; j++) {
				num[j] = rnd.nextInt(45) + 1;
				// 인덱스로 받앗으므로 0으로 시작하는 수의 초기값을 1로 잡아주기 위해 45+1을 설정한다

				// 중복제거

				for(int k=0; k<j; k++) {
					//포문 받으면서 이프 조건에 의해 바로바로 비교해서 같으면 번호를 받고 있는 배열인 제이로부터 중복된다고 판단된 수를 뺀다.
					if(num[j]==num[k]) {
						j--;
						break;
					}
				}
				
			}
			
		
			Arrays.sort(num);
			System.out.print("\n"+(i+1)+"번째:");
		//System.out.println();
		
		//로또 번호 출력
			for(int n:num) {
				
				System.out.printf("%4d", n);
			//System.out.println();
			}
		}

		//정렬함
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
	}

}
