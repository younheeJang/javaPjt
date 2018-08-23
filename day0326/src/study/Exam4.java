package study;

public class Exam4 {

	public static void main(String[] args) {
		
		Exam3 ee = new Exam3();
		
		int c = ee.add(10, 20);
		int d= ee.sub(10, 20);
		int e = ee.mul(10, 20);
		int f= ee.div(10, 20);
	
		System.out.println("두 수의 합:"+c);
		System.out.println("두 수의 차:"+d);
		System.out.println("두 수의 곱:"+e);
		System.out.println("두 수의 나눗셈:"+f);
		
	}

}
