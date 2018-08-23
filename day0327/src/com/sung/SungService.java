package com.sung;

import java.util.Scanner;

public class SungService {
	// 성적 처리를 위한 클래스

	// 클래스에서 객체형 배열
	private SungVO[] ss = new SungVO[50];
	// 최대 50명에 대한 데이터를 받을 수 있는 참조형 변수(배열(공간))을 선언

	// 인원수를 저장할 변수
	private int count;
	// 카운트 변수를 입력 클래스에서 해주지 않고 여기에서 해주었기 때문에 입력 클래스를 호출을 했어도
	// 그 클래스에서 선언했던 배열 안에 다시 카운트 변수를 넣어주는 과정이 필요하다.
	// 학생수만큼 뽑을 거라서. "ss[count] = new SungVO();"요런식으로.

	private Scanner sc = new Scanner(System.in);
	// 입출력을 위한 스캐너 레퍼런스 변수 선언

	// 자료 입력 메소드(함수)의 구현 및 계산
	public void input() {
		// 인원수를 50명으로 제한한다.
		if (count >= 50) {
			// 배열이기 때문에 50도 포함한다.
			System.out.println("인원 초과");
			return;

		}
		System.out.println("\n 자료 입력 ..........");

		String[] title = { "국어", "영어", "수학" };

		ss[count] = new SungVO();
		// 인원수만큼 메모리를 할당해 준다.

		System.out.print("이름 : ");

		ss[count].name = sc.next();//넥스트라인은 공백포함 [우리는 하나], 넥스트는 [우리는]까지만 토큰 구분 가부의 차이
		// 입력 클래스를 불러와서 그 폼 안에서 인원수(배열임)만큼 이름을 입력받는 처리 기호 구현
		// 다시그 값을 입력 클래스에 저장함
	//VO라는 클래스에 있는 name이라는 필드로 가서:

		
		
		// 인원수만큼 성적을 입력받아 총점 평균을 구함//포문 돌리자~ 스코어(과목대로) 포문 돌리면서 점수 받고 토탈까지 계산//
		for (int i = 0; i < ss[count].score.length; i++) {
			// 클래스 카운트 몇 명인지 받아서 점수를 받고 점수 배열의 길이

			// 타이틀
			System.out.print(title[i]+" :");

			// 성적 입력 받기
			ss[count].score[i] = sc.nextInt();
			// 카운트 배열 입력받은 성적에 과목명을 도입한다는 뜻

			// 총점 구하기
			ss[count].tot += ss[count].score[i];
			// 카운트 배열 총점은 카운트 배열 입력받은 과목의 성적이라는 뜻

		}

		ss[count].avg = ss[count].tot / 3;
		count++; // 인원수 증가 포문에서 되풀이되는 동안 각각의 과목수에 따른 점수입력받고 (총합, 평균)이 나옴
		System.out.println();
	}


	// 성적 데이터 출력
	public void write() {
		// 라이트 메소드를 활용한 출력단 만들기!

		System.out.println("\n .........전체 출력...........");
		
		ranking();
		
		for (int i = 0; i < count; i++) {
			System.out.println(ss[i].name + "\t");

			for (int j = 0; j < ss[i].score.length; j++) {
	
				// 성적 데어터의 수만큼 출력을 해준다.
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
		System.out.println("전체 출력");
	
	
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
	
	// 석차 구하기

	public void ranking() {

		for (int i = 0; i < count; i++) {
			ss[i].rank = 1;// 처음 들어온 데이터가 1등
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

	// 학점 구하기
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

	// 이름으로 검색
	
	public void search() {

		
		System.out.println("\n ..........자료 검색..........");
		System.out.print("검색 할 이름 : ");
		String name = sc.next();
		//VO에 있는 name과 비교
		
		
		for(int i = 0; i<count; i++) {
			
			
			
			if(ss[i].name.equals(name)) {
				//문자열 비교시 equals 메소드를 이용해 비교
				System.out.print(ss[i].name+"\t\t");
			for(int j =0; j<ss[i].score.length; j++) {
				System.out.printf("%5d", ss[i].score[j]);
				//이름 검색해서 이프 조건 충족시 점수(스코어 국 영 수)를 출력하겠다
				
				
			}//내부 for
			
			}//이프 끝
		System.out.println();
		}//외부 for
		
		
	}

}
