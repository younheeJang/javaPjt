package com.sum;

import java.util.*;

public class Hap {

	// 입력

	private int su;// 입력 받은 수를 저장할 변수

	public void input() {
		Scanner scanner = new Scanner(System.in);

		do {

			System.out.print("정수 입력: ");// 입력하세요
			su = scanner.nextInt();// 입력 받기

		} while (su < 1 || su > 100);
		// 조건에 맞는 수가 나오면 다시 입력하게끔 1~100의 수만 입력 받으면 다음 메소드로 넘어
		// 가도록 처리

	}

	// 입력받은 수를 sum 메소드에 넣어서 연산함
	// 연산 및 처리
	public int sum() {

		int s = 0; // 결과를 저장할 변수

		// 10이 들어가면 10이 될 때까지 누적하며 합을 함
		for (int i = 1; i <= su; i++) {

			s += i;
		}

		return s;
	}

	// 출력

	public void write(int s) {
//sum()메소드에서 결과를 리턴받아 write()에서 인자값으로 받아서 처리한다.
		System.out.println("1~"+su+"까지의 합:"+s);
		
	}

}
