package day0330;

public class Dog extends Animal {

	private String name;

	public Dog() {
	name = getClass().getSimpleName();//Ŭ������ �̸��� �����ϴ� �޼ҵ� �� Ŭ���� �� ���
	//�� ó�� ������ �ش� Ŭ������ �̸��� ����� �� ����  //Dog
  
   
	}
	@Override
	public String Scream() {
		// TODO Auto-generated method stub
		return "�� !";
	}
	
	@Override
	public String gerName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
	
	
	
	
	
	
}
