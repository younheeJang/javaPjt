package com.inher;


//����Ŭ����
public class Cellphone {

	//����ʵ�
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
	
	//�޼ҵ�
	
	public int getChord() {
		return chord;
	}
	
	public void call() {
		System.out.println("��ȭ�� �մϴ�.");
	}
}
