package study;


/*
 * short : 2 byte 자료형 정수
 * 범위 : -32768 ~ 32767
 * p.44
 *    short s ;
 *    
 * 
 */
public class ShortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바에서는 할당과 동시에 초기값을 설정해 줘야 함
		short s = 10 ;
		
	/*c에서는 에러가 발생하지 않고 쓰레기값이 저장됨
	 * java에서는 초기값을 저장하지 않으면 에러가 발생
	 * 하므로 초기화를 함
	 */
		System.out.println(s);
	}

}
