package comex.inher;

public class DmbCellPhone extends CellPhone {

	//필드
	int channel;
	
	//생성자 모델 색상 채널 새 가지의 매개 변수는 지정할 값에 따라 달라질 수 있다.
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel=channel;
	}
	
	//메소드(하나의 기능을 가짐 행위를 가짐)
	//방송 수신 , 채널 변경, 수신 멈춤 세 가지 기능을 가진 메소드를 이 클래스에서 생성한다.
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 DMB방송 수신을 시작합니다.");
	}
	//이 메소드에서는 채널이 바뀔 수 있으므로 바꾼 채널을 저장할 수 있는 매개 변수가 필요함.
	void changeChannelDmb(int channel) {
	 this.channel = channel;
	 System.out.println("채널 "+channel+"번으로 바꿉니다.");
	}
	
	void turnOffDmd() {
		System.out.println("DMB방송 수신을 멈춥니다.");
		
	}

	
}
