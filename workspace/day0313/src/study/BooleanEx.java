package study;


/*
 * boolean : 유일한 논리형태의 자료형 : 크기는 1byte 이지만
 * 사용하는 것은 1bit(맨 오른쪽 것 하나)만 사용한다.
 * 나머지 비트들은 크기는 잡혀있지만 사용은 안 한다.
 * 0 true
 * 1 false
 * 
 */
public class BooleanEx {

	public static void main(String[] args) {
		boolean b = true;
		//문자열(true)과 변수(b)를 연결할 때는 +기호를 씀
		//printf함수는 c언어에서도 똑같이 씀
		System.out.println("변수 b의 값은 :"  +b +"입니다.");
	    
		System.out.printf("변수 b의 값은 :%b입니다.\n", b);
	}

}
