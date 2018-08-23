package study;

public class OverloadingEx {

	// 함수의 이름은 같다. 오버로딩이다. "동일한 클래스 내"에서 함수의 이름을 똑같이
	// 써도 중복되지 않게끔 해주는 것.

	public void getLength(int n) {

		String s = String.valueOf(n);
		getLength(s);

	}

	void getLength(float n) {
		String s = String.valueOf(n);
		getLength(s);

	}

	private int getLength(String str) {

		System.out.println("입력한 문자열의 길이:" + str.length());
		return 0;
	}

	public static void main(String[] args) {

		OverloadingEx ov = new OverloadingEx();

		ov.getLength(100);//int 형
		ov.getLength(3.14f);//float 형
		ov.getLength("홍길동");//String 형

	}

}
