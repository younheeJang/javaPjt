package forex1;
// �����ϳ��� �޾Ƽ� ���� �Է��� ���� �������� ����ϴ� ���α׷�

import java.util.Scanner;

public class forex1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
	/*	int dan = 0;
		System.out.println("========= ������ =========");
		System.out.print("���ϴ� ���� �Է�:");
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
