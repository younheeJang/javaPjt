package Exam;

public class Quiz1 {

	public static void main(String[] args) {
	

		int A[][];
		A =new int [4][5];
		
int a = 0, b = 0;
for(int i =0; i<A.length; i++) {

	for(int j =0; j<A[i].length; j++) {
		if(i%2==0) {
			a+=1;
			A[i][j]=a;
			b = a+6;
			
			
		}else {
			
			b-=1;
			A[i][j]=b;
			a=b+4;		
			
		}
	System.out.print(A[i][j]+"\t");
	}
System.out.println();
}
	}
	

}





