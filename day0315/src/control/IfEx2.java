package control;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int i;
		
		
		System.out.print("���� �Է�:");
		i = sc.nextInt();
		
		String s = (i%2==0)? "¦��" : "Ȧ��";
				
		System.out.printf("����� �Է��� ��:"+"%d�� %s�Դϴ�. %n", i, s);
		
		
		
		
		/* a ;
		char b ;
		
		//if(���ǽ�) ? A:B
		//if(i % 2 == 0) ? System.out.println("¦��"); : System.out.println("¦��");
		 int num = (i > 0) ? 'A':'B';
				
				//System.out.println("���"); : System.out.println("����");
		*/
	}

}
