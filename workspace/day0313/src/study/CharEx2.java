package study;

/*
 *char : 2byte [unicode���]
 *ex : char ch='\u0041'; ch =65, ch='A';
 *ch a=97
 * 
 * �ƽ�Ű �ڵ� - 1byte ���ڸ� ǥ�� 0 ~ 255
 * �����ڵ� - 2byte ���ڸ� ǥ�� 0 ~ 65535
 * 
 * �ѱ��̳� ���ڴ� 2byte���� ǥ��
 * 
 * 
 */

public class CharEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte var1 = 125; //127������ ������ ��°��� �Ųٷ� ��
		int var2 = 125;
		for(int i = 0; i<5; i++) {
			 var1++;
			 var2++;
		     System.out.println("var1:"+var1+"\t"+"var2:"+var2);
		     
		    
		}
		
	}

}
