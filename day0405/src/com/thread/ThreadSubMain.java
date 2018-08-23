package com.thread;

public class ThreadSubMain {

	public static void main(String[] args) {

		//메인, 스레드, 스레드 총 3개 돌아간다.
		ThreadSub ts = new ThreadSub("길동", "홍", 1);
		ts.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {	}

		
		ThreadSub ts1 = new ThreadSub("유신","김", 5);
		
		ts1.start();
		try {
			
			Thread.sleep(300);//쉬튼 타임을 늘린 이유는 메인을 종료하지 않기 위함이다.
			
		} catch (InterruptedException e) {
			
			
		}
	}

}
