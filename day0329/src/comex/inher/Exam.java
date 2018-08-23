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
		// ������ �޼ҵ�
	}

	public void Exam(String hak, String name, int kor, int eng, int mat) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}

	// ��Ʈ�� �����̽��� ���ڿ��� ȣ���ؼ� ���� ��¾��ص� �޼ҵ带 �̿��ϴ� ����� ����
	@Override
	public String toString() {
		// ObjectŬ������ toString()�޼ҵ带 �������̵�

		if (name == null)

			return null;

		String str = String.format("%s,  ����: %d", name, (kor + eng + mat));
		return str;

	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		Exam ee = null;
		if (obj instanceof Exam)
			ee = (Exam) obj;// �ٿ� ĳ����
		else
			return flag;

		if (this.name.equals(ee.name) && hak.equals(ee.hak))
			flag = true;

		return flag;
	}

//�ؽ��ڵ� ��ü�� ������ �ִ� �ٸ� ���� ��

}
