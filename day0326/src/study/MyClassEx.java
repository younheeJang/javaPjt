package study;

//�޼ҵ� �����
class MyClass {

	private String name;
	private int age;

	// ������ �����
	public MyClass() {

		name = "����";

	}

	public MyClass(String n) {
		name = n;//name�� "����"�� �� ���� ����

	}

	public MyClass(String n, int a) {

		this(n);// �ٷ� �� ��Ʈ�� n��(name=n)/name n���� ������
		
		age = a;

	}

	
	public MyClass(int a, String n) {

		name = n;
		age = a;
		
	}
	
	//������ ������Ģ�� ��߳��� �ʴ´�. ���ڰ��� �� �ٸ��� �����̴�.
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}












public class MyClassEx {

	public static void main(String[] args) {

		System.out.println();
		
	}

}
