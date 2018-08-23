package comex.inher;

public class CellPhone {

	// 필드
	String model;
	String color;

	// 생성자

	// 메소드
	void PowerOn() {
		System.out.println("전원을 켭니다.");
	}

	void PowerOff() {
		System.out.println("전원을 끕니다.");
	}

	void Bell() {
		System.out.println("벨이 울립니다.");
	}

	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

	// 연산식(처리 과정)이 없으면 리턴값이 없나???
	// 스트링 메시지를 매개 변수로 활용하여 샌드보이스라는 메소드의 사용에 활용한다.
	void sendVoice(String message) {
		System.out.println("자기:" + message);
	}

	void receiveVoice(String message) {
		System.out.println("상대방:" + message);
	}

}




