package com.stack;

import java.util.*;

import static java.lang.System.out;

public class StackEx2 {

	private static final String colors[] = { "검정", "노랑", "녹색", "청색", "빨강", "연두색" };

	public StackEx2() {  // 푸시 이즈엠티가 아닌동안 팝

		Stack<String> st = new Stack<String>();

		for (String color : colors)
	
			st.push(color);// 배열 안 데이터들이 푸쉬 메소드에 의해 칼라로 들어감
			
		 	popStack(st); //팝 스택 메소드를 호출함으로써 입력과 동시에 출력을 할 수 있게 된다.
	
	}


	
	public void popStack(Stack<String> st) {
		//임포트로 스태이틱 자바 점 랑 점 시스템 점 아웃을 실행해주면
		//프린트시 아웃.프린트로 간결하게 프린트가 가능해 짐
		out.println("pop:");
		while (!st.isEmpty()) {
			
			out.print(st.pop()+"   ");

		}

		
	}

	public static void main(String[] args) {
		
		//이미 다 만들어놓은 메소드이므로 뉴 생성자만 만들어주면 구현이 가능해진다.
		
		new StackEx2();
		
	}

}
