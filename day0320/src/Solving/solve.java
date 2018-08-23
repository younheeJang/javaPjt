package Solving;

public class solve {

	public static void main(String[] args) {
	
		
		
	
	
	
	/*
	 * 1부터 100까지의 수 중에서 소수를 출력할 때는,
	 * 첫 번째 포문에서 (나눠지는 수=2; 나눠지는 수<=한계값; 나눠지는 수 ++){
	 * 두 번째 포문에서 (나누는 수 =1; 나누는 수 <=나눠지는 수; 나누는 수++){
	 * 이프문에서 (나눠지는 수와 나누는 수의 나머지를 구해 ==0 이면 { 
	 * 카운트를 센다
	 * 
	 * 두 번째 포문에서는 나온다.
	 * 첫 번째 포문은 남아 있는 상태
	 * 첫 번째 - 두번째 포문에서 소수를 가리고, 소수가 아닐 수 있는 수를 한번 더 거르기 위해
	 * 두번쨰 포문(소수를 저장할 공간) 에서 나와서 
	 * 두 번째 포문에서 나와서, 2로 나눠서 나오는 카운트는 소수가 아니므로 제외해 줘야 한다.
	 * 최종적으로 최대값 100까지 돌렸을 때 첫 번째 포문에서 탈출한다.
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
