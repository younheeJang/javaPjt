package com.lotto;

import java.util.Scanner;

public class Account1 {

	Scanner sc = new Scanner(System.in);

	String name;
	String account;

	private String password = "1234";

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	// ���»��� �޼ҵ�

	public void input() {

		

	}

	// =========================================================
	// �Է� ��� �ܰ� ���Ḧ ó�� �� ���
	public void process() {

		int withdraw;
		int deposit;
		int balance = 0;
		int i;
		
		System.out.println("������ �Է��ϼ���");
		name = sc.nextLine();
		
		
		do {
			System.out.println();
			System.out.println("���ϴ� ���μ����� �Է��ϼ���" + "\n");

			System.out.println("==============================================");
			System.out.println("1.���»��� || 2.���¸�� || 3.�Ա� || 4.��� || 5.�ܰ� || 0.����");
			System.out.println("==============================================" + "\n");
			i = sc.nextInt();

		if(i==1) {

				System.out.println("�ȳ��ϼ���" + name + "��!");
				System.out.println("===============================");
				System.out.print("���� ��ȣ�� �Է��ϼ���:");
				account = sc.next();
				System.out.print("\n�ʱ� �Աݾ��� �Է��ϼ���:");
				deposit = sc.nextInt();
				balance += deposit;
				System.out.println("==============");
				System.out.println("���� ����");
				System.out.println("==============");
				System.out.print("�̸�:"+name +"\n"+"���¹�ȣ:"+ account);
				System.out.print("\n���°� �����Ǿ����ϴ�.");
				System.out.println();
		}else if(i==2) {
			System.out.println("==============");
			System.out.println("���� ���");
			System.out.println("==============");
				System.out.println("\n===============================");
				System.out.print("���¹�ȣ:"+account + "\n" +"�̸�:"+ name + "\n" +"�ʱ��Աݾ�"+ balance+"\n");
				System.out.println("===============================");
				System.out.println();

		}

		else if(i==3) {
				System.out.println("�ȳ��ϼ���" + name + "��!");
				System.out.println("===============================");
				System.out.print("�Ա��� �ݾ��� �Է��ϼ���" + "\n");
				deposit = sc.nextInt();
				balance += deposit;
				System.out.println();

		}
		else if(i==4) {
				System.out.println("�ȳ��ϼ���" + name + "��!");
				System.out.println("===============================");
				System.out.print("����� �ݾ��� �Է��ϼ���" + "\n");
				withdraw = sc.nextInt();
				balance -= withdraw;
				System.out.println();

		}
		  else if(i==5) {
			  System.out.println("==============");
				System.out.println("�ܰ�");
				System.out.println("==============");
				System.out.printf(name + "���� �ܰ�� %d�� �Դϴ�.", balance);
				System.out.println();
				System.out.println();

		  }
		  else if(i==0) {
			  System.out.println("==============");
				System.out.println("����");
				System.out.println("==============");
				System.out.println();

		  }

		} while (i !=0);
      //       System.out.println("���α׷� ����");
	}
}
