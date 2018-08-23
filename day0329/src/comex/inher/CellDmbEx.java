package comex.inher;

public class CellDmbEx {

	public static void main(String[] args) {
	
		/*앞서 만들어 놓은 두 개의 클래스에 들어 있는 필드 및 메소드를 활용하여 출력 폼을 잡아주기 위해서 
		 *셀 클래스를 상속받은 디엠비 클래스를 이 곳에 객체 생성해준다.
		 */
		
// 객체 생성
		Dmb d = new Dmb("자바폰","노랑",9);
		
		
		//Cell에서 상속받은 필드를 출력
		System.out.println("모델:"+d.model);
		System.out.println("색상:"+d.color);
		//Dmb에서 상속받은 필드를 출력
		
		System.out.println("채널:"+d.channel);
		
		//Cell에서 상속받은 메소드를 출력
		
		d.turnOn();
		d.bell();
		d.sendVoice("여보세요~");
		d.receiveVoice("안녕하세요, 저는 홍길동이라고 합니다~");
		d.sendVoice("아, 안녕하세요~!");
		//Dmb에서 상속받은 메소드를 출력
		d.turnOnDmb();
		d.changeChannelDmb(10);
		d.turnOffDmb();
		
		
	}

}
