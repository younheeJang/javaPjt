package study;

import java.io.*;
public class SwitchEx4 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		//���� ����
		BufferedReader br = new BufferedReader(
				 new InputStreamReader(System.in));
       //���� ����
		int num;
		
		
		
		System.out.print("������ �Է��ϼ���.");
	    num = Integer.parseInt(br.readLine());
	    
	    String n = (num<0) ? "\"����\"" : ((num==0) ?"\"0\"" : "\"���\"")  ;
	    
	    System.out.printf("\n�Էµ� �� :" +num);
	    System.out.printf("\n\n%s �Դϴ�.", n);
		
	}

}
