package study;

public class ValueParameter2 {
//void가 없어서 리턴값 필요
	public int increase(int a) {
		
		++a;//증가 연산자
		return a ;
	}
	
	public static void main(String[] args) {

	int v=100;
	
	ValueParameter2 vv = new ValueParameter2();
	
	int k = vv.increase(v);
	System.out.println("v: " +v+"\n"+"k: "+k);
		
		
		
	}

}
