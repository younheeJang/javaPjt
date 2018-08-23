package study;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int year, month, day = 0 ;
		
		System.out.println("달의 일수를 알고 싶은 년도를 입력하세요.");
	    year = s.nextInt();
		
		System.out.println("달의 일수를 알고 싶은 달을 입력하세요.");
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
			System.out.println("달을 잘못 입력하셨습니다.");
		
		}
		
	  System.out.println(year +"년도의 "+month + "월의 날수는" + day +"입니다.");
		
		
	}

}
