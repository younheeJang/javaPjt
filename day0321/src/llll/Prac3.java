package llll;

public class Prac3 {

	public static void main(String[] args) {
	
	    //���� ����
		int b;
				
		//�Ӹ� �����
		for(b=4; b<10; b+=2) {
		//4���� �����ؼ� 1�� �ö� 10�� �Ǳ� ������ ��� �׷��� ���� ���� ����	
			//appr(20-b);//����
			app(10-b);//���׶��
			apprs(b*2);//��
			app((10-b)*2);//���׶��
			//appr((40-b));//����
			apprs(b*2);//��
			app(10-b);//���׶��
			
			System.out.println("\n");
		}
		
		//���� �����
		for(b=20; b>=0; b-=2) {
			
			//appr(20-b);//����
			app(20-b);//���׶��
			apprs(b*2);//��
			app(20-b);//���׶��
			
			System.out.println("\n");
			
		}
	
    }



public static void app(int m) {
	int e;
	for(e=0; e<m; e++) {
		System.out.print("��");
		
	}
	
}


public static void appr(int a) {
	
	int i;
	for(i = 0; i<a; i++) {
		
		
			
			System.out.print(" ");
		
	}
		
	}

	public static void apprs(int a) {
		int i;
		for(i = 0; i<a; i++) {
			
		
				
				System.out.print("��");
			}
	
	}
}