package study;

public class ValueParameter {

	public int increase(int n) {

		++n;

		return n;

	}
	
	
//���� ���� ȣ��(call by value)
	public static void main(String[] args) {

		int var1 = 100;

		ValueParameter vv = new ValueParameter();
		int var2 = vv.increase(var1);
		System.out.println("var1:" + var1 + ", var2:" + var2);

		/*�޼ҵ� ȣ��� �⺻�ڷ����� ���� ���ڷ� ���޹޴� ���
		 * �⺻ �ڷ����� ���� �ִ� ��!
		 * 
		 */
		
		
	}

}
