package Solving;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	/*
	 * 소수를 저장할 변수를 만든다.
	 * 포문을 만들고 나눠지는 수 =2; 나눠지는 수<=소수를 구하려는 범위의 최대값; 나눠지는 수 ++
	 * 포문을 만들고 나누는 수 =1; 나누는 수 <= 나눠지는 수; 나누는 수 ++
	 * 이프문을 만들고 나누는 수와 나눠지는 수의 나머지가 0이면
	 * 소수를 저장한다.
	 * 
	 * 저장한 소수가 2라면 나눠지는 수를 출력한다.
	 */

	int x = 0;
	
	for(int a = 2; a <=1000; a++) {
		
		for(int b =1; b <=a; b++) {
			if(a%b==0) {
				
				
				x++;
				
			}
			
		}
		if(x==2) {
			
			System.out.println(a);
			
			
			
		}
	x = 0;
	
	}
	
	}
	

}
