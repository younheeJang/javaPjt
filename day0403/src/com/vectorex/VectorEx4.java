package com.vectorex;

import java.util.*;
import java.util.Vector;

public class VectorEx4 {

	public static void main(String[] args) {
		// 클래스 자체가 백터로 들어올 수 있다. 클래스도 객체이기 때문이다.

		Vector<MyData> v = new Vector<MyData>();
		
		v.add(new MyData("홍길동",23));
		v.add(new MyData("김길동",26));
		v.add(new MyData("서길동",27));
		v.add(new MyData("이길동",30));
		
		
		//출력은 포문을 이용해서 한다.
		for(MyData my : v)
			System.out.printf("이름:%s, 나이:%d\n", my.name, my.age);
		
		
	}

}
