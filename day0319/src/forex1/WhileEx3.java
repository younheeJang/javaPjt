package forex1;
import java.io.*;
public class WhileEx3 {

	public static void main(String[] args)throws IOException {
		//����ڷκ��� ������ ���ĺ��� �Է¹��� �� �Է¹��� ���ĺ��� �ҹ��ڸ� �빮�ڷ�
		//�빮�ڸ� �ҹ��ڷ� ��ȯ�ϴ� ���α׷��� �ϼ��Ͻÿ�
		//�Է��� System.in.read()�޼ҵ� ���
		//���� ����
				BufferedReader br = new BufferedReader(
						 new InputStreamReader(System.in));

			/*	
				System.out.println("���ĺ� �� ���ڸ� �Է��ϼ���");
                char s ;

				
				char n =(char) System.in.read();
        	    //int n; //������ ���ϱ� ���� ����
    
        	    
        	    //�빮�ڸ� �Է¹޾��� ��� �ҹ��ڷ� ��ȯ
        	    //�ҹ��ڸ� �Է¹޾��� ��� �빮�ڷ� ��ȯ
        	    
        	    //�Է¹��� ���ڰ� �빮�ڶ��??
        	    //�ƽ�Ű �ڵ� �빮�� 
        	    if(n>=65&&n<=90) {
        	    	//�� ������ ������ �����
        	    	
        	    	
        	    	//�ҹ��� ��ȯ
        	    	//A(65) -> a(97) : 65+32
        	    	//B(66) -> b(98) : 66+32
        	    	//C(67) -> c(99) : 67+32
        	    	
        	    	n += 32;
        	     	s = (char)(n);
        	     	System.out.println(s);

        	    
        	    }else if(n>=97&&n<=122) {
        	    	//�Է°��� �ҹ��ڶ��
        	    	//�빮�ڷ� ��ȯ
        	    	
        	    	
        	    	n-=32;
        	    	s=(char)(n);
        	    	System.out.println(s);
        	    } else {
        	    	System.out.println("�Է¿���!");
        	    }
        	    
	*/
				
				
				System.out.println("���ĺ� �� ���ڸ� �Է��ϼ���");
				char c =(char) System.in.read();

	
	if( c>='A'&& c<='Z') {
		
		c += 32;
		System.out.println(c);
		
	}else if(c>='a'&&c<='z') {
		c -=32;
		System.out.println(c);
		
		
	}
	
	}

}
