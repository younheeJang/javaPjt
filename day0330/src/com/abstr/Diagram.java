package com.abstr;

//추상클래스
public abstract class Diagram {
	// 추상메소드
	abstract void draw();

}
/*
 * 추상메소드는 private로 선언 안 됨 
 *  -이유는 자식이 오버라이딩 해야하는데 못하기 때문. 클래스가 다름.
 * 
 * 추상메소드가 static으로 선언될 수 없는 이유
 *  -객체가 없이도 호출이 되는 메소드 이므로
 *   반드시 보디가 정의되어야 호출할 수 있다.
 * 
 *   
 */
