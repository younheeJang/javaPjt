package study;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int year, month, day = 0 ;
		
		System.out.println("���� �ϼ��� �˰� ���� �⵵�� �Է��ϼ���.");
	    year = s.nextInt();
		
		System.out.println("���� �ϼ��� �˰� ���� ���� �Է��ϼ���.");
		month = s.nextInt();
		
		switch(month) {
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 30;
		    break;
		    
		case 4: case 6: case 9: case 11:	
			day = 31;
			break;
		    
		case 2:
			
			if((year%4==0)&&!(year%100==0)||(year%400==0)) {
				
				day = 29;
			}
			else {
				day = 28;
			}	
			break;
		    
		default :
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
		
		}
		
	  System.out.println(year +"�⵵�� "+month + "���� ������" + day +"�Դϴ�.");
		
		
	}

}
