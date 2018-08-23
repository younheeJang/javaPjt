package Account;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
// ===================================================================
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.���»��� | 2.���¸��| 3.����|4.���|5.����");
			System.out.println("------------------------------------------------");
			System.out.print("����>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("���α׷� ����");
	}
//==============================================================
	// ���»����ϱ�
	private static void createAccount() {
		System.out.println("----------------------");
		System.out.println("���� ����");
		System.out.println("----------------------");

		System.out.print("���¹�ȣ:");
		String ano = scanner.next();
		System.out.print("������:");
		String owner = scanner.next();

		System.out.print("�ʱ� �Աݾ�");
		int balance = scanner.nextInt();
	Account newAccount = new Account(ano, owner, balance);
		for(int i=0; i<accountArray.length; i++) {
			//accounArray�迭�� ����ִٸ�
			if(accountArray[i]==null){
				accountArray[i]=newAccount;// ���ο� newAccount�� �߰��Ѵٴ� ��
				System.out.println("���:���°� �����Ǿ����ϴ�.");
			break;
			}
			
		}
		
	}
//================================================================
	// ���¸�Ϻ���
	private static void accountList() {
		System.out.println("----------------------");
		System.out.println("���� ���");
		System.out.println("----------------------");

		for(int i=0; i<accountArray.length; i++) {
			
			Account account = accountArray[i];
			
			if(account!=null) {
				//���°� �����Ѵٸ�
				System.out.print("���� ��ȣ :"+account.getAno());
				System.out.println("     ");
				System.out.print("�̸� :"+account.getOwner());
				System.out.println("     ");
			System.out.print("�Աݾ�:"+account.getBalance());
			System.out.println("     ");
			}
		}
		
	}
//==================================================================
	// �����ϱ�
	private static void deposit() {
		System.out.println("----------------------");
		System.out.println("�Ա�");
		System.out.println("----------------------");
System.out.println("���¹�ȣ:");
	String ano =scanner.next();
	System.out.println("���ݾ�:");
	int money = scanner.nextInt();
	Account account = findAccount( ano);
	if(account==null) {
		System.out.println("���°� �����ϴ�.");
		return;
	}
	account.setBalance(account.getBalance()+money);
	System.out.println("���: ������ ���������� �Ϸ�Ǿ����ϴ�.");
	
	}
//================================================================================
	// ����ϱ�
	private static void withdraw() {
		System.out.println("----------------------");
		System.out.println("���");
		System.out.println("----------------------");
		System.out.println("���¹�ȣ:");
		String ano =scanner.next();
		System.out.println("��ݾ�:");
		int money = scanner.nextInt();
		Account account = findAccount( ano);
		if(account==null) {
			System.out.println("���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance()-money);
		System.out.println("���: ����� ���������� �Ϸ�Ǿ����ϴ�.");
		
		}


//================================================================================
	// Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		Account account = null;
for(int i =0; i<accountArray.length; i++) {
	if(accountArray[i]!=null) {
	String Ano=	accountArray[i].getAno();//accountArray�迭�� �ִ� ���� ��ȣ�� �����ͼ� ���ο� ������ ����
	if(Ano.equals(ano)) {
		account =accountArray[i];
		break;
	}
	
	
	}
}
		return account;
	}

}
