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
		//스레드 구현 메소드
		for(int start : temp) {
			
		try {
				
			sleep(100);//1초에 한번씩 출력되도록 함  타이머만들 때 활용
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			
			System.out.printf("스레드 이름: %s,", currentThread().getName() );
		//현재 스레드의 현재 이름을 가져오는 메소드.
		
		System.out.printf("temp value:%d %n", start);
		}
		
		
	}
	
	public static void main(String[] args) {
	
		//스레드 생성
		ThreadEx1 st = new ThreadEx1("첫번째");
		
		st.start();//스타트 메소드를 이용하여 스레드를 가동
		
		
	}
	
	
	
}
