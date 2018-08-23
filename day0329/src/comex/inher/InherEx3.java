package comex.inher;

import java.util.Scanner;

public class InherEx3 extends SuperEx3 {

	// 입력
	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("두 수 입력:");
		String str = sc.nextLine();// 공백 포함하는 넥스트
		str = str.replaceAll("\\s", "");
		// 모든 들어오는 문자열들을 바꾼다 문자열 공백 치환 공백도 문자열로 침
		// 두 수 입력 공백으로 띄어줌

		System.out.print("연산자 입력:");
		oper = sc.nextLine();
		oper = oper.trim();// 트림 공백을 제외하고 연산자만 가져오겠다.
		String su[] = str.split(",");// 콤마로 구분하겠다
		num1 = Integer.parseInt(su[0]);// 스트링 문자열로 su 받아서 인트로 치환하여 연산을 수행해준다.
		num2 = Integer.parseInt(su[1]);

	}

	public double calc() {
		double result = 0;
		/*if (oper.equals("+")) {

			result = num1 + num2;
		}
		if (oper.equals("-")) {

			result = num1 - num2;
		}
		if (oper.equals("*")) {

			result = num1 * num2;
		}
		if (oper.equals("/")) {

			result = num1 / num2;
		}*/

		switch(oper) {
		case "+":

			result = num1 + num2;
		break;
		case "-":

			result = num1 - num2;
			break;
		case "*":

			result = num1 * num2;
			break;
		case "/":

			result = num1 / num2;
			break;
		
		}
		return result;
		// 리턴값을 슈퍼의 라이트 메소드로 던져줌
	
		
	}
	public void write(double result) {
		//라이트 메소드 바깥에 필요 변수 설정 후 라이트 메소드에서 사용함 이 메소드의 매게 변수는 리절트
		System.out.println(num1+oper+num2+"="+result);
	}
	
	
	public static void main(String[] args) {
		// 메인에는 출력부분만 쓰면 된다

		InherEx3 ie = new InherEx3();
		ie.input();
		double s = ie.calc();
		ie.write(s);

	}

}
