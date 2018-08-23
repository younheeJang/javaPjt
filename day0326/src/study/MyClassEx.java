package study;

//메소드 만들기
class MyClass {

	private String name;
	private int age;

	// 생성자 만들기
	public MyClass() {

		name = "무명";

	}

	public MyClass(String n) {
		name = n;//name은 "무명"이 될 수도 있음

	}

	public MyClass(String n, int a) {

		this(n);// 바로 위 스트링 n값(name=n)/name n값을 가져옴
		
		age = a;

	}

	
	public MyClass(int a, String n) {

		name = n;
		age = a;
		
	}
	
	//생성자 생성규칙에 어긋나지 않는다. 인자값이 다 다르기 때문이다.
	
	
	
	
	
	
	
	
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
