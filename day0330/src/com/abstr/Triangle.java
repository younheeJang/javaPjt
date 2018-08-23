package com.abstr;

//추상메소드는 꼭 하위 클래스에서 오버라이딩을 해줘야 에러가 안 뜬다.

public class Triangle extends Diagram {

	@Override
	void draw() {
		System.out.println("삼각형을 그린다.");
	}

}
