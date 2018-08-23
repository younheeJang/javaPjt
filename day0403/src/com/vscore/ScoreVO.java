package com.vscore;

public class ScoreVO {
	//VO를 만듦!
	// 성적 관리에 필요한 필드만
	private String hak, name, birth;
	private int kor, eng, mat, tot;

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
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

	// 토털은 입력이 필요없고 출력만 할 것이라서 셋 토털은 지워준다.

	@Override
	public String toString() {

		String str = String.format("%7s %10s %6s %5d %5d %5d %5d %6.1f", hak, name, birth, kor, eng, mat, getTot(),
				(float) getTot() / 3);

		return str;
	}

}
