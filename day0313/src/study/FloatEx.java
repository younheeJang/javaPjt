package study;

/*
 * �Ǽ����� �⺻ �ڷ����� double���̴�.
 * float�� ���ͷ� �ڿ� f�� ��� �ϰ�
 * double�� ���ͷ� �ڿ� �Ǽ� ǥ�� �� ���൵ �ȴ�.
 * �Ǽ����� �⺻ �ڷ����� double�̱� �����̴�.
 * ������Ī�� �ѱ۵� ��밡�������� �ѱ��� �� ��� ����
 * �޸� ������.
 */


public class FloatEx {

	int cc = 15;//���� ����
	int dd = 20;// ���� ����
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		  int a = 10; // ���� ����
		 float f1 = 3.4f; // ���� ����
		 double f2 = 34.4; // ���� ����
// +��ȣ�� ���ϱ� �������̱⵵ ������ ���ڸ� �������ִ�
		 //��ȣ�̱⵵ ��.
		    System.out.println("f1 :"+f1);
            System.out.println("f2 :"+f2);		
          FloatEx ccc = new FloatEx();
          FloatEx ddd = new FloatEx();
          
            System.out.println(a);
	        System.out.println("dd :"+ddd.dd);
	       ccc.aaaa();
	       ddd.aaaa();
	}//end main
	
	public void aaaa() {
             System.out.println(cc+dd);		
	
	}

	
}

