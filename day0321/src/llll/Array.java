package llll;

public class Array {

	public static void main(String[] args) {
	// �迭�� ���� �� ���� �� ���� ���ϰ� ����� ���Ѵ�.
		int[] s = {95, 71, 82, 62, 30};
		
		int sum = 0;
		for(int sc: s) {
			sum+=sc;
			
		}
	System.out.println("���� ���� ="+sum);
	double avg =(double)sum/s.length;
	System.out.println("���� ��� ="+avg);
	
	}

}
