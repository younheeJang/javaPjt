package reference;

public class ReferExam1 {

	public static void main(String[] args) {
		
		 ReferEx1 re1;//레퍼런스 변수 선언
		 re1= new  ReferEx1();//레퍼런스 변수 생성
		 //. 은 참조 연산자 
		 
		 ReferEx1 re2 = new  ReferEx1();
		 
		 int a, b;
		 //결과값 리턴을 위한 공간 설정 해줘야 해서 만듦
		
		 //void형이므로 리턴값이 없어서 자료형 및 변수 등 객체를 따로 생성하지 않고도 
		 //아래와 같이 간단히 메인에서 실행에 이용할 수 있다.
		 //setData메소드로 가서 처리 기호를 수행한다.
		 re1.setData(10, 5);
		 re2.setData(50, 60);
		 
		 a=re1.area();//50
		 b=re1.length();//220
		 
		 System.out.printf("가로 : %d. 세로 : %d, 넓이 : %d. 둘레 : %d\n", re1.width, re1.height, a, b);
	
		 a=re2.area();//50
		 b=re2.length();//220
		 
		 System.out.printf("가로 : %d. 세로 : %d, 넓이 : %d. 둘레 : %d\n", re2.width, re2.height, a, b);
	}

}
