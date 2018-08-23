package comex.inher;

public class Exam {

	private String hak, name;
	private int kor, eng, mat;

	public Exam() {

	}

	public Exam(String hak, String name, int kor, int eng, int mat) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		// 생성자 메소드
	}

	public void Exam(String hak, String name, int kor, int eng, int mat) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}

	// 컨트롤 스페이스바 문자열을 호출해서 보냄 출력안해도 메소드를 이용하는 방법이 있음
	@Override
	public String toString() {
		// Object클래스의 toString()메소드를 오버라이딩

		if (name == null)

			return null;

		String str = String.format("%s,  총점: %d", name, (kor + eng + mat));
		return str;

	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		Exam ee = null;
		if (obj instanceof Exam)
			ee = (Exam) obj;// 다운 캐스팅
		else
			return flag;

		if (this.name.equals(ee.name) && hak.equals(ee.hak))
			flag = true;

		return flag;
	}

//해시코드 객체가 가지고 있는 다른 곳의 값

}
