package llll;

public class Star1 {

	public static void main(String[] args) {
	
		//빈공간 만들기
		
int i, j, k, g;
	for(i=2; i<10; i+=3) {
		
	 for(j=2; j<10; j+=3) {
		System.out.print(j);
		System.out.print("\t");
		}
	 
	        for(k=2; k<10; k+=3) {
			
			System.out.print(k);
			System.out.print("\t");
		}
	
	        for(g=i; g<10; g+=3 ) {
	        	
	        	System.out.print(g);
	        	System.out.print("\t");
	        }
		System.out.println();
	}	
		
		
		
	/*	
		int a, b, c, d;
		
		
		for(a=1, b=1; a <15 ; a++) {
			
			if(b<10) {
				
				System.out.print(b+"\n");
				b++;
			}
			
			System.out.println();
		}
		*/
		
		
	}


public static void pp(int a) {
	
	for(int i=0; i<a; i++) {
		
		
		System.out.print(" ");
	}
	
	
}
public static void pps(int a) {
	for(int i=10; i>a; i--) {
		
		System.out.print("☆");
	}
	
}
}