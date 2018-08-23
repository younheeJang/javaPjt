package Solving;

public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int j, k =0;
	

for (j = 1; j < 16; j -=1 ) {
	
	if (j == 16 || j == 14) {

		for (k = j; k < j + 5; k++) {
			System.out.print(k);
			System.out.printf("\t");
		}

	} else {
		
		for (k = j+4; k > j-1; k--) {
			System.out.print(k);
			System.out.printf("\t");
			
		
		}

	}

	
	System.out.printf("\n");

}	


	}
}




/*
for(i=16; i>12; i-=1) {
	
	for(j=i; j>i-10; j-=8) {	
	
		
		System.out.print(j);
		System.out.print("\t");
	
	}
	
	
	
	System.out.println();
}

*/