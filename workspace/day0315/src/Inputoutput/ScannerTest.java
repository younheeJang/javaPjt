package Inputoutput;

// 스캐너 사용시 항상 추가해야 함
// s + 컨트롤 스페이스 스캐너 단축기
import java.util.Scanner;
import java.util.*;
import java.io.*; 

public class ScannerTest {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		 // 스캐너 클래스의 인스턴스를 생성한다.
		 // 여기서 인스턴스는 sx 를 의미함.
		  Scanner sx = new Scanner(System.in);
	
		//sx. 누르면 나오는 다양한 종류
        //next, boolean, Byte 등 각각의 자료형에 맞게 사용하면 됨.
	    // 오른쪽에 있는 자료형이 왼쪽보다 작으면 안 됨.
		int a, b;
		char op;
		String name;
		// c언어는 무조건 위와 같이 변수를 먼저 입력을 해줘야 하지만
		//자바에서는 위에 변수를 입력 안해도 int a = sx.nextInt(); 처럼
		//앞에 자료형을 입력해주면 쓸 수 있음
		
		System.out.print("첫번쨰 수:");
	    a = sx.nextInt();
	    System.out.println("연산자 입력:");
	   
	    // charAt(0); ->사칙연산 입력시 4개 중 첫번째(인덱스에서는 영번째) 연산자를 불러오겠다는 뜻.
	    // 이름 홍길동 입력시는 charAt(0);을 뻄.
	    op = sx.next().charAt(0);
	    System.out.println("두번째 수:");
	    
	    //nextInt(); 한 라인을 다 들인다는 뜻
	    b = sx.nextInt();
	    
	    sx.nextLine();
	    //결과 출력(입력 후)에 마지막으로 커서(깜빡깜빡)의 흔적이 남으면
	    //그 흔적을 지우기 위해서 
	    //int(정수)형에서 string(문자형)으로 넘어갈 때 한번만  
	    // sx.nextLine();를 입력해 준다. 깔끔
	    
	    //출력할 때
	    System.out.print("이름 :");
	  
	  //nextLine(); 한 라인을 다 들인다는 뜻 문자열 받기
	   // 입력을 '받을' 때
	  	    name = sx.nextLine();
	    
	  	    
	    System.out.println();
	    // 이름 입력 받고 출력하려면 printf필요
	    //

	    
	}

}
