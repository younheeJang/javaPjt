package com.inner;

class OuterEx{
	
	public class InnerEx{
		//���� Ŭ����
		int x = 5;
		
		
		
	}
	
	
}


public class InnerEx1 {

	public static void main(String[] args) {
		
		
		 // OuterEx  �ܺ�Ŭ���� �ν��Ͻ����� ���� �����Ѵ�.
		OuterEx oe = new OuterEx();
		
		//�ܺ�Ŭ������ ���ؼ� ����Ŭ������ �ν��Ͻ��� �����Ѵ�.
	    OuterEx.InnerEx ei = oe.new InnerEx();
	    System.out.println("ei.x:"+ei.x);
		
	}

}
