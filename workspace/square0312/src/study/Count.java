package study;
import java.util.*;
public class Count {
	public static void main(String[] args) {
    	// ��ũ��
		final int DIVISION = 2;
		// ���� ����
		int number;
		int remainder;
		int evenCount = 0;
		int oddCount = 0;
		// ���� ���� ����, ���� �׸��� �ʱ�ȭ
		 Scanner sc = new Scanner (System.in);
		  //1.1. ���� �Է¹޴´�.
			      number = sc.nextInt();
	  // 1. ������ ���� �ƴ� ���� �ݺ��Ѵ�.
	     while(number>0) {     
	     // 1.2. ¦�� ���ο� Ȧ�� ���θ� �Ǻ��Ѵ�.
	     remainder = number%DIVISION;
	     // 1.3. ¦���̸� ¦�� ������ ����.
	     if(remainder == 0) {
	        evenCount++;
	      }
	     // 1.4. Ȧ���̸� Ȧ�� ������ ����.
	     else {
	         oddCount++;
	     }
	  //1.1. ���� �Է¹޴´�.
	     number = sc.nextInt();
	     }
	     
	  // 2. ¦�� ������ Ȧ�� ������ ����Ѵ�.
	     System.out.printf("%d %d\n", evenCount, oddCount);
	     
	     // 3. ������.
		 sc.close();
	}
}
