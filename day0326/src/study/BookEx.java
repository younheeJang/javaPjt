package study;

class MaxEx{   
	
public  static int max (int num1, int num2){


int result;

if(num1>num2)

result = num1;

else
result = num2;

return result;

}

}

public class BookEx {

	public static void main(String[] args) {
		Book bb = new Book();
		//�� Ŭ������ ��ü ���� �� ��� �����ڸ� ��
		
		MaxEx me = new MaxEx();
		
		/*bb.name="���Ƕ� �����ΰ�?";
		
		bb.writer="����Ŭ..";
		
		bb.price=15000;
		
		bb.isbn="12345";
		*/
		//���� ��Ű�� ������ ������ ���� �ٸ� Ŭ����.���� ����� ���� �ڷ��� ������ 
		//���� ��Ű�� ���� �ٸ� Ŭ������ ������ ���� ���� �� �� �ִ�.
			
        int dd = me.max(10,20);

        
        System.out.println("�ִ밪:"+dd);
		
	}

}
