package study;

public class ValueParameter {

	public int increase(int n) {

		++n;

		return n;

	}
	
	
//값에 의한 호출(call by value)
	public static void main(String[] args) {

		int var1 = 100;

		ValueParameter vv = new ValueParameter();
		int var2 = vv.increase(var1);
		System.out.println("var1:" + var1 + ", var2:" + var2);

		/*메소드 호출시 기본자료형의 값을 인자로 전달받는 방식
		 * 기본 자료형에 속해 있는 값!
		 * 
		 */
		
		
	}

}
