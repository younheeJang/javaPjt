package solvingEx;

public class MultiplexasionEx3 {

	public static void main(String[] args) {
	
//���� 2�ܿ��� 8�ܱ��� ���η� ���������� ���� ����, +2�� 2�� ������ 4���̴ϱ� �� ����
for(int i = 2; i < 7; i +=4) {
	
	for(int j = 1; j <=9; j++) {
		
		
		for(int k = i; k <= i+3; k++) {
			
			System.out.print(k+"*"+j+"="+k*j);
			System.out.print("\t");
		}
		
		
		System.out.println();
	}
	
	
	
	
	System.out.println();
}


		
	}

}