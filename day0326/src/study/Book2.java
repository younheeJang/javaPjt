package study;

class Max{
	
	public static int max (int num1, int num2) {
		int result;
		
		if(num1>num2) 
			result = num1;
			
		else
			result = num2;
		
		return result;
	}
	
	
}

public class Book2 {

	public static void main(String[] args) {
	
		Book1 bb = new Book1();//�ٸ� ������ Ŭ������ �ִ� �޼ҵ� �ҷ��� �� å ���� �޼ҵ�
	/*bb.name = "���Ƕ� �����ΰ�";
	bb.writer = "micheal";
	bb.price=10000;
*/

		 Max a =new Max(); //���� ������ �ٸ� Ŭ������ �ִ� �޼ҵ带 �ҷ��� �� �ƽ� �޼ҵ�
		int b = a.max(10, 20);
		
		System.out.println(b);
	}

}
