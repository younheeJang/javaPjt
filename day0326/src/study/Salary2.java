package study;

public class Salary2  {

	//������ �Աݵ� ��
	private int pay;

	//�����̺��̴� ����� ���� ���� ����� ��
	public int getPay() {
		return pay;
	}
//������ �Է��ε� �ٸ� Ŭ�������� ���� ���� �� ���¿� �˸��� �н����带 �Է� �޾ƾ� �ϹǷ�
	//�������� ��Ʈ�� �н�(����)�� �������ش�.
	public void setPay(int pay, String pass) {
		
		if(pass.equals("1234"));// ������ �� �ִٰ� �ϱ� ���� �н����� ���� ����� ��.
		this.pay = pay;//�̰����� ���̸� ������ �� ��������
	}
	
	
	
	
}
