package llll;


class AAA{
	
	public int aa(int a, int b) {
		
		int sum = 0;
		sum = a+b;
		return sum;
	}



}
//===============================================
public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 배열 : 같은 자료형들끼리 모아놓은 하나의 묶음
 * 자바에서 하나의 배열은 하나의 객체로 인식
 * 동일한 자료형이 여러 개 반복될 때 하나의 변수명으로 관리
 * 각각의 구분은 순차적인 첨자 인덱스를 사용
 * 참조자료형 크기 4바이트
 * new라는 연산자에 의해 할당되면 자동 초기화된다.
 */
		
		/*1차원 배열
		 *  
		 */

		
		//오브젝트 객체는 클래스에 만들어지는 물건
		AAA a1= new AAA();
		AAA a2= new AAA();
		AAA a3= new AAA();
		AAA a4= new AAA();
		AAA a5= new AAA();
	
		//클래스 배열 선언
	 AAA[] aaaa;
	 //클래스 배열 크기 할당
	 aaaa = new AAA[5];
	 
		a1.aa(10, 20);
		a2.aa(10, 20);
		a3.aa(10, 20);
		a4.aa(10, 20);
		a5.aa(10, 20);
		
		
		int a[];//배열 선언
		
		a = new int[3];//배열크기 할당
		
	
		a[0]=100;
		a[1]=200;
		a[2]=300;
		
		int i;
	for(i=0; i<a.length; i++) {
			
			System.out.print(a[i]+"\t");
		}
		
		
		//배열은 배열의 값을 불러오기 위해서 이용하는 것일 뿐,
		//포문에서 불러온 배열의 값을 산출하기 위해서는 출력 시 포문의 변수 이름을 사용해야 한다.
		for(int bb:a) {
			
			 
			System.out.println(a );
			
		
	
		}
		
		
	}

}
