package study;

import java.util.Scanner; //��ĳ�� ����

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		
		//�������� ���� ȣ������!
		/*1. Random Ŭ������ ���
		 * import java.util.Random;
		 * Random random = new Random();
		 * ->System.out.println(random.nextBoolean()); �̰��� boolean��
		 * ->System.out.println(random.nextInt()); �̰��� ������
		 * ->System.out.println(random.nextInt(100)+1); ((�ִ�)+���۰�) 
		 * 
		 * 2. Math Ŭ������ random() �޼ҵ� ���
		 * random() �޼ҵ�� ����(��ȯ)���� double�̴�.
		 * �Ǽ��� ��ȯ�ϱ� ������ �տ� (int)�� �����ؼ� �� ��ȯ�� �ؾ� ��
		 * 
		 * ->int ranValue = (int)(Math.random()*100+1); *�ִ�+���۰�
		 * 
		 */
		
		
		//�̸��� �Է¹޾� ����, ����, ���� ������ �������� �����غ���.
		
		//�̸��� �Է� ����.
		System.out.println("�̸��� �Է��� �ּ���.");
		String name =s.nextLine();
		
		
		//���� ���� ���� ������ ���� ������ ������.
	
		
		
		// �������� ���� ó���� ����.
		int ranValue1 = (int) (Math.random()*100+1);
		//System.out.println(ranValue1);
		int ranValue2 = (int) (Math.random()*100+1);
		//System.out.println(ranValue2);
		int ranValue3 = (int) (Math.random()*100+1);
		//System.out.println(ranValue3);
	
		System.out.println(name+"���� ���� ������"+ranValue1);
		System.out.println("\n"+name+"���� ���� ������"+ranValue2);
		System.out.println("\n"+name+"���� ���� ������"+ranValue3+"�Դϴ�.");
		
	    int sum = ranValue1+ranValue2+ranValue3;
	    int avg = sum/3;
	    
		
	    System.out.println("\n������ "+sum+"�̸� �����"+avg+"�Դϴ�.");
	    
	    
	    switch(avg) {
	    
	    case 100 :
	    	System.out.println("Serendipity!");
	    	break;
	    	
	    case 90 :
	    	System.out.println("Lucky!");
	    	break;
	    	
	    case 80 :
	    	System.out.println("Lucky!");
	    	break;
	    	
	    case 70 : 
	    	System.out.println("Middle~");
	    	break;
	    	
	    case 60 : case 50 : case 40 : case 30 : case 20 : 
	    	System.out.println("SoSo-");
	    	break;
	    	
	    case 10 : case 0 : 	
	    	System.out.println("Unlucky!");
	    	break;
	    	
	    
	    }
		
		
	}
	
	

}
