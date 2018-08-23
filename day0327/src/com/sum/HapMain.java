package com.sum;

public class HapMain {

	public static void main(String[] args) {
	
		Hap ha = new Hap();
		//다른 클래스 안의 메소드 호출
		
		ha.input();//입력
		
		//결과값을 저장해서 출력할 변수를 설정해 주어야 함
		int s = ha.sum(); // 계산
		
		
		ha.write(s);//출력
		
		
		

	}

}
