package Solving;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	/*
	 * �Ҽ��� ������ ������ �����.
	 * ������ ����� �������� �� =2; �������� ��<=�Ҽ��� ���Ϸ��� ������ �ִ밪; �������� �� ++
	 * ������ ����� ������ �� =1; ������ �� <= �������� ��; ������ �� ++
	 * �������� ����� ������ ���� �������� ���� �������� 0�̸�
	 * �Ҽ��� �����Ѵ�.
	 * 
	 * ������ �Ҽ��� 2��� �������� ���� ����Ѵ�.
	 */

	int x = 0;
	
	for(int a = 2; a <=1000; a++) {
		
		for(int b =1; b <=a; b++) {
			if(a%b==0) {
				
				
				x++;
				
			}
			
		}
		if(x==2) {
			
			System.out.println(a);
			
			
			
		}
	x = 0;
	
	}
	
	}
	

}
