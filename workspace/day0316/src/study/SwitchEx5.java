package study;
import java.util.Scanner;
public class SwitchEx5 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String n;
		
		System.out.println("윤년 여부를 알고 싶은 년도를 입력하세요.");
	    int year = s.nextInt();
	    
	    if((year%4==0)&&!(year%100==0)||(year%400==0)) {   
	    
	    	n = "윤년";
	    	
	    }
	
	    else {
	    	n = "평년";
	    	
	    }
	    System.out.printf(year +"년도는 "+"\"%s\""+" 입니다.", n);
	    
	}

}
