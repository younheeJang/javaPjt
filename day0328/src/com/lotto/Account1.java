package com.lotto;

import java.util.Scanner;

public class Account1 {

	Scanner sc = new Scanner(System.in);

	String name;
	String account;

	private String password = "1234";

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	// 계좌생성 메소드

	public void input() {

		

	}

	// =========================================================
	// 입력 출력 잔고 종료를 처리 및 출력
	public void process() {

		int withdraw;
		int deposit;
		int balance = 0;
		int i;
		
		System.out.println("성함을 입력하세요");
		name = sc.nextLine();
		
		
		do {
			System.out.println();
			System.out.println("원하는 프로세스를 입력하세요" + "\n");

			System.out.println("==============================================");
			System.out.println("1.계좌생성 || 2.계좌목록 || 3.입금 || 4.출금 || 5.잔고 || 0.종료");
			System.out.println("==============================================" + "\n");
			i = sc.nextInt();

		if(i==1) {

				System.out.println("안녕하세요" + name + "님!");
				System.out.println("===============================");
				System.out.print("계좌 번호를 입력하세요:");
				account = sc.next();
				System.out.print("\n초기 입금액을 입력하세요:");
				deposit = sc.nextInt();
				balance += deposit;
				System.out.println("==============");
				System.out.println("계좌 생성");
				System.out.println("==============");
				System.out.print("이름:"+name +"\n"+"계좌번호:"+ account);
				System.out.print("\n계좌가 생성되었습니다.");
				System.out.println();
		}else if(i==2) {
			System.out.println("==============");
			System.out.println("계좌 목록");
			System.out.println("==============");
				System.out.println("\n===============================");
				System.out.print("계좌번호:"+account + "\n" +"이름:"+ name + "\n" +"초기입금액"+ balance+"\n");
				System.out.println("===============================");
				System.out.println();

		}

		else if(i==3) {
				System.out.println("안녕하세요" + name + "님!");
				System.out.println("===============================");
				System.out.print("입금할 금액을 입력하세요" + "\n");
				deposit = sc.nextInt();
				balance += deposit;
				System.out.println();

		}
		else if(i==4) {
				System.out.println("안녕하세요" + name + "님!");
				System.out.println("===============================");
				System.out.print("출금할 금액을 입력하세요" + "\n");
				withdraw = sc.nextInt();
				balance -= withdraw;
				System.out.println();

		}
		  else if(i==5) {
			  System.out.println("==============");
				System.out.println("잔고");
				System.out.println("==============");
				System.out.printf(name + "님의 잔고는 %d원 입니다.", balance);
				System.out.println();
				System.out.println();

		  }
		  else if(i==0) {
			  System.out.println("==============");
				System.out.println("종료");
				System.out.println("==============");
				System.out.println();

		  }

		} while (i !=0);
      //       System.out.println("프로그램 종료");
	}
}
