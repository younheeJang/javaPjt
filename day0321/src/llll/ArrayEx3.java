package llll;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		//2차원배열선언
		int[][] test;
		int n =1;
		test = new int [2][3];//배열의 크기 : 2행 3열
		//배열의 전체 크기는 : 6
		//할당과 동시에 배열해야 함
		
	/*	//첫번째행
		test[0][0]=100;
				test[0][1]=200;
						test[0][2]=300;
						//두번째행
						test[1][0]=500;
								test[1][1]=600;
										test[1][2]=600;*/
					
		//입력
		for(int i = 0; i<test.length; i++) {//행
			for(int j =0; j<test[i].length; j++) {//열
				
				test[i][j]=n++;	
		}
			
								
	}
		
		
		                                        for(int i = 0; i<test.length; i++) {//행
											for(int j =0; j<test[i].length; j++) {//열
												
												System.out.print(test[i][j]+" ");			
										}
											System.out.println();								
									}
										

	}

}
