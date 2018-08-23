package forex1;
// 숫자하나만 받아서 단을 입력한 다음 구구단을 출력하는 프로그램

import java.util.Scanner;

public class forex1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
	/*	int dan = 0;
		System.out.println("========= 구구단 =========");
		System.out.print("원하는 단을 입력:");
		dan = sc.nextInt();
		for(int i = 1; i <=9; i++) {
			System.out.printf("%d*%d = %d\n", dan, i, dan*i);
			

		}
		*/
	
		
		for(int i = 1; i<=3; i++) {
			for(int dan = 1; dan<=9; dan++) {
				
				System.out.printf("%d*%d=%d\n", i, dan, i*dan );
				
			}
			
		}
		
		
		
	}

}
