package study;
import java.io.*;
public class SwitchEx8 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		/*����ڷκ��� ������ ������ �Է¹޾� �Է¹��� ������ 2�� ������� 3�� �������,
		 * 2�� 3�� �������, 2�� 3�� ����� �ƴ����� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ��, BufferedReader�� if���� ������ �ۼ�
		 */
		
		BufferedReader a = new BufferedReader(
				 new InputStreamReader(System.in));
		
        
		String n;
		
		System.out.print("������ �Է��ϼ���.");
	    int num = Integer.parseInt(a.readLine());
		
	
	    if(num%2==0&&!(num%6==0)) {
	    	// n = "2�� ���";
	    	System.out.println("2�� ����Դϴ�.");
	    } else if (num%3==0&&!(num%6==0)){
	    	// n="3�� ���";
	    	System.out.println("3�� ����Դϴ�.");
	    } else if (num%6==0) {
	    	// n="2�� 3�� ���";			
	    	System.out.println("2�� 3�� ����Դϴ�.");
	    } else if (!(num%6==0)) {
	      System.out.println("2�� 3�� ����� �ƴմϴ�.");
	    	// n="2�� 3�� ����� �ƴϴ�.";
	    }
	 
	}

	
}
