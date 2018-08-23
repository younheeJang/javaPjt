//if문 안에 for문 넣어보기

package solvingEx;

public class Count1 {

	public static void main(String[] args) {

	
			for(int j = 1; j < 17; j+=5) {
				
				for(int k = j; k < j + 5; k++) {
					
				   
					/*출력할 때 프린트와 프린트 엘엔의 차이
					 * 
					 * 
					 */
					System.out.print(k);
					System.out.print("\t");
					//System.out.printf("\t");
					
					
					
					/*System.out.println(k);
					System.out.println("\t");*/
				}
	
				//=System.out.printf("\n");
				System.out.println();
			}
			
		
	}

}

/*for(int i = 2; i < 9; i+=3) {
	
	for(int j = 1; j < 10; j++) {
		
		for(int k = i; k < i+3; k++) {
			
			if(k<=9) {
				
				System.out.print(k+"*"+j+"="+k*j);
			}
			
			
			//System.out.print(k+"*"+j+"="+k*j);
			System.out.print("\t");
		}
	}*/