package Practice0409;

import java.io.*;
import static java.lang.System.out;
public class StringBufferEx {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Oracle");

		
		//�߰�
		sb.append("\n"+800);
		out.println(sb);
		//����
		sb.insert(6, "  Java");//�μ�Ʈ�� ���� �ε������� ��.
		out.println(sb);
		//����
		sb.delete(12, 16);
		out.println(sb);
		//��ü
		sb.replace(6, 8, "��");
		out.println(sb);
		//����
		sb.reverse();
		out.println(sb);
		
		
	}
}
