package forex1;



public class WhileEx2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int i =2;//�ٱ����� �ʱⰪ ����
		while(i<=9) {
			//���ʿ��� ����� ������ �ʱⰪ ����
			int j =1;
			while(j<=9) {
			
				System.out.printf("%d x %d=%d\n", i, j, i*j); 
                      j++;//���ʿ��� ����� ���� j���� �ϳ� ������Ŵ
				
			}
			System.out.println();
					
			i++;
		}
	}

}
