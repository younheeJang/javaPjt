package control;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// 프로그램에 사용할 변수를 지정한다.
		
		int i = 98; 
	    // 점수를 저장할 변수를 선언하고 88이라는 정수값으로
		// 값을 설정
		
		String grade="";
		
		// 등급을 판정할 변수를 선언하고 널값으로 초기화하였다.
		// 수우미양가를 집어넣겠다.
		
	
	if (i >= 90 && i<= 100) {
	 grade = "수";
	}
	else if(i >= 80 && i <= 89) {
	 grade = "우"; 
	}
	else if(i >= 70 && i <= 79) {
		 grade = "미"; 
		}
	else if(i >= 60 && i <= 69) {
			 grade = "양"; 
		}
	else { // 60점이하는 이 블럭에서 처리함
		 grade = "가"; 
		}
	System.out.printf("당신의 점수는 %d이며\n"+ "또한 취득하신 등급은 %s입니다", i, grade);
	
	
	}

}
