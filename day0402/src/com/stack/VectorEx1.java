package com.stack;
import java.util.*;
import  static java.lang.System.out;

public class VectorEx1 {

	private static final String colors[] = { "����", "���", "���", "û��", "����", "���λ�" };
	
	public static void main(String[] args) {
		
		int	 i;
		String str;
		//���� ����
		Vector v = new Vector();
		//���Ϳ� ������ ����(�߰�)
		for(i = 0; i<colors.length; i++) {
			//�迭�� �ִ� �����͸� ���Ϳ� �߰�
			v.add(colors[i]);
			//v.add(10);//�����Ͽ���
		}
		str = (String)v.firstElement() ;
		out.println("ù��° ��� :"+str+"\n");
				
		str = (String)v.get(1) ;
		out.println("�ι�° ��� :"+str+"\n");
		
		
		
		//ù��°�� �������� ���� �������� �� �޼ҵ�� ����� �����ϴ�. ��(�ι�°, ����° ���� ���� ǥ��)
		str = (String)v.lastElement() ;
		out.println("������ ��� :"+str+"\n");
		
		
		//��ü���
		
		out.println("\n��ü ���:"+"\n");
		
		/*//���ͷ����� �������̽��� Ȱ���Ͽ� �迭 ��ü�� �Ѳ����� ����Ѵ�.
		//�������̽��� �ִ� iterator()�޼ҵ� Ȱ��
		Iterator it = v.iterator();

			while(it.hasNext()) {
				// ���� ��Ұ� �����ϴ����� ���θ� �����Ѵ�. ��Ұ� ������ next()�޼ҵ忡 ���ؼ� ��Ұ��� ������ ��
			str = (String)it.next();
			out.println(str+" ");
			//����Ʈ�������� ����ϸ� ���η� ���
			}
*/
		
		for(Object o : v) {
			str=(String)o;
			out.print(str+"\t");
			//����Ʈ�� ����ϸ� ���η� ���
		
		}
		
		
		
		out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
