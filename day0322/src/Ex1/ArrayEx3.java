package Ex1;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// 2���� �迭, ����� �迭
		// �л��� ���� ���� ���� ���� ���ϰ�, ������ �����Ѵ�.

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

		System.out.println("�л� �� �Է� ");
		student = s.nextInt();

		score = new int[student][];// �л� ���� �Է��� ���� ������ ������ �� ���ھ� 2�� �迭 ���� �࿡ �־��־����Ƿ�
		// ù��° �������� ���ǹ��� ���������� ���ھ ���� �� �ִ�.

		name = new String[student];

		avg = new double[student];

		grade = new String[student];

		for (i = 0; i < score.length; i++) {

			System.out.println((i + 1) + "�� �л��� �̸�:");

			Sname = s.next();
			name[i] = Sname;// ������ �� �̸� �迭�� �Է¹��� �̸� ������ ��ġ ��Ų��.
			// ������ �̸� �迭 ������ ����� �� �ֵ��� ���̴�.

			System.out.println((i + 1) + "�� �л� ���� �� �Է�:");
			subnum = s.nextInt();

			score[i] = new int[subnum];

			
			
		
			
			for (j = 0; j < score[i].length; j++) {

				System.out.println((i + 1) + "�� �л�" + (j + 1) + "���� ���� �Է�:");
				sco = s.nextInt();

				// ���� ���� ��Ų������ 2���� �迭�� ����־�� ��
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
	/*	System.out.println("-----------------�� ü �� ��--------------------");
		for (k = 0; k < score.length; k++) {
			System.out.printf("�̸�:%s\t", name[k]);
			for (h = 0; h < score[k].length; h++) {
				System.out.printf("����: %d\t", h + 1, score[k][h]);
			}
			System.out.printf("��� : %.2f\t", avg[k]);
			System.out.printf("���� : %s\n", grade[k]);*/
		
System.out.println("-----------------------�� ü �� ��----------------------");
for(k=0; k<score.length; k++) {
	System.out.printf("�̸�: %s\t", name[k]);
	for(h=0; h<score[k].length; h++) {
		System.out.printf("����: %d\t", score[k][h]);
		
	}
	System.out.printf("���: %.2f\t", avg[k]);
	System.out.printf("����: %s\n", grade[k]);
	
}
	
	}

}
