package com.sung;

import java.util.Scanner;

public class SungMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int ch;// 메뉴 입력 받을 변수 선언

		SungService service = new SungService();
		// 성적 처리를 한 클래스를 레퍼런스(참조) 변수 선언

		while (true) {// 무한루프

			do {
				System.out.print("1.입력 2.검색 3.출력 4.종료");
				ch = sc.nextInt();

			} while (ch < 1 || ch > 4);
			// while조건문을 충족하지 않으면 멈춘다.

			switch (ch) {

			case 1:service.input(); break;
			case 2:service.search();break;
			case 3:service.write();break;
			case 4:System.exit(0);break;

			}// 스위치문 끝
		}// 와일문 끝

	}

}
