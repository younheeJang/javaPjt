package Exam;

public class Quiz5 {

	public static void main(String[] args) {
		int A[][];
		A =new int [4][5];
		
int a, b, c=20;

for(int i =0; i<A.length; i++) {

	for(int j =0; j<A[i].length; j++) {
		

a=c-i-4*j;
A[i][j]=a;

		
	System.out.print(A[i][j]+"\t");
	}
System.out.println();
}
	}

}
