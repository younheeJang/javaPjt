package Ex1;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 2����
		int[][] score;// �л����� ���� ���� ����

		String[] name;
		String[] grade;
		// Ȯ���� ����� ���� ����� �Ҽ��� �迭�� ����
		double[] avg;
		int total = 0, student, subnum, sco;// ������ ���� ����
		int k, h;
		String Sname;

		System.out.print("�л� �� �Է�:");
		student = s.nextInt();

		// �Է��ϴ� �л��� ����ŭ �迭�� ��´�.
		// �迭 �ȿ� �л��� ���� ����.
		
		//2���� ������ ���ھ�� �� �ķ� ���� ��µ�, �� �ʿ� student�� ���� �� ����
		//�л� ���� ���� ������ �Է� �ްڴٴ� ���̴�.
		//�л� ���� ���� �����ϰ� �ȴ�.
		score = new int[student][];

		name = new String[student];
		avg = new double[student];
		grade = new String[student];

		for (int i = 0; i < score.length; i++) {
			// �ε����� ù ������ ���̴ϱ� ��½� �Ϸ� �ٲٱ� ����
			System.out.print((i + 1) + "�� �л� �̸� �Է� : ");
			// �̸��Է�
			Sname = s.next();
			name[i] = Sname;

			// �����
			System.out.print((i + 1) + "���� �л� ����� �Է� : ");
			subnum = s.nextInt();

			// ���⼭���Ͱ� ����Ʈ�� ����� �迭�����ϴ� �� ���� ���� ���ؼ�
			// �л����� �ٸ� ������� �Է¹޾� �迭�� ���̰� ��� �ٸ� �� ����
			score[i] = new int[subnum];

			for (int j = 0; j < score[i].length; j++) {
				System.out.print((i + 1) + "���� �л�" + (j + 1) + "�������Է� : ");
				sco = s.nextInt();

				total += sco;// �հ�

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
		System.out.println("-----------------�� ü �� ��--------------------");
		for (k = 0; k < score.length; k++) {
			System.out.printf("�̸�:%s\t", name[k]);
			for (h = 0; h < score[k].length; h++) {
				System.out.printf("����: %d\t", h + 1, score[k][h]);
			}
			System.out.printf("��� : %.2f\t", avg[k]);
			System.out.printf("���� : %s\n", grade[k]);
		}

	}
	// end for

}
