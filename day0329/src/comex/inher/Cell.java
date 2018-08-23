package comex.inher;

public class Cell {

	/*
	 * 핸드폰의 모델명, 색상에 대한 필드를 지정하고 핸드폰의 기능인 전원 온 전원 오프 전화 끊기 목소리전송 목소리수신 등의 기능을 수행할
	 * 메소드를 구현한다.
	 */

	// 필드 생성

	String model;
	String color;

	// 메소드 생성

	// turnOn turnOff sendVoice receiveVoice bell hangOff

	void turnOn() {
		System.out.println("전원 on");
	}

	void turnOff() {

		System.out.println("전원 off");

	}

	void sendVoice(String message) {
		System.out.println("자기 : " + message);

	}

	void receiveVoice(String message) {

		System.out.println("상대방:" + message);

	}

	void bell() {
		System.out.println("벨이 울립니다.");

	}

	void hangOff() {

		System.out.println("전화 종료");
	}

}
