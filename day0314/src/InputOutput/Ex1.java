package InputOutput;
import java.io.*;
//�� ���� �Է¹޾� ��Ģ������ ���ϰ� �� �� �����ڱ��� �Է��� �޾� ����� �� �ֵ��� �Ͻÿ�.

public class Ex1 {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		//���� ����
		BufferedReader c = new BufferedReader(
				 new InputStreamReader(System.in));

//�� ���� ������ �Է¹޾� ��Ģ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		// ���� ����
		int a, b, re =0;
		
		// ������� Ű����� �Է¹޴´�.
		System.out.print("ù��° ��:");
	   a = Integer.parseInt(c.readLine());
	 
	   System.out.print("������ ����:");
	   
	  char i = (char)System.in.read();
	
	  System.in.read();
	  System.in.read();
	   System.out.print("�ι�° ��:");
	   b = Integer.parseInt(c.readLine());
	
		
        re = a + b;    
        System.out.printf("%d %c %d = %d�Դϴ�.", a, i, b, re);
	  
        
        
       
	}

}
