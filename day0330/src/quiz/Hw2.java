package quiz;

public class Hw2 {

	public static void main(String[] args) {
	
		
		int i = 1000000;
		int year = 1;
		double result = 0;
		
		while(year<=10) {
			
		result = (double)i*(1+0.045*year);
		
		System.out.printf("%d"+"��° ����"+"%.2f"+"\n", year, result);	
		//"%.2f" �Ǽ������� ������� �� ���� �ڸ����� ������ ��� ����ϰ� ����� ������ �� �ִ�.
		//�Ǽ��� �� ����Ʈ�� ������ ���� �Ҽ��� �� �ڸ������� ����� ����� �� �ֵ��� ����Ʈ������ ������ �̸� ������ �� �� �ִ�.
		//%.�ڸ���f
			
			
			year ++;
		}
		

	}

}
