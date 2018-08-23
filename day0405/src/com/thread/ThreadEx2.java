package com.thread;

public class ThreadEx2 implements Runnable {

	
	private int[] temp;
	
	public ThreadEx2() {
		temp = new int [10];
		for(int start = 0; start < temp.length; start++) {
			
			temp[start] = start;
			
		}
	}
	
	
	//인터페이스에서는 스레드를 참조해 줘야 함.
	
	@Override
	public void run() {

		for(int start : temp) {
			
			try {
					
				Thread.sleep(100);//1초에 한번씩 출력되도록 함  타이머만들 때 활용
				
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
				
				System.out.printf("스레드 이름: %s,", Thread.currentThread().getName() );
			//현재 스레드의 현재 이름을 가져오는 메소드.
			
			System.out.printf("temp value:%d %n", start);
			}
			
		
	}

	public static void main(String[] args) {
		
		ThreadEx2 st = new ThreadEx2 ();
		
		Thread t = new Thread(st, "두번째");
		t.start();
		//인터페이스와 연동해서 스레드를 활용할 때에는 메인에서도 스레드의 객체를 생성해서 
		//생성해놓은 클래스의 객체를 스레드의 매개 변수 안에 집어 넣어야 한다.
		
		/*인터페이스 상속해서 구현 시 스레드 시작 메소드 호출 ㅂ루가
		 * 스레드 생성자의 인자로 구현해야 한다.
		 * 
		 * 
		 * 
		 */
		
		
		
	}
	
}
