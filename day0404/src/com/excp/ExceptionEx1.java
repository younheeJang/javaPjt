package com.excp;

import static java.lang.System.out;

public class ExceptionEx1 {

	public static void main(String[] args)  {

		int num = 50;
		int result = 0;

		for (int i = 0; i < 10; i++) {

			
			try {
			
			result = num / (int) (Math.random() * 5);
			out.println(result);
			}catch(ArithmeticException ae) {
				ae.printStackTrace();
			}
			
			
		}
	
   }
	
}