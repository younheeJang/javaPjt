package control;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// ���α׷��� ����� ������ �����Ѵ�.
		
		int i = 98; 
	    // ������ ������ ������ �����ϰ� 88�̶�� ����������
		// ���� ����
		
		String grade="";
		
		// ����� ������ ������ �����ϰ� �ΰ����� �ʱ�ȭ�Ͽ���.
		// ����̾簡�� ����ְڴ�.
		
	
	if (i >= 90 && i<= 100) {
	 grade = "��";
	}
	else if(i >= 80 && i <= 89) {
	 grade = "��"; 
	}
	else if(i >= 70 && i <= 79) {
		 grade = "��"; 
		}
	else if(i >= 60 && i <= 69) {
			 grade = "��"; 
		}
	else { // 60�����ϴ� �� ������ ó����
		 grade = "��"; 
		}
	System.out.printf("����� ������ %d�̸�\n"+ "���� ����Ͻ� ����� %s�Դϴ�", i, grade);
	
	
	}

}
