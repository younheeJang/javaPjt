package quiz;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		
		int i ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("거꾸로 출력할 정수를 입력하세요>");
		i = sc.nextInt();
		
		do {
		System.out.print(i%10+" ");
		i = i/10;
		
		}while(i !=0);
		
	}

}
