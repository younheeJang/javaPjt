package com.thread;

public class ThreadEx2 implements Runnable {

	
	private int[] temp;
	
	public ThreadEx2() {
		temp = new int [10];
		for(int start = 0; start < temp.length; start++) {
			
			temp[start] = start;
			
		}
	}
	
	
	//�������̽������� �����带 ������ ��� ��.
	
	@Override
	public void run() {

		for(int start : temp) {
			
			try {
					
				Thread.sleep(100);//1�ʿ� �ѹ��� ��µǵ��� ��  Ÿ�̸Ӹ��� �� Ȱ��
				
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
				
				System.out.printf("������ �̸�: %s,", Thread.currentThread().getName() );
			//���� �������� ���� �̸��� �������� �޼ҵ�.
			
			System.out.printf("temp value:%d %n", start);
			}
			
		
	}

	public static void main(String[] args) {
		
		ThreadEx2 st = new ThreadEx2 ();
		
		Thread t = new Thread(st, "�ι�°");
		t.start();
		//�������̽��� �����ؼ� �����带 Ȱ���� ������ ���ο����� �������� ��ü�� �����ؼ� 
		//�����س��� Ŭ������ ��ü�� �������� �Ű� ���� �ȿ� ���� �־�� �Ѵ�.
		
		/*�������̽� ����ؼ� ���� �� ������ ���� �޼ҵ� ȣ�� ���簡
		 * ������ �������� ���ڷ� �����ؾ� �Ѵ�.
		 * 
		 * 
		 * 
		 */
		
		
		
	}
	
}
