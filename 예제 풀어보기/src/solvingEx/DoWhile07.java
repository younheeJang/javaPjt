package solvingEx;

public class DoWhile07 {

	public static void main(String[] args) {
	/*
	 * -50에서 1까지의 수를 5씩 끊어 출력해라
	 */
	int a = -50;
		
		do {
			
			System.out.printf("%d", a);
			a++;
			if(a%5==0) {
				
				System.out.println();
			}
					
		
		}
		while(a<=1);

			
			
			
	}

}
