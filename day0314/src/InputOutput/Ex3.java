package InputOutput;
import java.io.*;
public class Ex3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//���� ����
				BufferedReader c = new BufferedReader(
						 new InputStreamReader(System.in));
				// ���� ����
				int a, b, result =0;
				// ������� Ű����� �Է¹޴´�.
				System.out.print("ù��° ��:");
			   a = Integer.parseInt(c.readLine());
			   System.out.print("�ι�° ��:");
			   b = Integer.parseInt(c.readLine());
			
			    result = a + b;    
		        System.out.println("�� ���� ����" +result+ "�Դϴ�. ");
			  
		        result = a - b;    
		        System.out.println("�� ���� ����" +result+ "�Դϴ�. ");
		       
		        result = a * b;    
		        System.out.println("�� ���� ����" +result+ "�Դϴ�. ");
		        
		        result = a / b;    
		        System.out.println("�� ���� ������" +result+ "�Դϴ�. ");
			    
	}

}
