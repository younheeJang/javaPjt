package day0330;

public class HospitalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hospital hospital = new Hospital();
		//������ ����
		
		//�ʵ�                  �޼ҵ�               ���
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		hospital.inject(dog);
		hospital.inject(cat);
		hospital.inject(tiger);
		
	}

}
