package study;

public class Test01 {

	static int c; //클래스 변수(전역 변수)는 초기값을 주지 않아도 메인 메소드에서 출력을 할 때 에러가 나지 않음
	
	public static void main(String[] args) {
        
		
		
		
		// 변수(하나의 값을 저장할 수 있는 메모리 공간) 선언 및 초기화(메모리에 값 할당)
	int a = 0, b = 0;

	// 변수에 값을 대입한다.
	a = 10;
	b = 30;
	
	int c = a+b;
	// 변수 a와 b에 할당된 값을 계산하여 c라는 변수에 저장한다.
	//c언어(절차 지향)와 다른 점은 변수 설정이 자유롭다. 그때그때 변수 설정을 할 수 있다.=>객체 지향
	
	//출력문을 이용하여 마지막으로 계산된 값을 출력한다.

	System.out.println("두 수의 합계: "+c);
	
	
	
	/*
		System.out.println(a);
		System.out.println(b);
		System.out.printf("초기값을 주지 않았어도 전역 변수는 메인 메소드에서 다음과 같이 출력된다= " + c);*/
	}

}
