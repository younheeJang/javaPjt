package com.stringtokenizer;
import java.util.StringTokenizer;
import  static java.lang.System.out;
public class StringTokenizerEx2 {
	// ��Ʈ���� ���� ���� �ڸ������� ������ �ȴ�.
	// ������ �޼ҵ�� �߶���߸� ������ �� �� �ְ� �ȴ�.

	

	
	
		public static void main(String[] args) {
			
			String str ="�� ���Ⱑ ���ܿ� ���Ƕ����� ������ ����";	
			StringTokenizer tokens = new StringTokenizer(str, " ");
			for(int x = 1; tokens.hasMoreTokens(); x++) {
				out.print("����"+x+":"+tokens.nextToken()+"\t");
			}
			out.println();
			out.println("===================================");
			
			String[] values = str.split(" ");
			
			for(int i = 0; i<values.length; i++) {
				out.print("����"+(i+1)+":"+values[i]+"\t");
			}
			out.println();
			out.println("===================================");
			
			
			
		}
	
}
