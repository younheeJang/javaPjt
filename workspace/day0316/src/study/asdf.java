package study;
import java.io.*;
public class asdf {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(
				 new InputStreamReader(System.in));
		
		System.out.print("���ĺ� �� ���ڸ� �Է��ϼ���.");
	    char asd = (char)System.in.read();
	    
       if((asd>='a'&&asd<='z')||(asd>='A'&&asd<='Z')) {
		
       if(asd == 'a'||asd == 'e'||asd == 'i'||asd == 'o'||asd == 'u') {
    	System.out.println("������ �½��ϴ�.");   
       }else if (asd == 'A'||asd == 'E'||asd == 'I'||asd == 'O'||asd == 'U'){
    	   System.out.println("������ �½��ϴ�.");
       }else
    	   System.out.println("���ĺ� ������ �Է��ϼ���.");
    	   return;
    	   
    	   
       }else {
    	   System.out.println("���ĺ��� �Է��ϼ���.");

       }
	
		
	}

}
