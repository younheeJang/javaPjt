package com.icex;
import java.util.*;
public class CalendarEx {

	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("����");
		
		Calendar now = Calendar.getInstance();
		//�ν��Ͻ��޼ҵ带 ��� �ȿ� ������ ��� �޼ҵ带 ������ �� ����.
		
		int week_yy= now.get(now.WEEK_OF_YEAR);
		int yy= now.get(now.YEAR);
		int mm= now.get(now.MONTH)+1;
		int dd= now.get(now.DAY_OF_MONTH);
		
		sb.append(week_yy);
		sb.append("��°��");
		sb.append(yy);
		sb.append("��");
		sb.append(mm);
		
		sb.append("��");
		sb.append(dd);
		sb.append("��");
		System.out.println(sb.toString());
		
		
		
		
		
	}
}