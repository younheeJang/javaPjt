package study;

public class ByteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * byte : 1byte 자료형이며
		 * 입출력 범위 : -128~127
		 * 
		 * ex)byte b = -129 c프로그램에서는 127
		 * c언어와 java언어는 컴파일이 달라서
		 * c언어에서는 -129인 경우 127로 넘겨버려서 에러가 안 난다.
		 * 
		 * java에서는 컴파일시 에러 발생시킴
		 * 왜??????????
		 * 안정성 때문
		 * 
		 * 컴퓨터 언어로는 같은 계산식도 수학적 계산처럼 
		 * 딱 맞춰 떨어지지 않을 수 있다.
		 */
		
		byte bb = -128;
		
		bb++;
		
		System.out.println(bb);

	
		
		
		
	}

}
