package Inputoutput;

// ��ĳ�� ���� �׻� �߰��ؾ� ��
// s + ��Ʈ�� �����̽� ��ĳ�� �����
import java.util.Scanner;
import java.util.*;
import java.io.*; 

public class ScannerTest {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		 // ��ĳ�� Ŭ������ �ν��Ͻ��� �����Ѵ�.
		 // ���⼭ �ν��Ͻ��� sx �� �ǹ���.
		  Scanner sx = new Scanner(System.in);
	
		//sx. ������ ������ �پ��� ����
        //next, boolean, Byte �� ������ �ڷ����� �°� ����ϸ� ��.
	    // �����ʿ� �ִ� �ڷ����� ���ʺ��� ������ �� ��.
		int a, b;
		char op;
		String name;
		// c���� ������ ���� ���� ������ ���� �Է��� ����� ������
		//�ڹٿ����� ���� ������ �Է� ���ص� int a = sx.nextInt(); ó��
		//�տ� �ڷ����� �Է����ָ� �� �� ����
		
		System.out.print("ù���� ��:");
	    a = sx.nextInt();
	    System.out.println("������ �Է�:");
	   
	    // charAt(0); ->��Ģ���� �Է½� 4�� �� ù��°(�ε��������� ����°) �����ڸ� �ҷ����ڴٴ� ��.
	    // �̸� ȫ�浿 �Է½ô� charAt(0);�� �M.
	    op = sx.next().charAt(0);
	    System.out.println("�ι�° ��:");
	    
	    //nextInt(); �� ������ �� ���δٴ� ��
	    b = sx.nextInt();
	    
	    sx.nextLine();
	    //��� ���(�Է� ��)�� ���������� Ŀ��(��������)�� ������ ������
	    //�� ������ ����� ���ؼ� 
	    //int(����)������ string(������)���� �Ѿ �� �ѹ���  
	    // sx.nextLine();�� �Է��� �ش�. ���
	    
	    //����� ��
	    System.out.print("�̸� :");
	  
	  //nextLine(); �� ������ �� ���δٴ� �� ���ڿ� �ޱ�
	   // �Է��� '����' ��
	  	    name = sx.nextLine();
	    
	  	    
	    System.out.println();
	    // �̸� �Է� �ް� ����Ϸ��� printf�ʿ�
	    //

	    
	}

}
