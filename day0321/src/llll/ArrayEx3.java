package llll;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		//2�����迭����
		int[][] test;
		int n =1;
		test = new int [2][3];//�迭�� ũ�� : 2�� 3��
		//�迭�� ��ü ũ��� : 6
		//�Ҵ�� ���ÿ� �迭�ؾ� ��
		
	/*	//ù��°��
		test[0][0]=100;
				test[0][1]=200;
						test[0][2]=300;
						//�ι�°��
						test[1][0]=500;
								test[1][1]=600;
										test[1][2]=600;*/
					
		//�Է�
		for(int i = 0; i<test.length; i++) {//��
			for(int j =0; j<test[i].length; j++) {//��
				
				test[i][j]=n++;	
		}
			
								
	}
		
		
		                                        for(int i = 0; i<test.length; i++) {//��
											for(int j =0; j<test[i].length; j++) {//��
												
												System.out.print(test[i][j]+" ");			
										}
											System.out.println();								
									}
										

	}

}
