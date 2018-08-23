package comex.inher;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		// 원하는 순서대로 출력을 해주기 위함

		// DmbCellPhone 객체 생성 //생성자를 불러오는 건가?
		DmbCellPhone dmbcellphone = new DmbCellPhone("자바폰", "분홍", 12);
		// 지정해주는 매개변수의 자료형이 스트링이면 "", 그냥 정수형 즉 인트이면 ""없이 수만 씀

		// CellPhone으로부터 상속받은 필드
		System.out.println("모델:" + dmbcellphone.model);
		System.out.println("색상:" + dmbcellphone.color);
		
		// DmbCellPhone으로부터 상속받은 필드
		System.out.println("채널:" + dmbcellphone.channel);
		
		
		
		// CellPhone으로부터 상속받은 메소드(기능) 호출
		 dmbcellphone.PowerOn();
		 dmbcellphone.Bell();
		 dmbcellphone.sendVoice("여보세요~");
		 dmbcellphone.receiveVoice("안녕하세요, 저는 홍길동인데요~");
		 dmbcellphone.sendVoice("아, 안녕하세요~!");
		 dmbcellphone.hangUp();
		 
		// DmbCellPhone으로부터 상속받은 메소드(기능) 호출
		 dmbcellphone.turnOnDmb();
		 dmbcellphone.changeChannelDmb(10);
		 dmbcellphone.turnOffDmd();
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
