package Solving;

import java.util.Scanner;

public class monthday {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		//boolean run = true;
		int month;
        int year = 2018;
        int days = 0;
   
        System.out.print("월의 입력");
        month = s.nextInt();

      //  while(run) {
        
        switch(month) {
         
        case 1: case 3:  case 5:  case 7:  case 8:  case 10:
        	days = 30;
        	break;
        	
        case 12:
        	days = 31;
        	break;
        case 4: case 6: case 9:
        	days = 30;
        	break;
        	
        	
        case 11:
        	days = 30;
        	break;
        	
        case 2:
        	if((year%4==0)&&(year%100!=0)||(year%400==0)) {
        		days=29;
        	}else {
        		days=28;
        	}
        	break;
        	
        	
        	default : 
        	System.out.println("월이 잘못 입력되었습니다.");	
        	break;
        	
        }
        
       
	System.out.println(days);
       // }
        
	}

}
