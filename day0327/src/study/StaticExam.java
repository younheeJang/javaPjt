package study;


public class StaticExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticEx se = new StaticEx();
		//StaticEx Ŭ������ ��ü ����
		
		System.out.println(se.x);
		//��ü�� �����ؼ� StaticExŬ���� ����ʵ忡 ����

		
		System.out.println(StaticEx.y);
		//���� x�� �ϸ� ���� ���� ��ü�� �������� �ʰ� ������ �õ��߱� ����
		//�ذ� ��� : ��ü�� �����ؼ� �����ϸ� �ٸ� ������ Ŭ���� �ȿ� �ִ� �������� x�� ���� ����
		
		StaticEx.y=100;
		//�ٸ� Ŭ������ ���� ������ y�� ������ ��Ű�� �ȿ����� ��� ������ ����
		//y�� StaticExŬ������ static����ʵ��̱� ������ ��ü�� �������� �ʴ��� ���� ����

		System.out.println(StaticEx.y);
		
		
	}

}
//��½� ù��° y�� �ι�° y�� ���� �ٸ� ������
// ù��°�� �ʱⰪ�� ����� �����̰� �ι�°�� 100���� �ʱⰪ�� ������ �־��� �����̴�.