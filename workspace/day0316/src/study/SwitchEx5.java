package study;
import java.util.Scanner;
public class SwitchEx5 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String n;
		
		System.out.println("���� ���θ� �˰� ���� �⵵�� �Է��ϼ���.");
	    int year = s.nextInt();
	    
	    if((year%4==0)&&!(year%100==0)||(year%400==0)) {   
	    
	    	n = "����";
	    	
	    }
	
	    else {
	    	n = "���";
	    	
	    }
	    System.out.printf(year +"�⵵�� "+"\"%s\""+" �Դϴ�.", n);
	    
	}

}
