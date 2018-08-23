package study;

import java.util.Scanner; // 콘솔 입력을 위한 클래스

public class Hello2 {

	int special;
	
	public static void main(String[] args) {
		       // 지역변수 선언문들
				int base;
			    int height;
			    int area;
		       // 참조변수 선언, 생성 그리고 초기화
			   Scanner scanner = new Scanner (System.in);
			        
			        //1. 제목을 출력한다.
			        System.out.println("가로 길이\t세로 길이\t사각형 넓이\t\tspecial");
			        //2. 가로 길이와 세로 길이를 입력받는다.
			        base = scanner.nextInt();
			        height = scanner.nextInt();
			        Hello2 fe = new Hello2();
			        fe.special = scanner.nextInt();
			            // 2.1. 가로 길이를 변환한다.
			            base = base + 7;
			            //2.2. 세로 길이를 변환한다.
			            height = height*3;
			            //2.3. 사각형 넓이를 구한다.
			            area = base*height;
			            //2.4. 사각형의 넓이에 special 값을 더한다.
			            area = area + fe.special;
			        //3. 가로 길이와 세로 길이 그리고 사각형 넓이를 출력한다.
			            
	                System.out.printf("%d\t\t %d\t\t %d\t\t\t %d\n\n", base, height, area, fe.special);
	                //4. 질문을 한다.
	                System.out.println("질문 : special은 사각형 넓이를 구하는 공식에서 어떻게 사용되었나요?");
	
	}
	
}
