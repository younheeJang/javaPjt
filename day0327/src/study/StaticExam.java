package study;


public class StaticExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticEx se = new StaticEx();
		//StaticEx 클래스의 객체 생성
		
		System.out.println(se.x);
		//객체를 생성해서 StaticEx클래스 멤버필드에 접근

		
		System.out.println(StaticEx.y);
		//변수 x로 하면 에러 이유 객체를 생성하지 않고 접근을 시도했기 때문
		//해결 방법 : 객체를 생성해서 접근하면 다른 파일의 클래스 안에 있는 지역변수 x도 접근 가능
		
		StaticEx.y=100;
		//다른 클래스의 정적 변수인 y는 동일한 패키지 안에서는 모두 접근이 가능
		//y는 StaticEx클래스의 static멤버필드이기 때문에 객체를 생성하지 않더라도 접근 가능

		System.out.println(StaticEx.y);
		
		
	}

}
//출력시 첫번째 y와 두번째 y의 값이 다른 이유는
// 첫번째는 초기값을 안줬기 때문이고 두번째는 100으로 초기값을 지정해 주었기 때문이다.