package study;

public class ValueParameter2 {
//void�� ��� ���ϰ� �ʿ�
	public int increase(int a) {
		
		++a;//���� ������
		return a ;
	}
	
	public static void main(String[] args) {

	int v=100;
	
	ValueParameter2 vv = new ValueParameter2();
	
	int k = vv.increase(v);
	System.out.println("v: " +v+"\n"+"k: "+k);
		
		
		
	}

}
