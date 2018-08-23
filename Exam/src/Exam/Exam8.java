package Exam;

public class Exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][];
		A =new int [4][5];
		
int b =1;

for(int i =0; i<A.length; i++) {

	for(int j =0; j<A[i].length; j++) {
		
		
		A[i][j]=b +i+ j*4;


	
		
	System.out.print(A[i][j]+"\t");
	}
System.out.println();
}
	}

}
