package Ex1;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// 2차원 배열, 래기드 배열
		// 학생의 수에 따라서 과목 수를 정하고, 내용을 구성한다.

		int[][] score;
		String[] name;
		String[] grade;
		int total = 0;
		double[] avg;
		int subnum;
		int student;
		String Sname;
		int sco;

		int i, j, k, h;

		System.out.println("학생 수 입력 ");
		student = s.nextInt();

		score = new int[student][];// 학생 수를 입력한 다음 변수를 선언할 때 스코어 2차 배열 식의 행에 넣어주었으므로
		// 첫번째 포문에서 조건문의 기준점으로 스코어를 놓을 수 있다.

		name = new String[student];

		avg = new double[student];

		grade = new String[student];

		for (i = 0; i < score.length; i++) {

			System.out.println((i + 1) + "번 학생의 이름:");

			Sname = s.next();
			name[i] = Sname;// 선언해 둔 이름 배열과 입력받은 이름 변수를 일치 시킨다.
			// 앞으로 이름 배열 변수를 사용할 수 있도록 함이다.

			System.out.println((i + 1) + "번 학생 과목 수 입력:");
			subnum = s.nextInt();

			score[i] = new int[subnum];

			
			
		
			
			for (j = 0; j < score[i].length; j++) {

				System.out.println((i + 1) + "번 학생" + (j + 1) + "과목 성적 입력:");
				sco = s.nextInt();

				// 총점 누적 시킨다음에 2차원 배열에 집어넣어야 함
				total += sco;
				score[i][j] = sco;

			}
			avg[i] = (double) total / subnum;
			total = 0;

			switch ((int) avg[i] / 10) {

			case 10:

			case 9:
				grade[i] = "A";

				break;
			case 8:
				grade[i] = "B";

				break;
			case 7:
				grade[i] = "C";

				break;
			case 6:
				grade[i] = "D";

				break;
			default:
				grade[i] = "F";

				break;
			}

		}
	/*	System.out.println("-----------------전 체 출 력--------------------");
		for (k = 0; k < score.length; k++) {
			System.out.printf("이름:%s\t", name[k]);
			for (h = 0; h < score[k].length; h++) {
				System.out.printf("과목: %d\t", h + 1, score[k][h]);
			}
			System.out.printf("평균 : %.2f\t", avg[k]);
			System.out.printf("학점 : %s\n", grade[k]);*/
		
System.out.println("-----------------------전 체 출 력----------------------");
for(k=0; k<score.length; k++) {
	System.out.printf("이름: %s\t", name[k]);
	for(h=0; h<score[k].length; h++) {
		System.out.printf("과목: %d\t", score[k][h]);
		
	}
	System.out.printf("평균: %.2f\t", avg[k]);
	System.out.printf("학점: %s\n", grade[k]);
	
}
	
	}

}
