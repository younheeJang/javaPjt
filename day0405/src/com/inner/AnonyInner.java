package com.inner;
import static java.lang.System.out;
//�߻� Ŭ����
/*abstract class AbsExam{
	
	int data = 10000;
	
	//�߻� �޼ҵ�
	public abstract void printData() ;
	
	
	
}*/

interface AbsExam{
int data = 10000;
	
	
	public abstract void printData() ;
	
	
}

public class AnonyInner {
//��ü�� ���� �͸� Ŭ���� �̺�Ʈ�� �� ���� ��
	
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
