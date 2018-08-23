package com.abstr;

public class Dram {

	public static void main(String[] args) {
		// 이 패키지에서 만들어 놓은 지금까지의 추상 클래스와 하위 클래스들을 최종적으로 구현할
		// 메인 메소드가 포함된 클래스.

		//다이아그램 클래스 자체를 배열로 가져옴.
		Diagram[] ref = new Diagram[3];
		
		ref[0]=new Triangle();
		
		ref[1]= new Circle();
		
		ref[2]= new Rectangle();
	
	for(int i = 0; i<ref.length; i++) {
		ref[i].draw();
		//드로우는 다이아그램 클래스에 있던 추상 메소드이다.
		
	}
	
	}

}

