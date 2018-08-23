package study;

import java.util.*; // 입력받을 게 있으면 스캐너 생성

public class Square {

	public static void main(String[] args) {
		
		// 스캐너 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// 변수 설정
		int base;
		int height;
		int area;
		
		// 처리 과정 정리
		
		// 1. base와 height를 입력받는다.
		System.out.print("밑변:");
		base = sc.nextInt();
		System.out.print("높이:");
		height = sc.nextInt();
		
		//   1.1.  base를 변환한다.
		
		base = base + 7; 
		
		//   1.2.  height을 변환한다.
		
		height = height * 3;
		
		//   1.3.  area를 구한다.
		
		area = base * height;
	
		
		// 2. area를 출력한다.
		
		System.out.printf("%d\n", area);
		
		// 3. 끝내다.
		
		
	}

}

