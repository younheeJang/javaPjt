package com.inter;

public class InterExam2 implements Interface3 {
//클래스에 
	
	int a = 100;

	
	
	@Override
	public int gerA() {
		return a;
	}

	@Override
	public int getData() {
		return a+1;
	}

	public static void main(String[] args) {
		InterExam2 it= new InterExam2();
		Interface1 it1 = it;
		Interface2 it2 = it;
		Interface3 it3 = it;

	System.out.println(it1.gerA());
	System.out.println(it2.gerA());
	System.out.println(it3.getData());
	
	System.out.println(it1 instanceof Object);
	System.out.println(it instanceof Interface1);
	System.out.println(it instanceof Interface2);
	System.out.println(it instanceof Interface3);
 System.out.println();
	
	
	}
	
}
