package study;

/*byte -> Byte short -> Short int -> Integer
 * long -> Long float -> Float double ->Double
 * boolean -> Boolean char -> Character
 * 
 * 
 */

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte a_min = Byte.MIN_VALUE;
		System.out.println("a_min 값은 :"+a_min);
		
		byte a_max = Byte.MAX_VALUE;
		System.out.println("a_max 값은 :"+a_max);
		
		char b_min = Character.MIN_VALUE;
		System.out.println("b_min 값은 :"+(int)b_min);
		
		char b_max = Character.MAX_VALUE;
		System.out.println("b_max 값은 :"+(int)b_max);

	
		//숫자를 문자열로 변환 정수 30이 문자열 30으로 변환, 정수 50이 문자열 50으로 변환
		
		int one = 30;
	
    	String ss = String.valueOf(one);
	
    	System.out.println("숫자가 문자열로 변환 : "+ss);
    	
    	
    	int two = 50;
    	String aa = String.valueOf(two);
    	
    	System.out.println("숫자가 문자열로 변환 : "+aa);
    	
    	int three = 100;
    	String th = String.valueOf(three);
    	
    	System.out.println("숫자가 문자열로 변환 : "+th);
    	
    	//문자열을 숫자로 변환 문자열 111이 숫자 111로 변환, 문자열 123이 숫자 123으로 변환 
    	
    	String sss = "111";
    	
    	int b = Integer.parseInt(sss);
    	
    	System.out.printf("문자열을 숫자로 변환 : "+b);
	
    	String aaa = "123";
    	int d = Integer.parseInt(aaa);
    	
    	System.out.printf("문자열을 숫자로 변환 : "+d);
	
	}

}
