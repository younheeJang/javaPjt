package com.mapex;

import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class HashMapEx1 {
	public static void main(String[] args) throws IOException {

		/*
		 * Map<키, 값> : 키는 중복을 허용하지 않음 값은 중복을 허용함
		 */

		// 해시 맵
		Map<String, String> map = new HashMap<String, String>();
		// 순서는 벡터말고는 없다. 맵에서도 마찬가지로 순서가 없다.
		// 백터는 리스트구조이기 때문에 순서가 있음.


		out.println(map);
		out.println();
		// 키캆 셋을 이용함
		String key;
		//스트링은 입력되면서 자동으로 객체(오브젝트) 형로 변한다.
		Set set = map.keySet();
		// 맵에 키값을 세팅하고 키셋이라는 메소드를 이용해서 키값만 출력
		
		//인터페이스 이터레이터를 가지고 키를 사용하여 전체 출력을 하게 되면 값이 순서대로 나올 수 있음.
		Iterator it = set.iterator();
		while (it.hasNext()) {
			//이터레이터를 가지고 키를 입력받아 출력에 이용하려고 할 때에는 (String)과 같이 이터레이터
			//입력 부분 앞에 스트링으로 강제 변환을 해줘야 함. 키가 스트링이다.
			key = (String) it.next();
			out.println(map.get(key));
		}
		out.println();

		map.put("영화", "아이언맨");
		out.println(map);
		out.println();
		
		//동일한 키일 때는 값을 변경한다.
		//영화 라는 동일한 키에 아이언맨이라는 새로운 값을 입력하면 같은 맵을 출력하게 되었을 때
		//키에 딸려있는 값이 아이언맨으로 바뀌어서 출력된다.
			
	}

}
