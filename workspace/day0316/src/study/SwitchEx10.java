package study;

import java.io.*;

public class SwitchEx10 {

	public static void main(String[] args)  throws IOException {
	
		BufferedReader br = new BufferedReader(
				 new InputStreamReader(System.in));
		
		 /* ����ڷκ��� ������ ���ĺ� �� ���ڸ� �Է¹޾�
		 * �̸� �Ǻ��Ͽ� ���ĺ��� ������ ��츸 ����� ����Ͻÿ�.
		 * ��, ��ҹ��ڸ� ��� ������ �� �ֵ��� �ۼ�
		 * ���� ���ĺ� �̿��� ���� ������ ������ ó���Ѵ�.
		 * 
		 */
		
   

       System.out.print("�� ������ ���ĺ��� �Է��ϼ���.");
     
       char asd  =(char)System.in.read();

       
	
		if ((asd>='a'&&asd<='z')||((asdf>='A'&&ASD<='Z'>)) {
			
			   if(asd == 'a'||asd == 'e'||asd == 'i'||asd == 'o'||asd == 'u') {
				   System.out.println(������ �½��ϴ�.);
			   } else if(asd == 'A'||asd == 'E'||asd == 'I'||asd == 'O'||asd == 'U' ) {
				   System.out.println(������ �½��ϴ�.);
			   }else {
				   System.out.println('������ �Է��ϼ���.'');
				  
				   return;
			   }
		}else {
			 System.out.println("���ĺ��� �Է��ϼ���.'');
		}
		
	}

}
