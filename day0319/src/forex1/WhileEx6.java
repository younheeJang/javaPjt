package forex1;

public class WhileEx6 {

	public static void main(String[] args) {
		
		//1~100������ �� �߿��� Ȧ������ �հ踦 ���Ͻÿ�.
		//while�� ���

		/*
		int sum = 0;
		
		for(int i=1; i <=100; i++) {
			
			if(i%10==0) {
				
				
				System.out.println(sum);
			}
			
			
			
			
			 sum = sum + i;
		}
		
		System.out.println("1~100������ �հ�: " + sum);
		*/
		
		int i = 0;
		int sum = 0;
		
		while(i <=100) {
			sum =sum +i;	//���� 10�� ����� ������� ��� ����Ǿ�� �ϱ� ������ if���� ���� �ʴ´�.
			
			//�׸��� 10�� ����� ������ �հ踦 ����ϱ� ���ؼ� ���ǹ� �ȿ� ��� ��ȣ�� �־��ְ�
			//����Ʈ ������ �ؿ� �ٿ��� �� �� �� ��µ� �� �ֵ��� �Ѵ�.
			if(i%10==0) {
				System.out.printf("1~%d������ ��:"+sum, i);
				System.out.println();
			}
			
			i++;
		}
		
		
		
	}

}
