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
		System.out.println("a_min ���� :"+a_min);
		
		byte a_max = Byte.MAX_VALUE;
		System.out.println("a_max ���� :"+a_max);
		
		char b_min = Character.MIN_VALUE;
		System.out.println("b_min ���� :"+(int)b_min);
		
		char b_max = Character.MAX_VALUE;
		System.out.println("b_max ���� :"+(int)b_max);

	
		//���ڸ� ���ڿ��� ��ȯ ���� 30�� ���ڿ� 30���� ��ȯ, ���� 50�� ���ڿ� 50���� ��ȯ
		
		int one = 30;
	
    	String ss = String.valueOf(one);
	
    	System.out.println("���ڰ� ���ڿ��� ��ȯ : "+ss);
    	
    	
    	int two = 50;
    	String aa = String.valueOf(two);
    	
    	System.out.println("���ڰ� ���ڿ��� ��ȯ : "+aa);
    	
    	int three = 100;
    	String th = String.valueOf(three);
    	
    	System.out.println("���ڰ� ���ڿ��� ��ȯ : "+th);
    	
    	//���ڿ��� ���ڷ� ��ȯ ���ڿ� 111�� ���� 111�� ��ȯ, ���ڿ� 123�� ���� 123���� ��ȯ 
    	
    	String sss = "111";
    	
    	int b = Integer.parseInt(sss);
    	
    	System.out.printf("���ڿ��� ���ڷ� ��ȯ : "+b);
	
    	String aaa = "123";
    	int d = Integer.parseInt(aaa);
    	
    	System.out.printf("���ڿ��� ���ڷ� ��ȯ : "+d);
	
	}

}
