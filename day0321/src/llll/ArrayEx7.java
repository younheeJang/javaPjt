package llll;

public class ArrayEx7 {

	public static void main(String[] args) {
		String strSrc[]= {//�迭 ����
				new String("test1"),
				new String("test2"),
				new String("test3"),
};

				
		
		
		String strDest[]=new String[strSrc.length+2];
		System.arraycopy(strSrc, 0, strDest, 2, 3); //�����迭, ���� ����, ���� �迭, ���� ���� ����, ���� ���� ����
				                                                      //test 3���� �־ ������ 3��.
		
		
		//�����迭
				System.out.print("strSrc:");
				for(String str :strSrc)
					System.out.print(str +" ");
			
				//ī�� �迭
				System.out.println();
				System.out.print("\nstrDest:");
				for(String str :strDest)
					System.out.print(str +" ");
				
				
				
				
				}
	
				
		}
		
		
		

	
				
