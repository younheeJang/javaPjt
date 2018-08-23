package study;
import java.util.*;
public class aaaaaaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        String name = "";
		
		int kor=30;
		int eng=20;
		int math=10;
		int sum= kor+eng+math;
	    float  avg =(int)(sum/3);
		
		
		

		
	    System.out.println("이름:");
		name = sc.next();
		
		
		switch((int)avg/10) {
		
		    case 10 :
		    	System.out.println("당신의 학점은 A+입니다");
				break;
		   		
			case 9 :
			System.out.println("당신의 학점은 A입니다");
			break;
			
			case 8:
				System.out.println("당신의 학점은 B입니다");
				break;
			
			case 7:
				System.out.println("당신의 학점은 C입니다");
				break;
			
			case 6:
				System.out.println("당신의 학점은 D입니다");
				break;
			
			case 5: case 4: case 3: case 2: case 1: case 0:
				System.out.println("You've got failed!");
				break;
				
			default:
				
		}
		
	//	System.out.printf("%s님의 총점수는 %d이며 평균은 %d, 등급은 %s입니다.\n ", name, sum, avg, grade);
		
		
	}

}
