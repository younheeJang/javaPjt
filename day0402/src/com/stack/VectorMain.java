package com.stack;

public class VectorMain  {

	public static void main(String[] args) {
		MyVector mv = new MyVector();
		
		int digit = 5;
		float real = 3.14f;
		char letters[] = {'a', 'b', 'c', 'd'};
		String s = new String("Hello World!");
	
		mv.addInt(digit);
		mv.addFloat(real);
		mv.addCharArray(letters);
		mv.addString(s);
	
		
		//Ãâ·Â
		mv.write();
	}
	
}
