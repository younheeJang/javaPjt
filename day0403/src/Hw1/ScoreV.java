package Hw1;
import static java.lang.System.out;
public class ScoreV {

	// 학생 관리 프로그램에 필요한 필드를 생성한다.

	private String stuNum, name, birth;
	private int kor, eng, mat, tot;
	
	
	
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
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
		return tot;
	}
	
@Override
public String toString() {

	String str = String.format("%3s  %3s %3s %3d %3d %3d %3d %3.1f", 
			stuNum, name, birth, kor, eng, mat, getTot(), (float)getTot()/3);
	
	return str;
}

	
}
