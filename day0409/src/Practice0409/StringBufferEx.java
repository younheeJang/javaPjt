package Practice0409;

import java.io.*;
import static java.lang.System.out;
public class StringBufferEx {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Oracle");

		
		//추가
		sb.append("\n"+800);
		out.println(sb);
		//삽입
		sb.insert(6, "  Java");//인서트는 시작 인덱스부터 들어감.
		out.println(sb);
		//삭제
		sb.delete(12, 16);
		out.println(sb);
		//대체
		sb.replace(6, 8, "★");
		out.println(sb);
		//역행
		sb.reverse();
		out.println(sb);
		
		
	}
}
