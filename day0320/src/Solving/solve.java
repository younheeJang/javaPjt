package Solving;

public class solve {

	public static void main(String[] args) {
	
		
		
	
	
	
	/*
	 * 1���� 100������ �� �߿��� �Ҽ��� ����� ����,
	 * ù ��° �������� (�������� ��=2; �������� ��<=�Ѱ谪; �������� �� ++){
	 * �� ��° �������� (������ �� =1; ������ �� <=�������� ��; ������ ��++){
	 * ���������� (�������� ���� ������ ���� �������� ���� ==0 �̸� { 
	 * ī��Ʈ�� ����
	 * 
	 * �� ��° ���������� ���´�.
	 * ù ��° ������ ���� �ִ� ����
	 * ù ��° - �ι�° �������� �Ҽ��� ������, �Ҽ��� �ƴ� �� �ִ� ���� �ѹ� �� �Ÿ��� ����
	 * �ι��� ����(�Ҽ��� ������ ����) ���� ���ͼ� 
	 * �� ��° �������� ���ͼ�, 2�� ������ ������ ī��Ʈ�� �Ҽ��� �ƴϹǷ� ������ ��� �Ѵ�.
	 * ���������� �ִ밪 100���� ������ �� ù ��° �������� Ż���Ѵ�.
	 * 
	 */
		
		
		//int count =0;
/*	for(int i =2; i<=100; i++) {
		
	for(int j =1; j <=i; j++) {
		if(i%j==0) {
			
			count++;
			
			
		}
		
	}
		if(count==2) {
			
			System.out.println(i);
		}
		count=0;
		
	}*/

		int count = 0;
		
		for(int i =2; i <=100; i++) {
			
			for(int j = 1; j<=i; j++) {
				
				if(i%j==0) {
					
					
					count++;
					
				}
				
			}
			
			if(count==2) {
				
				System.out.println(i);
				
			}
		
		count = 0;
		}
	
	
	
		
	
	}

}