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
		
		
		

		
	    System.out.println("�̸�:");
		name = sc.next();
		
		
		switch((int)avg/10) {
		
		    case 10 :
		    	System.out.println("����� ������ A+�Դϴ�");
				break;
		   		
			case 9 :
			System.out.println("����� ������ A�Դϴ�");
			break;
			
			case 8:
				System.out.println("����� ������ B�Դϴ�");
				break;
			
			case 7:
				System.out.println("����� ������ C�Դϴ�");
				break;
			
			case 6:
				System.out.println("����� ������ D�Դϴ�");
				break;
			
			case 5: case 4: case 3: case 2: case 1: case 0:
				System.out.println("You've got failed!");
				break;
				
			default:
				
		}
		
	//	System.out.printf("%s���� �������� %d�̸� ����� %d, ����� %s�Դϴ�.\n ", name, sum, avg, grade);
		
		
	}

}
