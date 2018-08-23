package forex1;

import java.util.Scanner;

//import java.io,*;
public class DowhileEx3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		
		//두와일문은 메뉴 이용할 때 사용
		int menu=0;
		do {
        System.out.println("1.회원가입");
        System.out.println("2.회원조회");
        System.out.println("3.회원탈퇴");
        System.out.println("0.프로그램종료");
        
        System.out.println("메뉴를 선택하세요");
        menu=sc.nextInt();
        
      //  System.in.skip(2);
        
        
			
		}while(menu!=1&&menu!=2&&menu!=3&&menu!=0);
		System.out.println("당신이 선택한 것은: "+menu);
		
		
	}

}
