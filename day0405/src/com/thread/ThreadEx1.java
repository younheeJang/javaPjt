package com.thread;

public class ThreadEx1 extends Thread{
//
	
	private int[] temp;
	public ThreadEx1(String threadname) {

		
		super(threadname);
		temp = new int [10];
		for(int start = 0; start < temp.length; start++) {
			
			temp[start] = start;
			
		}
		
	}
	
	@Override
	public void run() {
		//������ ���� �޼ҵ�
		for(int start : temp) {
			
		try {
				
			sleep(100);//1�ʿ� �ѹ��� ��µǵ��� ��  Ÿ�̸Ӹ��� �� Ȱ��
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			
			System.out.printf("������ �̸�: %s,", currentThread().getName() );
		//���� �������� ���� �̸��� �������� �޼ҵ�.
		
		System.out.printf("temp value:%d %n", start);
		}
		
		
	}
	
	public static void main(String[] args) {
	
		//������ ����
		ThreadEx1 st = new ThreadEx1("ù��°");
		
		st.start();//��ŸƮ �޼ҵ带 �̿��Ͽ� �����带 ����
		
		
	}
	
	
	
}
