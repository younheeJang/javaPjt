package com.inher;


//상위클래스
public class Cellphone {

	//멤버필드
	String model;
	String number;
	int chord;
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String n) {
		this.number=n;
	}
	
	public String getModel() {
		return model;
	}
	
	//메소드
	
	public int getChord() {
		return chord;
	}
	
	public void call() {
		System.out.println("통화를 합니다.");
	}
}
