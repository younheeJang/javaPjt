package quiz;

import java.util.Scanner;

//============================================================
public class Sung {
	
	Record[] re;
	String[] title = { "국어", "영어", "수학" };
	int count;
	Scanner sc = new Scanner(System.in);

	// ============================================================
	public void process() {

		System.out.println("인원수를 입력하세요");
		count = sc.nextInt();
		re = new Record[count];

		for (int i = 0; i < re.length; i++) {
			re[i] = new Record();
			System.out.print("이름");
			re[i].name = sc.next();

			for (int j = 0; j < re[i].score.length; j++) {
				System.out.printf("%s"+"점수>", re[i].title);  // 타이틀은 "과목 이름" + 점수에서만 쓰인다.
				re[i].score[j] = sc.nextInt();
				re[i].tot += re[i].score[j];
			}
			re[i].kor = re[i].score[0];
			re[i].eng = re[i].score[1];
			re[i].mat = re[i].score[2];
		
			re[i].avg = (double) re[i].tot / re[i].score.length;

			switch ((int) re[i].avg / 10) {
			case 10:
			case 9:
				re[i].grade = 'A';
				break;
			case 8:
				re[i].grade = 'B';
				break;
			case 7:
				re[i].grade = 'C';
				break;
			case 6:
				re[i].grade = 'D';
				break;
			default:
				re[i].grade = 'F';
				break;
			}

		} // End of first FOR

	} 
	// End of process method

	public void ranking() {

		for (int i = 0; i < count; i++) {
			re[i].rank = 1;
		}

		for (int i = 0; i < count - 1; i++) {
			for (int j = i + 1; j < count; j++) {

				if (re[i].tot > re[j].tot)
					re[j].rank++;

				else if (re[i].tot < re[j].tot)
					re[i].rank++;
			}

		}

	}
	
	
	public void print() {
		ranking();
		
		for(int i=0 ; i<re.length;i++) {
		System.out.println("이름: " + re[i].name);
		System.out.println( re[i].title+"점수 : "+ re[i].score);
		/*System.out.println("국어 점수 :" + re[i].score);
		System.out.println("영어 점수 :" + re[i].score);
		System.out.println("수학 점수 :" + re[i].score);*/
		System.out.print("총합 :" + re[i].tot + "평균 :" + re[i].avg + 
				"등급 :" + re[i].grade + "석차 :" + re[i].rank + "\n");
		}
	}
}

/*
 * for (re[i].rank = 0; re[i].rank < re.length; re[i].rank++) { // re[k] = new
 * Record(); int a = re[i].rank; a = 1;}
 * 
 * for (re[i].rank = 0; re[i].rank < re.length-1; re[i].rank++) { int a =
 * re[i].rank; for (int m = 0; m <re.length+1; m++) { int b =re[m].rank; if (a
 * <b ) a++;
 * 
 * }
 */