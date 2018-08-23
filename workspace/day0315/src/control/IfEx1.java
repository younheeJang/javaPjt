package control;

import java.util.*;

public class IfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

		int i;
		
		System.out.print("수를 입력:");
		i = sc.nextInt();
		
		//조건문 안에 조건문 만들 수 있다.
	
	
		
		// if(조건문) 
		
		//i가 0보다 크다면{
		
		//i를 2로 나눈 나머지가 0이라면
		
		// 나머지가 0이 아니라면
		
		
		   // 0보다 작다면
		if(i > 0) {
			
		if(i%2 ==0) {
		
		 System.out.println("짝수입니다");
		 System.out.println("짝수입니다. 참 잘했어요 ^^");
			
		}
			
	
		else 
			System.out.println("홀수입니다.");
		
		}
	
		else {
			
			System.out.println("입력한 수는 0보다 작습니다.");
			System.out.println("다시 입력하세요.");
			
		}
	}

}
