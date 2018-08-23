package llll;

public class ArrayEx7 {

	public static void main(String[] args) {
		String strSrc[]= {//배열 원본
				new String("test1"),
				new String("test2"),
				new String("test3"),
};

				
		
		
		String strDest[]=new String[strSrc.length+2];
		System.arraycopy(strSrc, 0, strDest, 2, 3); //원본배열, 시작 지점, 복사 배열, 복사 시작 지점, 원본 파일 길이
				                                                      //test 3까지 있어서 마지막 3임.
		
		
		//원본배열
				System.out.print("strSrc:");
				for(String str :strSrc)
					System.out.print(str +" ");
			
				//카피 배열
				System.out.println();
				System.out.print("\nstrDest:");
				for(String str :strDest)
					System.out.print(str +" ");
				
				
				
				
				}
	
				
		}
		
		
		

	
				
