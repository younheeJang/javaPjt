package solvingEx;

public class MultiplexasionEx2 {

	public static void main(String[] args) {
	
//단은 2단에서 8단까지 세로로 가능해지는 범위 설정, +2는 2단 다음에 4단이니까 그 차이
	for(int i = 2; i < 9; i+=2) {
			
			//*1~*9인듯
			for(int j = 1; j < 10; j++) {
				
				//줄인듯. 2줄 옆으로 가는 거
				for(int k = i; k <= i + 1;  k++) {
					
					System.out.print(k + 
							"*" + j + "=" + k*j);
					System.out.print("\t");
				}
				
				
				
				
				
				System.out.println();
			}
			
			
			System.out.println();
		}

	/*for (int i = 1; i < 8 ; i += 3)//구구단을 3단씩 뽑기 위해서 
	{
		for(int j = 1 ; j < 10 ; j++)
		{
			for (int k = i; k < i + 3; k++)
				{System.out.print(k + "*" + j + "=" + k * j );
		System.out.print("\t");	//구구단을 가로로 3단씩 띄어준다.
		}
		System.out.println();//구구단을 3단씩 3줄로 나눠준다
		
	}
		System.out.println();//구구단을 3단씩 9개로 나눠준다
}
*/


		
	}

}