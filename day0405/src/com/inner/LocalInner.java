package com.inner;

public class LocalInner {

	int a = 100;

	// 클래스의 인스턴스 변수
	public void innerEx(int k) {
		// 인스턴스 메소드

		int b = 200;
		// 지역변수
		final int c = k;
		// 들어오는 케이를 상수화 시키겠다는 뜻.
		// static int d = 300;//static 변수는 사용불가
		class Inner {
			// 메소드 안에 들어있는 내부클래스
			public void getData() {

				System.out.println("int a:" + a + "\n" + "int b :" + b + "\n" + "final int c :" + c);
				// 로컬 내부클래스는 지역변수와 상수 모두 사용 가능하다.
			}
		}//end 내부클래스

		//메소드 내에ㅐ 로컬 내부 클래스의 인스턴스  생성가능
		Inner i = new Inner();
		i.getData();
		//생성한 인스턴스(객체)를 통해서 메소드 호출가능함
		
		
	}// end innerEx()

	public static void main(String[] args) {

		LocalInner li = new LocalInner ();
		li.innerEx(1000);
		
	}

}
