package llll;


class AAA{
	
	public int aa(int a, int b) {
		
		int sum = 0;
		sum = a+b;
		return sum;
	}



}
//===============================================
public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * �迭 : ���� �ڷ����鳢�� ��Ƴ��� �ϳ��� ����
 * �ڹٿ��� �ϳ��� �迭�� �ϳ��� ��ü�� �ν�
 * ������ �ڷ����� ���� �� �ݺ��� �� �ϳ��� ���������� ����
 * ������ ������ �������� ÷�� �ε����� ���
 * �����ڷ��� ũ�� 4����Ʈ
 * new��� �����ڿ� ���� �Ҵ�Ǹ� �ڵ� �ʱ�ȭ�ȴ�.
 */
		
		/*1���� �迭
		 *  
		 */

		
		//������Ʈ ��ü�� Ŭ������ ��������� ����
		AAA a1= new AAA();
		AAA a2= new AAA();
		AAA a3= new AAA();
		AAA a4= new AAA();
		AAA a5= new AAA();
	
		//Ŭ���� �迭 ����
	 AAA[] aaaa;
	 //Ŭ���� �迭 ũ�� �Ҵ�
	 aaaa = new AAA[5];
	 
		a1.aa(10, 20);
		a2.aa(10, 20);
		a3.aa(10, 20);
		a4.aa(10, 20);
		a5.aa(10, 20);
		
		
		int a[];//�迭 ����
		
		a = new int[3];//�迭ũ�� �Ҵ�
		
	
		a[0]=100;
		a[1]=200;
		a[2]=300;
		
		int i;
	for(i=0; i<a.length; i++) {
			
			System.out.print(a[i]+"\t");
		}
		
		
		//�迭�� �迭�� ���� �ҷ����� ���ؼ� �̿��ϴ� ���� ��,
		//�������� �ҷ��� �迭�� ���� �����ϱ� ���ؼ��� ��� �� ������ ���� �̸��� ����ؾ� �Ѵ�.
		for(int bb:a) {
			
			 
			System.out.println(a );
			
		
	
		}
		
		
	}

}
