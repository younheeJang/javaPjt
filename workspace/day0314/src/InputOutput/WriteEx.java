package InputOutput;

/* �ڹ��� ǥ�� �����
 * 
 *  import java.io.*;  *������ �ξƿ�ǲ ���� ���� ���ص� �� ��밡��
 *  �޼ҵ� �ڿ� throws IOException �ݵ�� �����ؾ� �� (�޼ҵ忡�� �����Ѵٴ� ��)
 * System Class �� �⺻ �����
 * -in, out, err(PrintStream)
 * 
 *
 * print()
 * println()
 * write() -ȭ�� ��½� ���ۿ� ���� (System.out.flush() �޼ҵ带 ȣ��
 * ��, byte �迭 ���ÿ��� autoflush�� ��
 * 
 *  
 * 
 */

import java.io.*; 

public class WriteEx {

	public static void main(String[] args) throws IOException // ����� �� ���� �͵鿡 ���� ����ó�� 
	// TODO Auto-generated method stub
	{/* System.out.write(65);
	//write �޼ҵ带 �̿��Ͽ� ���ۿ� �Է��� ����
	
      System.out.flush(); //���ۿ� �ִ� ������ ����ض�  �׷��� ���� ���� ���. 
      
     //byte�迭������ �޼ҵ尡 �ʿ� ����.
      byte[] by = {'J','A','V','A'};
     
      System.out.write(by, 0, 4); //4 ������ ����, ���� �ϳ��� �Է¹��� ���� �ƽ�Ű �ڵ带 ����Ѵ�.

      // byte�迭 ���ÿ��� autoflash����� ����Ǿ� �ִ�. ������ �� ���������� ���� �� ���� ��� �ȴ�.
*/
   
		System.out.write(71);
		// ���� ���
		
		System.out.flush();
		// ��� �� 0
		
		byte[] te = {'I','U'};
		//����Ʈ �迭 ��Ī 
		//����Ʈ �迭 �޼�Ʈ ���ʿ�
		
		
		System.out.write(te, 0, 2);
		// ���� ���
		// ����Ʈ ��Ī, 0, ���� ���� 
		
		
	}

}
