package control;

import java.util.*;

public class IfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

		int i;
		
		System.out.print("���� �Է�:");
		i = sc.nextInt();
		
		//���ǹ� �ȿ� ���ǹ� ���� �� �ִ�.
	
	
		
		// if(���ǹ�) 
		
		//i�� 0���� ũ�ٸ�{
		
		//i�� 2�� ���� �������� 0�̶��
		
		// �������� 0�� �ƴ϶��
		
		
		   // 0���� �۴ٸ�
		if(i > 0) {
			
		if(i%2 ==0) {
		
		 System.out.println("¦���Դϴ�");
		 System.out.println("¦���Դϴ�. �� ���߾�� ^^");
			
		}
			
	
		else 
			System.out.println("Ȧ���Դϴ�.");
		
		}
	
		else {
			
			System.out.println("�Է��� ���� 0���� �۽��ϴ�.");
			System.out.println("�ٽ� �Է��ϼ���.");
			
		}
	}

}
