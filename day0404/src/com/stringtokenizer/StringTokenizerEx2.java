package com.stringtokenizer;
import java.util.StringTokenizer;
import  static java.lang.System.out;
public class StringTokenizerEx2 {
	// 스트링은 공백 또한 자릿값으로 포함이 된다.
	// 공백을 메소드로 잘라줘야만 구분을 할 수 있게 된다.

	

	
	
		public static void main(String[] args) {
			
			String str ="나 보기가 역겨워 가실때에는 말없이 고이";	
			StringTokenizer tokens = new StringTokenizer(str, " ");
			for(int x = 1; tokens.hasMoreTokens(); x++) {
				out.print("문자"+x+":"+tokens.nextToken()+"\t");
			}
			out.println();
			out.println("===================================");
			
			String[] values = str.split(" ");
			
			for(int i = 0; i<values.length; i++) {
				out.print("문자"+(i+1)+":"+values[i]+"\t");
			}
			out.println();
			out.println("===================================");
			
			
			
		}
	
}
