/*package com.excp;

import java.io.*;

public class CalcExam {

	public void calc() throws IOException{
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str;
		char ch;
		
		Arithmeticator1 auth = new OperationAuthnticator();
		
		
		try {
			System.out.println("두 수 [수, 수]:");
			str = br.readLine();
			auth.inputFormat(str);
			
			String temp[] = str.split(",");
					auth.numner(temp[0]);
			auth.numner(temp[1]);
			double su1 = Double.parseDouble(temp[0]);
			double su2 = Double.parseDouble(temp[1]);
			System.out.print("연산자[+-]:");
			ch = (char) System.in.read();
			auth.operator(ch);
			
			double result;
			switch(ch) {
			
			case '+' : result = su1 + su2; break;
			case '-' : result = su1 - su2; break;
			
			case '*' : result = su1 * su2; break;
			
			case '/' : result = su1 / su2; break;
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			}
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		}
		
	}		

	
	public static void main(String[] args) throws IOException {
		
				
			CalcExam oo = new CalcExam();
			oo.calc();
			
			
			
			
	
		
		
		
	}
}
*/