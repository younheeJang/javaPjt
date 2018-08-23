package llll;

public class Array {

	public static void main(String[] args) {
	// 배열된 숫자 를 더해 총 합을 구하고 평균을 구한다.
		int[] s = {95, 71, 82, 62, 30};
		
		int sum = 0;
		for(int sc: s) {
			sum+=sc;
			
		}
	System.out.println("점수 총합 ="+sum);
	double avg =(double)sum/s.length;
	System.out.println("점수 평균 ="+avg);
	
	}

}
