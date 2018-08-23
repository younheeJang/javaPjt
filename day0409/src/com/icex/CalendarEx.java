package com.icex;
import java.util.*;
public class CalendarEx {

	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("년중");
		
		Calendar now = Calendar.getInstance();
		//인스턴스메소드를 사용 안에 설정된 모든 메소드를 가져올 수 있음.
		
		int week_yy= now.get(now.WEEK_OF_YEAR);
		int yy= now.get(now.YEAR);
		int mm= now.get(now.MONTH)+1;
		int dd= now.get(now.DAY_OF_MONTH);
		
		sb.append(week_yy);
		sb.append("주째인");
		sb.append(yy);
		sb.append("년");
		sb.append(mm);
		
		sb.append("월");
		sb.append(dd);
		sb.append("일");
		System.out.println(sb.toString());
		
		
		
		
		
	}
}
