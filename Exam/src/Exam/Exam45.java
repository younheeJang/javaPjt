package Exam;

public class Exam45 {

	public static void main(String[] args) {

int[][] a = new int[4][5];

int v = 20;

for(int i = 0; i<a.length; i++){
	for(int j=0; j<a[i].length; j++){
	a[i][j]=v;
		v-=4;
	System.out.printf("%3d", a[i][j]);
	}

	System.out.println();
	v+=19;
}


		


	}

}
