/*package com.excp;

public class OperationAuthnticator implements Arithmeticator1 {

	@Override
	public void inputFormat(String str) throws ArithmeticException {

		String temp[]=str.split(",");
		if(temp.length != 2)throw new ArithmeticException ("숫자입력 형식 오류"+str);
		
	}

	@Override
	public void numner(String str) throws ArithmeticException {

		try {
			if(str.indexOf(".") !=-1) {
			double num = Double.parseDouble(str);	
			}else {
				int num = Integer.parseInt(str);
					}
		} catch (NumberFormatException ne) {
			throw new ArithmeticException ("숫자로 변환 불가능:"+str); 
		}
		
		
			}

	@Override
	public void operator(char ch) throws ArithmeticException {

		
		switch(ch) {
		case '+': 		case '-': 		case '*': 		case '/': 
		return;
		default:
		
		throw new ArithmeticException ("연산자 입력 오류 :"+ch);
		
		}
		
		
		
	}

	@Override
	public void operator(String str) throws ArithmeticException {
		// TODO Auto-generated method stub
		
	}

}
*/