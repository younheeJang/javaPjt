package comex.inher;

import java.util.Scanner;

public class InherEx3 extends SuperEx3 {

	// �Է�
	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("�� �� �Է�:");
		String str = sc.nextLine();// ���� �����ϴ� �ؽ�Ʈ
		str = str.replaceAll("\\s", "");
		// ��� ������ ���ڿ����� �ٲ۴� ���ڿ� ���� ġȯ ���鵵 ���ڿ��� ħ
		// �� �� �Է� �������� �����

		System.out.print("������ �Է�:");
		oper = sc.nextLine();
		oper = oper.trim();// Ʈ�� ������ �����ϰ� �����ڸ� �������ڴ�.
		String su[] = str.split(",");// �޸��� �����ϰڴ�
		num1 = Integer.parseInt(su[0]);// ��Ʈ�� ���ڿ��� su �޾Ƽ� ��Ʈ�� ġȯ�Ͽ� ������ �������ش�.
		num2 = Integer.parseInt(su[1]);

	}

	public double calc() {
		double result = 0;
		/*if (oper.equals("+")) {

			result = num1 + num2;
		}
		if (oper.equals("-")) {

			result = num1 - num2;
		}
		if (oper.equals("*")) {

			result = num1 * num2;
		}
		if (oper.equals("/")) {

			result = num1 / num2;
		}*/

		switch(oper) {
		case "+":

			result = num1 + num2;
		break;
		case "-":

			result = num1 - num2;
			break;
		case "*":

			result = num1 * num2;
			break;
		case "/":

			result = num1 / num2;
			break;
		
		}
		return result;
		// ���ϰ��� ������ ����Ʈ �޼ҵ�� ������
	
		
	}
	public void write(double result) {
		//����Ʈ �޼ҵ� �ٱ��� �ʿ� ���� ���� �� ����Ʈ �޼ҵ忡�� ����� �� �޼ҵ��� �Ű� ������ ����Ʈ
		System.out.println(num1+oper+num2+"="+result);
	}
	
	
	public static void main(String[] args) {
		// ���ο��� ��ºκи� ���� �ȴ�

		InherEx3 ie = new InherEx3();
		ie.input();
		double s = ie.calc();
		ie.write(s);

	}

}
