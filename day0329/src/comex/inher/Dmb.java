package comex.inher;

public class Dmb extends Cell {

	/*
	 * 디엠비 티비 수신에 필요한 필드 구성: 채널 디엠비 티비 수신에 필요한 기능, 행위 등을 수행할 메소드를 구성 : 전원 on 채널 변경
	 * 전원 off 셀과 디엠비에 생성한 필드를 출력시 정확히 사용하기 위해 해당 필드들을 담아서 초기화해놓을 생성자를 생성한다.
	 */

	// 필드 구성

	int channel;

	// 생성자

	Dmb (String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;

	}

	// 메소드 구성
	void turnOnDmb() {
		System.out.println("채널" + channel + "번을 수신합니다.");
	}

	void changeChannelDmb(int channel) {
		System.out.println("채널" + channel + "번으로 변경합니다.");
	}

	void turnOffDmb() {
		System.out.println("DMB수신을 종료합니다.");
	}

}
