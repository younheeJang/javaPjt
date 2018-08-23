package Solving;

public class Exam1 {

	public static void main(String[] args) {
		
		//주요 변수 선언
		
	int n = 0;
	
	
	double a = 0;
	
	while(n<=8) {
		
		
		//와일문은 꼭 !! 반복 루프가 있기 때문에 꼭
		a += (n+1)/(double)(n+2);//누적 처리를 중요하게!!!!!!
		n++;
		
		
	}
System.out.printf("연산결과 :%.2f\n", a);
	}
	

}
