package study;

public class ReferenceParameter {

	
	//void ���ϰ��� �ʿ� ����
	public void increase(int[] n) {
		//�迭 ���� ������
		for(int i = 0; i<n.length; i++) {
			
			n[i]++;
		}
			
	}
	
	
	
	
	public static void main(String[] args) {
		
		int ref[]= {100, 200, 800, 500};
		//ref�� �� �� ����
		//ref�� �Ѱ��ָ� ��

		 ReferenceParameter rp=new  ReferenceParameter();
		 
		 rp.increase(ref);
		for(int i =0; i<ref.length; i++) 
			System.out.println("ref["+i+"]:"+ref[i]);
		//���ο���ref �迭 ��ü�� �����Ͽ� �� Ŭ������ ��������� �Ѱ� ����� �Ϸ��� �� 
		//�ٽ� �������� �������� ���
		
		
		
		
		/*�迭 Ȥ�� ��ü!
		 * �޼ҵ� ȣ��� �����Ϸ��� ���ڸ� ����(��ü) �ڷ����� ����� ��츦 �ǹ���
		 * ���⿡�� �⺻�ڷ��� �ƴ� ������ (��ü �Ǵ� �迭)�� ����
		 * 
		 */
	}

}
