package InputOutput;

// ���� �� �� �̻� �Է� ���� ���
import java.io.*;


public class inputEx4 {

	public static void main(String[] args)throws IOException {
  
		//���� ����
		BufferedReader br = new BufferedReader(
				 new InputStreamReader(System.in));
		
		//����, ����, ���� �� ������ ������ �Է¹޾� �հ踦 ���Ͻÿ�.
		int kor, eng, mat, sum=0;

	System.out.print("��������:");
    kor = Integer.parseInt(br.readLine());
    
	System.out.print("��������:");
    eng = Integer.parseInt(br.readLine());
    
    System.out.print("��������:");
    mat = Integer.parseInt(br.readLine());
		
    sum = kor + eng + mat;

		
		System.out.println("�� ������ �հ��"+sum+"�Դϴ�.");

	}

}
