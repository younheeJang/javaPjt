package control;

import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		//사용자로부터 이름과 국어, 영어, 수학 점수를 입력받아 합계, 평균, 등급을 처리하는 프로그램 작성
	
        //변수 설정
		
		String name = "";
		
		int kor;
		int eng;
		int math;
		int sum;
		int avg;
		char grade;
		
		//처리과정 작성
		
		/*1. 이름 및 각 과목 점수를 입력받는다.
		 *2. 등급을 정한다.
		 *     2.1. 합계를 구한다.
		 *     2.2. 평균을 구한다.
		 *     2.3. 등급을 정한다.
		 * 3. 이름,  합계와 평균 그리고 등급을 출력한다.
		 *     
		 */
	
		System.out.println("이름:");
		name = sc.next();
		System.out.print("국어 점수:");
		kor = sc.nextInt();
		System.out.print("영어 점수:");
		eng = sc.nextInt();
		System.out.print("수학 점수:");
		math = sc.nextInt();
		
	
		sum = kor + eng + math;
		avg = sum/3;
		
		if(avg>=90&&avg<=100) {
			grade = 'S';
		}
		else if(avg>=0&&avg<=89) {
			grade = 'B';
		}
		else if(avg>=70&&avg<=79) {
			grade = 'C';
		}
		else if(avg>=60&&avg<=69) {
			grade = 'C';
		}
		else {
			grade = 'F';
		}
		
		
		System.out.printf("%s님의 총점수는 %d이며 평균은 %d, 등급은 %s입니다.\n ", name, sum, avg, grade);
		
	}

}
