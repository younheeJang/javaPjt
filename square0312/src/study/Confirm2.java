package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Confirm2 {

	public static void main(String[] args) throws IOException  {
		/* ���� ��Ī : Confirm.java
		 * ��� : 0���� 100 ������ �� �� ���� �Է¹޾Ƽ� ��Ģ������ ���ִ� ���α׷�
		 * �޼ҵ� : main
		 * ���:���
		 * �Է�:����
		 * �ۼ��� : �� �� ��
		 * �ۼ� ���� : 2018/03/16
		 *  
		 */

		//Scanner s = new scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		 String str =  "" ;
		  System.out.println("��Ģ���� ���α׷�");
		  
		  // ���ѹݺ�
		  while(true){
		   System.out.print("ù��° �� �Է� : ");
		   // Ű����� ���� �Է¹��� ���� String ���̹Ƿ� int ������ ����ؾ� �ϱ� ������
		   String num1 = br.readLine() ;
		   // String ���� int�� ������ parsing(�Ľ�) ���ش�.
		   int a = Integer.parseInt(num1) ;
		   System.out.print("�ι�° �� �Է� : ");
		   // Ű����� ���� �Է¹��� ���� String ���̹Ƿ� int ������ ����ؾ� �ϱ� ������
		   String num2 = br.readLine() ;
		   // String ���� int�� ������ parsing(�Ľ�) ���ش�.
		   int b = Integer.parseInt(num2) ;
		   
		   // ��Ģ���� ��� ���
	         System.out.println("������� : " + PlusResult(a, b));
	         System.out.println("������� : " + MinusResult(a, b));
	         System.out.println("������� : " + MultiplicationResult(a, b));
	         System.out.println("��������� : " + DivideResult(a, b));
		
	         System.out.println("��� �Ͻ÷��� y �� �����Ͻ÷��� n �� ��������");
	         // ����ڰ� �����ϱ� ���� ���� �ޱ� ���� ����
	         System.out.print("�Է��ϼ��� : ");
	         // T
	         str = br.readLine() ;
	   
	         // ����ڰ� �ҹ��ڷ� �Է��Ҽ��� �ְ� �빮�ڷ� �Է��Ҽ� �ִٴ� �����Ͽ�
	         // �ΰ��� ����� ���� �ξ���.
	         if(str.equals("y")||str.equals("Y"))
	          continue ;
	         else if(str.equals("n")|| str.equals("N"))
	          break ;
	         else{
	          System.out.println("������ Ű�� ������ �ʾҽ��ϴ�.") ;
	          System.out.println("���α׷��� �����մϴ�.") ;
	          break ;
	         }
	  }
	  System.out.println("���α׷��� ���� ���� �Ǿ����ϴ�.") ;
	 }
	 
	 // static Ű���带 �ٿ��� �޼���� Ŭ������ ��ü�� �������� �ʰ�
	 // �� �̸��� ������ �ٷ� ȣ���Ҽ� �ִ�.
	 
	 // ��������� return ���ִ� PlusResult �޼���
	 public static int PlusResult(int a, int b){
	  return a + b;
	 }
	 
	 // ��������� return ���ִ� MinusResult �޼���
	 public static int MinusResult(int a, int b){
	  return a - b;
	 }
	 
	 // ��������� return ���ִ� MultiplicationResult �޼���
	 public static int MultiplicationResult(int a, int b){
	  return a * b;
	 }
	 
	 // ����������� return ���ִ� DivideResult �޼���
	 // ������ ����� �Ǽ������� ���ü� �ִ�.
	 public static double DivideResult(int a, int b){
	  return (double)a / b;
		  }



}

