package day0330;

public class HospitalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hospital hospital = new Hospital();
		//다형성 구현
		
		//필드                  메소드               사용
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		hospital.inject(dog);
		hospital.inject(cat);
		hospital.inject(tiger);
		
	}

}
