package forex1;

import java.util.Scanner;

//import java.io,*;
public class DowhileEx3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		
		//�ο��Ϲ��� �޴� �̿��� �� ���
		int menu=0;
		do {
        System.out.println("1.ȸ������");
        System.out.println("2.ȸ����ȸ");
        System.out.println("3.ȸ��Ż��");
        System.out.println("0.���α׷�����");
        
        System.out.println("�޴��� �����ϼ���");
        menu=sc.nextInt();
        
      //  System.in.skip(2);
        
        
			
		}while(menu!=1&&menu!=2&&menu!=3&&menu!=0);
		System.out.println("����� ������ ����: "+menu);
		
		
	}

}
