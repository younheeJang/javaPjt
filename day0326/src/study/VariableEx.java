package study;

public class VariableEx {
	
	/*�޼ҵ� ���ǽ� ���ϵ� ������ �ڷ�����   ...   ���
	 *����ϹǷ� �̸� ���� �޼ҵ带 �����ϴµ� �ʿ���
	 *������ ���� �����ϰ� ������ �� ����
	 *(���������� �迭ȭ �۾��� �ڵ����� ����)
	 */
	public void argTest(String ...n) {
		for(int i=0; i<n.length; i++) 
			System.out.println("n["+i+"]:"+n[i]);
		
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
	
		
		
		VariableEx ve = new VariableEx();
		
		ve.argTest("ȫ�浿", "������");//��½� �� 2
		ve.argTest("100", "200","300");//��½� ��3
		

		
		
	}

}
