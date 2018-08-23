package solvingEx;

public class MultiplexasionEx4 {

	public static void main(String[] args) {
	
		
		
for(int i = 2; i < 9; i+=3) {
	
	for(int j = 1; j < 10; j++) {
		
		for(int k = i; k < i+3; k++) {
			
			if(k<=9) {
				
				System.out.print(k+"*"+j+"="+k*j);
			}
			
			
			//System.out.print(k+"*"+j+"="+k*j);
			System.out.print("\t");
		}
		
		
		
		System.out.println();
	}
	
	
	
	System.out.println();
}

		
	}

}