package com.prectice;
//���� ����Ʈ
import java.io.File;
public class Prec2 {

	public static void main(String[] args) {
     //������� ���丮��� ���� ������ 
		File directory = new File("c:/windows");
		//���� ������� �����Ѵٸ�
		if(directory.exists()) {
			//���� ������� ���͸����
			if(directory.isDirectory()) {
				//��Ʈ�� �迭�� ����ְ�, ���������� ����Ʈ �޼ҵ带 �ҷ��� �迭 �ȿ� ����Ʈ�� �־��ش�.
				String [] arr = directory.list();
				//�������� �迭�� �ε����� ��Ʈ�� �迭�� ����ŭ ������ �������� �� ���ϵ��� �̸��� ������ش�.
				for(int i = 0; i <arr.length; i ++) {
					System.out.println("�̸� ���:"+arr[i]);
				}
				
			}
			
		}
		
		
		

	}

}
