package com.game;

public class Marine extends Unit {

	
	//유닛 클래스 상속 이후 오버라이딩
	@Override
	void move(int x, int y) {
		System.out.println("마린의 위치 이동 좌표는 x:" + x + ", y:" + y + "입니다.");
	}

	@Override
	void stop() {
		System.out.println("마린이 대기 상태에 있습니다.");
	}

	@Override
	void message() {
		System.out.println("Message:: Standing back");
	}

	
	//마린이 가지고 있는 메소드
	void stimPack() {
		System.out.println("마린이 스팀팩을 사용한다.");
	}

}
