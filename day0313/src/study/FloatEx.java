package study;

/*
 * 실수형의 기본 자료형은 double형이다.
 * float는 리터럴 뒤에 f를 써야 하고
 * double은 리터럴 뒤에 실수 표시 안 해줘도 된다.
 * 실수형의 기본 자료형이 double이기 때문이다.
 * 변수명칭은 한글도 사용가능하지만 한글은 잘 사용 안함
 * 메모리 때문에.
 */


public class FloatEx {

	int cc = 15;//전역 변수
	int dd = 20;// 전역 변수
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		  int a = 10; // 지역 변수
		 float f1 = 3.4f; // 지역 변수
		 double f2 = 34.4; // 지역 변수
// +기호는 더하기 연산자이기도 하지만 문자를 연결해주는
		 //기호이기도 함.
		    System.out.println("f1 :"+f1);
            System.out.println("f2 :"+f2);		
          FloatEx ccc = new FloatEx();
          FloatEx ddd = new FloatEx();
          
            System.out.println(a);
	        System.out.println("dd :"+ddd.dd);
	       ccc.aaaa();
	       ddd.aaaa();
	}//end main
	
	public void aaaa() {
             System.out.println(cc+dd);		
	
	}

	
}

