package com.mapex;

import java.util.*;
//임포트 해줘야 해시 맵이나 해시 테이블 사용 가능
import static java.lang.System.out;

public class HashTableEx {

	private static final String name[] = { "이순신", "홍길동", "김길동", "김유신", "사오정", "저팔계" };
	// 키는 중복을 허용하지 않음
	private static final String tel[] = { "111-1111", "222-2222", "333-3333", "555-5555", "555-5555", "666-6666" };
	// 값은 중복을 허용함

	public static void main(String[] args) {

		Hashtable<String, String> ht = new Hashtable<String, String>();
		// 해시 테이블에 데이터(키, 값)를 입력해 줄 차례.
		for (int i = 0; i < name.length; i++) {
			ht.put(name[i], tel[i]);
			// 해시테이블의 값을 키를 이용하여 검색
		}//키와 값을 해시테이블에 입력 끝!
		
		String str = ht.get("홍길동");
		//str에 받아온 키값이 널이 아니라면
		if (str != null) {
			out.println("홍길동의 전화번호:" + str);
		//출력한다.
		}
		// 키가 존재하는 지 검색
		if (ht.containsKey("사오정")) {
			out.println("사오정이 존재합니다.");
		}
		// 데이터가 존재하는 지 검색
		if (ht.containsValue("555-5555")) {
			out.println("검색하신 전화번호가 존재합니다.");
		}
		// 저팔계를 삭제하기
		ht.remove("저팔계");

		if (ht.containsKey("저팔계")) {
			out.println("저팔계가 존재합니다.");
		} else {
			out.println("존재하지 않음");
		}

	}

}
