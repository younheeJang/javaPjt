package control;

import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		//����ڷκ��� �̸��� ����, ����, ���� ������ �Է¹޾� �հ�, ���, ����� ó���ϴ� ���α׷� �ۼ�
	
        //���� ����
		
		String name = "";
		
		int kor;
		int eng;
		int math;
		int sum;
		int avg;
		char grade;
		
		//ó������ �ۼ�
		
		/*1. �̸� �� �� ���� ������ �Է¹޴´�.
		 *2. ����� ���Ѵ�.
		 *     2.1. �հ踦 ���Ѵ�.
		 *     2.2. ����� ���Ѵ�.
		 *     2.3. ����� ���Ѵ�.
		 * 3. �̸�,  �հ�� ��� �׸��� ����� ����Ѵ�.
		 *     
		 */
	
		System.out.println("�̸�:");
		name = sc.next();
		System.out.print("���� ����:");
		kor = sc.nextInt();
		System.out.print("���� ����:");
		eng = sc.nextInt();
		System.out.print("���� ����:");
		math = sc.nextInt();
		
	
		sum = kor + eng + math;
		avg = sum/3;
		
		if(avg>=90&&avg<=100) {
			grade = 'S';
		}
		else if(avg>=0&&avg<=89) {
			grade = 'B';
		}
		else if(avg>=70&&avg<=79) {
			grade = 'C';
		}
		else if(avg>=60&&avg<=69) {
			grade = 'C';
		}
		else {
			grade = 'F';
		}
		
		
		System.out.printf("%s���� �������� %d�̸� ����� %d, ����� %s�Դϴ�.\n ", name, sum, avg, grade);
		
	}

}
