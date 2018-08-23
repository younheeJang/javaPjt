
//컨트롤 시프트 에프

package study;

import java.util.*;

public class Message {

	public static void main(String[] args) {

		/*
		 * 파일 이름 : Message.java 
		 * 기 능 : 학년과 성명을 입력받아 학년 메시지를 출력 
		 * 작 성 자 : 장 윤 희 작성 일자 :
		 * 2018-03-15
		 */

		// 변수 선언
		int grade = 0;
		String name;
		String message;

		// 참조 변수 선언, 생성 그리고 초기화
		Scanner sc = new Scanner(System.in);

		/*
		 * 1.학년을 입력받는다.
		 *  1.1. 1학년일 경우, 해당 메시지를 출력한다.
		 *  1.2. 2학년일 경우, 해당 메시지를 출력한다 
		 *  1.3. 3학년일 경우, 해당 메시지를 출력한다.
		 *  1.4. 4학년일 경우, 해당 메시지를 출력한다
		 *  1.5. 5학년일 경우, 해당 메시지를 출력한다 
		 *  1.6. 6학년일 경우, 해당 메시지를 출력한다
		 * 
		 * 2. 해당 학년에 맞는 명찰 색깔을 알려준다.
		 *  2.1. 1학년일 경우, "빨강"을 출력한다.
		 *  2.2. 2학년일 경우, "주황"을 출력한다
		 *  2.3. 3학년일 경우, "노랑"을 출력한다.
		 *  2.4. 4학년일 경우, "초록"을 출력한다
		 *  2.5. 5학년일 경우, "파랑"을 출력한다
		 *  2.6. 6학년일 경우, "보라"를 출력한다
		 */

		// System.out.println("\"Hello World\"");

		System.out.println("이름을 입력하세요.");
		name = sc.nextLine();

		System.out.println("학년을 입력하세요.");
		grade = sc.nextInt();

		switch (grade) {

		case 1:
			System.out.println("\"FRESHMAN\"\n");
			System.out.println("빨강색 명찰을 달아주세요.");
			break;

		case 2:
			System.out.println("\"SOPHOMORE\"\n");
			System.out.println("주황색 명찰을 달아주세요.");
			break;
		case 3:
			System.out.println("\"JUNIOR\"\n");
			System.out.println("노랑색 명찰을 달아주세요.");
			break;
		case 4:
			System.out.println("\"SENIOR\"\n");
			System.out.println("초록색 명찰을 달아주세요.");
			break;
		case 5:
			System.out.println("\"5th GRADE\"\n");
			System.out.println("파랑색 명찰을 달아주세요.");
			break;
		case 6:
			System.out.println("\"6th GRADE\"\n");
			System.out.println("보라색 명찰을 달아주세요.");
			break;
		}

	}

}
