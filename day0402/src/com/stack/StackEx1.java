package com.stack;

import java.util.*;

public class StackEx1 {

	public static void main(String[] args) {
		
		//스트링형  배열 데이터 생성
		String[] group = {"우즈베키스탄", "쿠웨이트", "사우디", "대한민국"};
		
		
		//스트링형 배열안의 데이터를 스택으로 끌고 들어옴
		Stack<String> stack = new Stack<String>();
		
		
		for(String n : group)
			stack.push(n);
		//푸시 메소드를 이용해서 배열 안의 데이터를 스택에 집어 넣는다.
		
		while(!stack.isEmpty())//이 스택이 비어있지 않으면 이라는 조건
		{
			System.out.println(stack.pop());//스택은 푸쉬 팝 메소드를 각각 입 출력에 활용한다.
		}
		
		

	}

}
