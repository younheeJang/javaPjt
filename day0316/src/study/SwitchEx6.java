package study;
import java.util.Scanner;
public class SwitchEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int year;
		System.out.print("���� ���θ� �˰� ���� �⵵�� �Է��ϼ���.");
		
		year =s.nextInt();	

		String n = ((year%4==0)&&(year%100!=0)||(year%400==0)) ? "����":"���";
		
		//System.out.println(n); �̷��� ���ָ� ����� "����" Ȥ�� "���"���� �����ϰ� ���� �� �ִ�.
	
	System.out.printf("\n�Է��� �⵵ : " + year);
	System.out.printf("\n\n"+"\"%s\""+" �Դϴ�.",n);
	
	}

}
