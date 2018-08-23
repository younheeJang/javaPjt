package com.icex;

import java.io.*;

public class SteamBufferEx1 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Java");
		
		sb.append("1.8");
		//추가
		//출력이 Java1.8로 나온다.
		System.out.println(sb);
		
		//삭제 인덱스값으로 들어간다 시작인덱스위치섭터 끝 인덱스 사이의 문자열 삭제
		sb.delete(2, 3);
		//시작 인덱스 위치서부터 삭제
		System.out.println(sb);
	
		//문자와 문자 사이에 삽입
		sb.insert(3, "A1");
		System.out.println(sb);
	
		
		//시작부터 끝까지 해당 메소드가 실행될 범위를 지정해주는데, 맨 끝 인덱스는 해당 없음
		sb.replace(4, 7, "잘해");
		System.out.println(sb);
	
		sb.reverse();//끝에서부터 역으로
		System.out.println(sb);
	
	
	}
}
