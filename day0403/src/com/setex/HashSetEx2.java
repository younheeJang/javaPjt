package com.setex;

import java.util.*;

public class HashSetEx2 {

	public static void main(String[] args) {
		// 중복을 허용하지 않고 순서도 상관하지 않는다.

		Set<String> dog = new HashSet<String>();
		
		dog.add("진돗개");
		dog.add("휘발유");
		dog.add("삽살개");
		dog.add("풍산개");
		dog.add("셰퍼드");
		
		System.out.print("기존 데이터 set:"+dog);
		System.out.println();
		
	  Iterator it = dog.iterator();
	  
	  while(it.hasNext()) {
		  
		  String str =(String) it.next();
		  System.out.println(str);
		  
	  }
	
	  dog.add("진돗개");
	  //에드로 들어가며 에러는 나지 않지만 실질적으로 데이터는 추가되지 않는다.
	  
		System.out.print("데이터 추가 후 데이터 set:"+dog);	  
	  
	  
	}

}
