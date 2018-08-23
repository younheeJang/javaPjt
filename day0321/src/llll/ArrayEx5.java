/*package llll;



 * 래기드 배열(가변 배열)
 * 
 * 자바의 배열은 1차원(행)만 관리함
 * 
 * 따라서 열의 변화를 줄 수 있다.
 

public class ArrayEx5 {

	public static void main(String[] args) {
		
		int[][] test;//배열선언
		
		test = new int[3][];
		
		test[0]=new int[2];//1행
		test[1]=new int[1];//2행
		test[2]=new int[3];//3행

		//데이터를 넣어보자!
		
		test[0][0]=100;
		test[0][1]=200;
		
		//2행
		test[1][0]=300;
		
		
		//3행
		test[2][0]=400;
		test[2][1]=500;
		test[2][2]=600;
		
		//출력
	int i, j;
		
		for(i=0; i<test.length; i++) {//행
		for(j=0; j<test[i].length; j++) {//열
			
			System.out.println("test["+i+"]'["+i+"]:''test[i][j];
		}
		
		
		System.out.println();
	}
	
	}

}
*/