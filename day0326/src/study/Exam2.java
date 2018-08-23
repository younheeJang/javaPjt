package study;

public class Exam2 {

	public static void main(String[] args) {
		// r구현한 메소드 호출 및 출력
		Exam ee = new Exam();
//다른곳에서 가져다 쓰므로 코딩에서 잘못된 곳이 있어 에러가 난다면
		//에러가 발생한 곳을 찾을 때 유리.
		
		int d = ee.add(10, 20);
		int e = ee.sub(10, 20);
		int f = ee.mul(10, 20);
		int g = ee.div(10, 20);
		System.out.println("덧셈:" + d);
		System.out.println("뺼셈:" + e);
		System.out.println("곱셈:" + f);
		System.out.println("나눗셈:" + g);
		// 마지막 나눗셈은 자료형이 인트이므로 소수점자리까지 나오지 않는다.
		// 0에서 짤림.

	}

}
