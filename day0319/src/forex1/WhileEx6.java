package forex1;

public class WhileEx6 {

	public static void main(String[] args) {
		
		//1~100까지의 수 중에서 홀수들의 합계를 구하시오.
		//while문 사용

		/*
		int sum = 0;
		
		for(int i=1; i <=100; i++) {
			
			if(i%10==0) {
				
				
				System.out.println(sum);
			}
			
			
			
			
			 sum = sum + i;
		}
		
		System.out.println("1~100까지의 합계: " + sum);
		*/
		
		int i = 0;
		int sum = 0;
		
		while(i <=100) {
			sum =sum +i;	//합은 10의 배수와 상관없이 계속 수행되어야 하기 때문에 if문에 들어가지 않는다.
			
			//그리고 10의 배수일 때마다 합계를 출력하기 위해서 조건문 안에 출력 기호를 넣어주고
			//프린트 엘엔을 밑에 붙여서 한 줄 씩 출력될 수 있도록 한다.
			if(i%10==0) {
				System.out.printf("1~%d까지의 합:"+sum, i);
				System.out.println();
			}
			
			i++;
		}
		
		
		
	}

}
