package com.excp;

import static java.lang.System.out;

import java.io.IOException;

public class Exception2 {
//트라이 캐치 파이널리 ㅡ 트라이 캐치, 트라이 파이널리도 가능
	public static void main(String[] args)  throws Exception{
		//throws IOException을 트라이 캐치 파이널리 대신 사용할 수 있다. 메인에 넘긴다고 함.
		out.println(1);
		out.println(2);
		try {
			out.println(3);
			out.println(0/0);//예외 발생!!!!!
			out.println(4);
		
		}
		finally {
			//무조건 실행한다.
			//예외 발생 여부에 상관없이.
			out.println("계산 잘해요!");
		}
		out.println(6);
	}

}
