package solvingEx;

public class MultiplexasionEx3 {

	public static void main(String[] args) {
	
//단은 2단에서 8단까지 세로로 가능해지는 범위 설정, +2는 2단 다음에 4단이니까 그 차이
for(int i = 2; i < 7; i +=4) {
	
	for(int j = 1; j <=9; j++) {
		
		
		for(int k = i; k <= i+3; k++) {
			
			System.out.print(k+"*"+j+"="+k*j);
			System.out.print("\t");
		}
		
		
		System.out.println();
	}
	
	
	
	
	System.out.println();
}


		
	}

}