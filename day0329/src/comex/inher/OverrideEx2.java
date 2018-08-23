package comex.inher;

public class OverrideEx2 {

	public static void main(String[] args) {
	
		Exam ex1 = new Exam("1111", "홍길동", 60, 80, 60);
		Exam ex2 = new Exam("1111", "홍길동", 100, 100,  100);
	
	System.out.println(ex1.toString());
	System.out.println(ex2.toString());
	
	if(ex1.equals(ex2)) {
		
		System.out.println("같은 사람");
	}else {
		System.out.println("다른 사람");
	}
	
	}

}

