package study;

class ThisEx {

	String name, jumin, tel; //��Ʈ�� 

	//���Ϳ� ���ʹ� private���� ���� �ٸ� Ŭ���� ���̿��� ���� ������ϱ� ���ؼ� ���̴�
//�޼ҵ�������,  �׷��� ��Ʈ�������� ���Ϳ� ���Ͱ� ���� �� �ִ�. ���⼭�� ��Ʈ�� ������
	//���͸� �־���, �׷��� �ٸ� Ŭ�������� �� ������ �ش��ϴ� ���� ����� �� �� �ֵ��� ����� �ش�.
	//���ʹ� �ִµ� ���Ͱ� ���� ������ �Է��� �̹� �ٸ� �޼ҵ忡�� �Ǿ� �ֱ� �����̴�.
	//�׸��� ���⿡�� ��Ʈ�� ������ �ش��ϴ� ���ڸ� �ۺ��� �����̺���Ʈ�� �ٲ۴ٸ�
	//���͸� �� ����� �Ұ����ϴ�.
	//�� ������ ���ʿ� Ŭ������ �ٸ��� �����̴�.
	
	
	public ThisEx() {
		this.name = "Guest"; //this ��ü �ڽ��� ����
		this.jumin = "000000-1000000";
		this.tel = "000-1111-1234";
	}
	
	
	public  String getName() {
	return name;
	}
	
	

	public  String getJumin() {
	return jumin;
	}
	

	public  String getTel() {
	return tel;
	}
	


	
	//�� ������ ������ ����
	public ThisEx(String name) {
		this();// ���� �Ű������� ���� �������Լ� ȣ��  ��+�� name
		this.name = name;
	}

	public ThisEx(String name, String jumin) {
		this(name);
		this.jumin = jumin;

	}

	public ThisEx(String name, String jumin, String tel) {
		this(name, jumin);
		this.tel = tel;
	}

}





public class ThisEx1 {

	public static void main(String[] args) {
		ThisEx t = new ThisEx();
		System.out.println(t.name);
		System.out.println(t.jumin);
		System.out.println(t.tel);
		System.out.println();
		
		
		
		System.out.println(t.getName());
		System.out.println(t.getJumin());
		System.out.println(t.getTel());
	}

}
