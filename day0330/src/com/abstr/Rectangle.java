package com.abstr;

//추상메소드는 하위클래스에서 상속을 할 때 오버라이딩을 해줘야 에러가 안 뜬다.
public class Rectangle extends Diagram {

	@Override
	void draw() {
		System.out.println("사각형을 그린다.");

	}
}
