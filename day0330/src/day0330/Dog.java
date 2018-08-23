package day0330;

public class Dog extends Animal {

	private String name;

	public Dog() {
	name = getClass().getSimpleName();//클래스의 이름을 지정하는 메소드 겟 클래스 점 찍고
	//뒤 처럼 누르면 해당 클래스의 이름을 사용할 수 있음  //Dog
  
   
	}
	@Override
	public String Scream() {
		// TODO Auto-generated method stub
		return "멍 !";
	}
	
	@Override
	public String gerName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
	
	
	
	
	
	
}
