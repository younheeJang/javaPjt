package study;
import java.io.*;
public class SwitchEx3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		//���� ����
		BufferedReader br = new BufferedReader(
				 new InputStreamReader(System.in));

		//����ڷκ��� ������ ������ �Է¹޾� �Է¹��� ������ ¦������ Ȧ�������� �����ϴ�
		//���α׷��� �ۼ��Ͻÿ�.
		//��, ���ǻ��׿����ڸ� �̿��Ͽ� ó���Ͻð�,
		//BufferedReader�� ó���Ͻÿ�
		
		// ��ũ��
		//final int DIVISION = 2;
		
		// ���� ����
		
		int num;
		
		//int even;
		//int odd;
		
      
		/*ó������
		 * 1. ����ڷκ��� ������ ������ �Է¹޴´�.
		 * 2. �Է¹��� ������ ¦������ Ȧ������ �����Ѵ�.
		 *    2.1. 
		 *    2.2. 
		 * 
		 * 3. ������.
		 * 
		 * 
		 */
		
		System.out.print("������ �Է��ϼ���.");
	    num = Integer.parseInt(br.readLine());
		
	    //remainder = num/DIVISION;
	    
	    String n = (num%2==0) ? "\"¦��\"" : "\"Ȧ��\""  ;
	    
	    System.out.printf("\n�Էµ� �� :" +num);
	    System.out.printf("\n\n%s �Դϴ�.", n);

	    
	}

}
