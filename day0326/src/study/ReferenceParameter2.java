package study;

public class ReferenceParameter2 {

	//�迭 ó�� �⺻ �ڷ����� �����͸� �ٷ� ���� �ʴ� ���������� �����͸� ���� �� 
	
	public void increase(int [] a ) {
		//�迭 ���� ������
		
		for(int i =0; i<a.length; i++) {
			a[i]++;
		}
		
	}
	
	
public static void main(String[] args) {
	//�迭 �ڷ��� ����
	int [] g = {100, 300, 800, 500};
	//����� �޼ҵ带 ���� Ŭ������ ȣ���� �ش�.
	ReferenceParameter2 t = new ReferenceParameter2();
	//ȣ���� Ŭ������ ��Ī�� .�� ��� �ش� Ŭ������ ������ �ִ� �޼ҵ��� ��Ī�� ������ 
	//�� ����� ����� �� �ֵ��� �Ѵ�.
	t.increase(g);

	//��ũ������ �޼ҵ��� ��ɸ� ������ �� ���� ������ ���� �޼ҵ忡���� ���� �޼ҵ� ����
	//���� ������ ����� ���ϹǷ� ����Ʈ���� ���� �޼ҵ��� �ڷ��� �̸��� ���� �Ѵ�.
	for(int j =0; j<g.length; j++) {
		
		System.out.println(g[j]);
	}
	
	
} 


}
