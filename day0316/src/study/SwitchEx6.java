package study;
import java.util.Scanner;
public class SwitchEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int year;
		System.out.print("윤년 여부를 알고 싶은 년도를 입력하세요.");
		
		year =s.nextInt();	

		String n = ((year%4==0)&&(year%100!=0)||(year%400==0)) ? "윤년":"평년";
		
		//System.out.println(n); 이렇게 해주면 출력이 "윤년" 혹은 "평년"으로 간단하게 나올 수 있다.
	
	System.out.printf("\n입력한 년도 : " + year);
	System.out.printf("\n\n"+"\"%s\""+" 입니다.",n);
	
	}

}
