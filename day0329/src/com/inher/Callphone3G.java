package com.inher;

public class Callphone3G extends Cellphone{
@Override
public void call() {
	System.out.println("영상통화를 합니다");
}

//오버 로딩 하나의 클래스 내 오버 라이딩 다른 클래스 (클래스 최소 두 개 필요)
public void call(String s) {

	
}

}
