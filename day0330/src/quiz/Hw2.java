package quiz;

public class Hw2 {

	public static void main(String[] args) {
	
		
		int i = 1000000;
		int year = 1;
		double result = 0;
		
		while(year<=10) {
			
		result = (double)i*(1+0.045*year);
		
		System.out.printf("%d"+"년째 이자"+"%.2f"+"\n", year, result);	
		//"%.2f" 실수형으로 결과값을 낼 때는 자릿수를 지정해 줘야 깔끔하게 결과를 도출할 수 있다.
		//실수형 값 리절트를 도출할 때는 소수점 두 자리수까지 결과를 출력할 수 있도록 프린트폼에서 기준을 미리 지정해 줄 수 있다.
		//%.자리수f
			
			
			year ++;
		}
		

	}

}
