package study;
import java.io.*;
public class SwitchEx9 {

	public static void main(String[] args) throws IOException{
	/*����ڷκ��� ������ ���� �� ���� �Է¹޾�
	 * �������������� ū �� ������ �����Ͻÿ�.
	 * ��, BufferedReader�� if���� ������ �ۼ�
	 * 16, 8, 21�Է¹�����
	 * 8, 16, 21������ ���;� ��
	 */
		BufferedReader a = new BufferedReader(
				 new InputStreamReader(System.in));
		
      int b, c, d, temp;
      
      System.out.print("ù��° ���� �Է��ϼ���.");
	   b = Integer.parseInt(a.readLine());
	    System.out.print("�ι�° ���� �Է��ϼ���.");
	   c = Integer.parseInt(a.readLine());
	    System.out.print("����° ���� �Է��ϼ���.");
	   d = Integer.parseInt(a.readLine());
		
	   if(b>c) {
		  /* temp = b;
		   b = c;
		   b = temp;*/
		  b=b^c;
		  c=c^b;
		  b=b^c;
	   } if(b>d) {
		  /* temp = b;
		   b = d;
		   d = temp;*/
		  b=b^d;
		  d=d^b;
		  b=b^d;
		   
	   } if(c>d) {
		  /* temp = c;
		   c = d;
		   d = temp;*/
		   c=c^d;
		   d=d^c;
		   c=c^d;
	   }
		
	   System.out.println("���� ��� : "+ b + "=>"+ c +"=>"+d);
	}

}
