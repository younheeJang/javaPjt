package InputOutput;
import java.io.*;

public class Ex {

/*
 * ���� �� ���� ������ �Է¹޾� ��Ģ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ���� : result
 * 
 * 
 */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//���� ����
				BufferedReader br = new BufferedReader(
						 new InputStreamReader(System.in));
	
	   //�� ���� ������ �Է¹޾� ��Ģ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
				
				// ���� ����
				int sum, sub, divide, times, num1, num2, num= 0, num4 = 0, num5=0, num6=0, num7=0, num8=0;
				
				System.out.print("ù��° ��:");
			    num1 = Integer.parseInt(br.readLine());
			    System.out.print("�ι�° ��:");
			    num2 = Integer.parseInt(br.readLine());
			    
			    sum = num1 + num2;
			    System.out.println("�� ���� ���� "+sum+"�Դϴ�.");
			    
			    System.out.print("ù��° ��:");
			    num7 = Integer.parseInt(br.readLine());
			    System.out.print("�ι�° ��:");
			    num8 = Integer.parseInt(br.readLine());
			    
			    sub = num7 - num8;
			    System.out.println("�� ���� �� ���� "+sub+"�Դϴ�.");
			    
			    System.out.print("ù��° ��:");
			    num = Integer.parseInt(br.readLine());
			    System.out.print("�ι�° ��:");
			    num4 = Integer.parseInt(br.readLine());
			    
			    divide = num/num4;
			    System.out.println("�� ���� ���� ���� "+divide+"�Դϴ�.");
			    
			    System.out.print("ù��° ��:");
			    num5 = Integer.parseInt(br.readLine());
			    System.out.print("�ι�° ��:");
			    num6 = Integer.parseInt(br.readLine());
			    
			    times = num5*num6;
			    System.out.println("�� ���� ���� ���� "+times+"�Դϴ�.");
			    
			    		
		
	}

}
