package com.setex;

import java.util.*;

public class HashSetEx2 {

	public static void main(String[] args) {
		// �ߺ��� ������� �ʰ� ������ ������� �ʴ´�.

		Set<String> dog = new HashSet<String>();
		
		dog.add("������");
		dog.add("�ֹ���");
		dog.add("��찳");
		dog.add("ǳ�갳");
		dog.add("���۵�");
		
		System.out.print("���� ������ set:"+dog);
		System.out.println();
		
	  Iterator it = dog.iterator();
	  
	  while(it.hasNext()) {
		  
		  String str =(String) it.next();
		  System.out.println(str);
		  
	  }
	
	  dog.add("������");
	  //����� ���� ������ ���� ������ ���������� �����ʹ� �߰����� �ʴ´�.
	  
		System.out.print("������ �߰� �� ������ set:"+dog);	  
	  
	  
	}

}
