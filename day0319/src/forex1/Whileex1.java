package forex1;


/*while���� �̿��Ͽ� 1~100������ ���� ���Ͻÿ�.
 * 
 * 
 */
public class Whileex1 {

	public static void main(String[] args) {
		// �������� ���Ϲ������� �ٱ��� ���������� �ϸ鼭 �ʱ�ȭ�� ���� �ʱ����.
	
		
		int i =1;	
		while(i<=9) {
             
		    
		      System.out.println("***"+i+"��"+"***");
		      //�������� 
		      int j =1;
		      while(j<=9) { 
		    	  System.out.printf("%dx%d=%d\n", i, j, (i*j));       	
		    	 j++;
		    	 	
		     }
		    i++;
		}

			   	
		
	}

}
