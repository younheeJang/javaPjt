package com.cccc;

import java.util.*;

public class WeekDay {

	private int y, m, d;// �� �� ��

	// �� �� ���� �Է¹޴� �޼ҵ�
	public void input() {

		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �� �Է�:");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();

	}

	// ���� ���� �޼ҵ� ����
	public String week() {
	 //�迭 �̿� 
	 //2���� ��� ���⿡ ���� �ٸ��� ���ƾ� �ϱ� ������ 0���� �迭 ����
	 //�� ���� ������ ��¥�� �迭ȭ �� ������ �迭ȭ�Ѵ�.
	 int [] months = {31, 0, 31, 30, 31, 30 ,31, 31, 30, 31,30, 31};
	 
	 //������ �迭ȭ
	 String[] weekNames= {"��","��", "ȭ", "��", "��", "��", "��" };
	 
	 int nalsu;//�� ��¥ �� 
	 int i;//�ݺ��� ��� ���� 
     int w;//���ڸ� ���Ϸ� �Ǻ�	 
	 
     /*���⿡ ���� 2���� ��¥�� ���
      * ���� : 2���� ������ ��¥�� 29�Ϸ� 
      * ��� : 2���� ������ ��¥�� 28��
      */
     
     //return 
     
     if(y %4 ==0 && y !=100||y%400==0) {
    	//���� �̶�� ����
   //�ε����� 0���� �����ϹǷ� 2�� �迭�� [1]�� �����
    	 months[1]=29;
     
     }else {
    	 //���
    	 months[1] =28;
     }
     
     // ��¥ ���� ���
     //1�� 1�� 1�� �Է� ���� �⵵ ���� �⵵ �� 12�� 31�� ������ ��¥ �� ���
     //2015�� �Է� �� 2014�� ���� ��¥ �� ��� y-1
    nalsu =(y-1)*365+(y-1)/4-(y-1)/100+(y-1)/400;
   System.out.println(nalsu);
     //�Է¹��� ��(8��)�̸� ���� ��(7)������ ��¥ �� ���
    for(i=0; i<(m-1); i++ ) 
    	nalsu+=months[i];
    	//System.out.println(nalsu);
    	//�Է¹��� ���� ��¥��ŭ �� �� �߰��ϴ� ���
    nalsu+=d;	
   System.out.println(nalsu);
     
    //���� �������� Ȯ���ϱ� ���� ���
    
    w= nalsu%7;
    //�Ͽ���.   ��ü ��¥ �� %7==0
    //������.   ��ü ��¥ �� %7==1
    //ȭ����.   ��ü ��¥ �� %7==2
    //������.   ��ü ��¥ �� %7==3
    //�����.   ��ü ��¥ �� %7==4
    //�ݿ���.   ��ü ��¥ �� %7==5
    
    
   System.out.println(w);
    
    
    
    
    
    return weekNames[w];
    
	}
    
    //���
    
    public void write(String day) {
    	System.out.printf("%d�� %d�� %d�� -> %s ����\n", y, m, d, day);
    
    } 
	
     
     
 }


