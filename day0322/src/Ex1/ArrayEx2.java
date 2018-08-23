package Ex1;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 2차원
		int[][] score;// 학생수에 따른 과목별 점수

		String[] name;
		String[] grade;
		// 확실한 결과를 위해 평균을 소수점 배열로 선언
		double[] avg;
		int total = 0, student, subnum, sco;// 마지막 것은 점수
		int k, h;
		String Sname;

		System.out.print("학생 수 입력:");
		student = s.nextInt();

		// 입력하는 학생의 수만큼 배열을 잡는다.
		// 배열 안에 학생의 수가 들어간다.
		
		//2차원 변수인 스코어는 행 렬로 나눠 잡는데, 앞 쪽에 student를 적어 준 것은
		//학생 수에 따른 점수를 입력 받겠다는 뜻이다.
		//학생 수가 행을 구성하게 된다.
		score = new int[student][];

		name = new String[student];
		avg = new double[student];
		grade = new String[student];

		for (int i = 0; i < score.length; i++) {
			// 인덱스의 첫 시작은 영이니까 출력시 일로 바꾸기 위해
			System.out.print((i + 1) + "번 학생 이름 입력 : ");
			// 이름입력
			Sname = s.next();
			name[i] = Sname;

			// 과목수
			System.out.print((i + 1) + "번의 학생 과목수 입력 : ");
			subnum = s.nextInt();

			// 여기서부터가 포인트임 래기드 배열적용하는 곳 과목 수에 대해서
			// 학생마다 다른 과목수를 입력받아 배열의 길이가 모두 다를 수 있음
			score[i] = new int[subnum];

			for (int j = 0; j < score[i].length; j++) {
				System.out.print((i + 1) + "번의 학생" + (j + 1) + "과목성적입력 : ");
				sco = s.nextInt();

				total += sco;// 합계

				score[i][j] = sco;
			}

			avg[i] = (double) total / subnum;
			total = 0;
			switch ((int) (avg[i] / 10)) {

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
		System.out.println("-----------------전 체 출 력--------------------");
		for (k = 0; k < score.length; k++) {
			System.out.printf("이름:%s\t", name[k]);
			for (h = 0; h < score[k].length; h++) {
				System.out.printf("과목: %d\t", h + 1, score[k][h]);
			}
			System.out.printf("평균 : %.2f\t", avg[k]);
			System.out.printf("학점 : %s\n", grade[k]);
		}

	}
	// end for

}
