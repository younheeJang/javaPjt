package comex.inher;

public class SuperEx1 {

	protected double area;

	// protected: 하위클래스, 동일패키지에서만 접근 가능
	

	// private: 하위클레스에서 접근 불가 오직 클래스 내에서만 접근 가능

	public SuperEx1() {

		// 생성자 함수

		System.out.println("이곳은 슈퍼클래스");
	}

	// 일반함수 인스턴스 함수
	public void write(String title) {
		System.out.println(title + area);

	}
}
