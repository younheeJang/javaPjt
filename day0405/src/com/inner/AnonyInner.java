package com.inner;
import static java.lang.System.out;
//추상 클래스
/*abstract class AbsExam{
	
	int data = 10000;
	
	//추상 메소드
	public abstract void printData() ;
	
	
	
}*/

interface AbsExam{
int data = 10000;
	
	
	public abstract void printData() ;
	
	
}

public class AnonyInner {
//객체가 없는 익명 클래스 이벤트할 때 많이 씀
	
	public void Exam() {
	 	new AbsExam() {
		public void printData() {
			System.out.println("data:"+data);
			
		}
	}.printData();
	}
	public static void main(String[] args) {
		AnonyInner ai = new AnonyInner();
		ai.Exam();
		
	}
}
