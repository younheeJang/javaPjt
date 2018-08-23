package llll;

public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] t;
		
		t = new int [4][4];
		
		t[0][0]=16;
		t[0][1]=9;
		t[0][2]=8;
		t[0][3]=1;
		t[1][0]=15;
		t[1][1]=10;
		t[1][2]=7;
		t[1][3]=2;
		t[2][0]=14;
		t[2][1]=11;
		t[2][2]=6;
		t[2][3]=3;
		t[3][0]=13;
		t[3][1]=12;
		t[3][2]=5;
		t[3][3]=4;
		
		
		
		for(int i =0; i<t.length; i++) {
			for(int j = 0; j<t[i].length; j++) {
				
				
				System.out.printf("%2d", t[i][j]);
			}
			
			System.out.println();
		}
	
	}

}
