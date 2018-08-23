package study;

import java.util.Scanner; // 콘솔 입력을 위한 클래스

public class Hello {

	public static void main(String[] args) {
		       // 지역변수 선언문들
				int base;
			    int height;
			    int area;
		       // 참조변수 선언, 생성 그리고 초기화
			   Scanner sc = new Scanner (System.in);
			        
			        //1. 제목을 출력한다.
			        System.out.println("가로 길이\t세로 길이\t사각형 넓이");
			        //2. 가로 길이와 세로 길이를 입력받는다.
			        base = sc.nextInt();
			        height = sc.nextInt();
			        
			            // 2.1. 가로 길이를 변환한다.
			            base = base + 7;
			            //2.2. 세로 길이를 변환한다.
			            height = height*3;
			            //2.3. 사각형 넓이를 구한다.
			            area = base*height;
			        //3. 가로 길이와 세로 길이 그리고 사각형 넓이를 출력한다.
	                System.out.printf("%d\t\t %d\t\t %d", base, height, area);
	}
	
}
