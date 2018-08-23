package com.lotto;
import java.util.Random;
import java.util.Scanner;

/*
 * 
 *가위 바위 보
 *시스템은 랜덤으로 값을 받는다.
 *사용자는 배열을 이용하여 구현한다.
 *
 */

public class GameEx {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		Random rnd = new Random();
		
		String[] ss = {"가위","바위","보"};
		
		int com, me; // 컴퓨터와 사용자
		
		char ch;// 진행여부에 사용할 변수
		
		System.out.println("가위 바위 보");
		System.out.println();
		
	   while(true) {
		   //컴퓨터의 번호를 랜덤으로 구한다
		   com = rnd.nextInt(3)+1;
		   //사용자의 번호를 입력한다.
		   
		  do{
			  
			  System.out.print("1.가위 2.바위 3.보===>");
			 me=sc.nextInt();
		  }while(me<1||me>3);
		
		  System.out.println("컴퓨터:"+ss[com-1]+", 사용자:"+ss[me-1]+"\n");
		  
	  // 컴퓨터와 나의 승패를 비교
		  
		  if(com==me)
		  {System.out.println("컴퓨터와 사용자가 비겼습니다");
			 //컴퓨터와 사용자가 비길 경우 
		  }else if(com==3&&me==1||me>com) 
		  {System.out.println("사용자가 이겼습니다");	           
		  }else if(me==3&&com==1||com>me)
		  {System.out.println("컴퓨터가 이겼습니다");
			  //컴퓨터가 이길 경우
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  System.out.print("계속하시겠습니까?[y/n]");
		  ch=sc.next().charAt(0);
		  if(ch!='Y'&&ch!='y')
			  break;
		  
		  
		  
	   }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
