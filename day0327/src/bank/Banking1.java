package bank;

import java.util.Scanner;

public class Banking1 {

	public static void main(String[] args) {

		Account1 ac = new Account1();
		//�ҷ��� Ŭ������ ��ü�� ������ �ش�.
		
		Scanner sc = new Scanner(System.in);
		
		//��Ʈ������ �޴��� �Է� �޴´�.
		String str ;
	
	
		
		
		System.out.println("�޴��� �����ϼ���.");
		do {
		System.out.println("=========================");
		System.out.println("1. �Ա� 2. ��� 3. �ܰ� 4. ���� ");
		System.out.println("=========================");
        System.out.print("�޴��� �����ϼ���");
        str = sc.nextLine();
        
	    int d =0 ;
	    
	    if(str !=null) {
	    	d =Integer.parseInt(str);
	    	//��Ʈ�� ������ ���� ���ڿ��� �Է��� �޾��� ���� ���ǽ��� ���� ��
	    	//���̾� �� ����ġ���� ���ؼ� ��Ʈ�� ������ ��Ʈ������ ��ȯ�� �� �ְ�,
	    }else {
	     System.out.println("�޴��� ���� �ʾҽ��ϴ�.");
	System.exit(4);    	
	    }
	    
	    switch(d) {
	    
	    case 1: 
	    	//�Ա�
	    System.out.println("\n ===================");
	    	System.out.println("�Ա��Ͻ� �ݾ��� �Է��ϼ���.");
	    	//�Ա��� �ݾ��� �Է� ���� ��Ʈ�� ������ ������ �ش�.
	    	String strdepositIn = sc.nextLine();
	    	long depositLong = Long.parseLong(strdepositIn);
	    	ac.deposit(depositLong);
	    	break;
	    case 2:
	    	//���
	    	 System.out.println("\n ===================");
		    	System.out.println("����Ͻ� �ݾ��� �Է��ϼ���.");
		    	String strwithdraw = sc.nextLine();
		    	long withdrawLong = Long.parseLong(strwithdraw);
	           ac.withdraw(withdrawLong);
		    	break;
	    case 3:
	       //�ܰ�
	    	
	    	System.out.println(ac.getBalance());
	    	ac.getBalance();
	    	break;
	    case 4: break;
	    
	    
	    
	    }
		
		
		}while(! str.equals(4));
		
		
		
	
	}

}
