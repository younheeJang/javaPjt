package study;

public class SalaryEx2 {

	public static void main(String[] args) {
		//�ٸ� Ŭ������ ȣ���Ѵ�. �ʿ��� ����� ������ �ֱ� ����
		//Ŭ���� ȣ�� ���  Ŭ������ �̸� �� ���� ��Ī = new Ŭ������ �̸�();
		Salary sa = new Salary();
		
		
		//�Է¹޴´�.�����̺����� �����س������Ƿ� ���͸� ã�´�.
		sa.setPay(10000, "1234"); //������ ������ �ش�. �׸��� �Է��� �޴´�.
	
		
		//����� �Ѵ�.
		int k = sa.getPay();
		System.out.println(k);//����� ���ش�.
		
	}

}
