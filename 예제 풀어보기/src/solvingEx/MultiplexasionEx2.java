package solvingEx;

public class MultiplexasionEx2 {

	public static void main(String[] args) {
	
//���� 2�ܿ��� 8�ܱ��� ���η� ���������� ���� ����, +2�� 2�� ������ 4���̴ϱ� �� ����
	for(int i = 2; i < 9; i+=2) {
			
			//*1~*9�ε�
			for(int j = 1; j < 10; j++) {
				
				//���ε�. 2�� ������ ���� ��
				for(int k = i; k <= i + 1;  k++) {
					
					System.out.print(k + 
							"*" + j + "=" + k*j);
					System.out.print("\t");
				}
				
				
				
				
				
				System.out.println();
			}
			
			
			System.out.println();
		}

	/*for (int i = 1; i < 8 ; i += 3)//�������� 3�ܾ� �̱� ���ؼ� 
	{
		for(int j = 1 ; j < 10 ; j++)
		{
			for (int k = i; k < i + 3; k++)
				{System.out.print(k + "*" + j + "=" + k * j );
		System.out.print("\t");	//�������� ���η� 3�ܾ� ����ش�.
		}
		System.out.println();//�������� 3�ܾ� 3�ٷ� �����ش�
		
	}
		System.out.println();//�������� 3�ܾ� 9���� �����ش�
}
*/


		
	}

}