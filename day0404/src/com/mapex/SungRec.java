package com.mapex;

public class SungRec{

	private String name;
	private int kor, eng, mat, tot;
	
	
	//기본 생성자
	public SungRec() {
	
		
	
	}
	
	
	//생성자 함수 만들기 인자값 그대로 받아준다.
	public SungRec(String name, int kor, int eng, int mat) {
		this.name=name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		tot = kor + eng + mat;
		return tot;
	}
	
}
