package control;

import java.util.*;

public class aaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
        int com, exc, sum = 0;
		
		int avg = 0;
		
		System.out.print("컴퓨터과목 점수:");
		com = sc.nextInt();
		System.out.print("엑셀과목 점수:");
		exc = sc.nextInt();
		

		sum = com + exc;
		avg = sum / 2;
		
		
		System.out.printf("당신의 컴퓨터 점수는 %d이고,\n"+"엑셀 점수는 %d이며,\n또한 점수의 합계는 %d이며,\n"
				+"평균 점수는 %d입니다.", com, exc, sum, avg);
				
		if(avg>=60)  {
			
			if(com >= 40 && exc >= 40) {
				 System.out.println("이번 자격증 시험에 합격하셨습니다.");
				   System.out.println("자격증 취득을 축하드립니다.");
			}
			else {
				System.out.println("이번 자격증 시험에 불합격하셨습니다.");
			    System.out.println("다음 기회에 다시 응시하시기 바랍니다.");
			}
		}
		else {
			System.out.println("이번 자격증 시험에 불합격하셨습니다.");
		    System.out.println("다음 기회에 다시 응시하시기 바랍니다.");
		 
		    
		}
		
	}
}
