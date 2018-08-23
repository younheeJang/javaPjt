package comex.inher;

public class SuperEx2 {

	protected double area;
	private String title;

	public SuperEx2() {
		// 생성자 함수 만들기

	}

	public SuperEx2(String title) {
		this.title = title;

	}

	public void write() {
		System.out.println(title + area);

	}

}
