package com.cccc;

import java.util.*;

public class WeekDay {

	private int y, m, d;// 년 월 일

	// 년 월 일을 입력받는 메소드
	public void input() {

		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력:");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();

	}

	// 요일 산출 메소드 구현
	public String week() {
	 //배열 이용 
	 //2월은 평년 윤년에 따라 다르게 놓아야 하기 때문에 0으로 배열 설정
	 //각 월의 마지막 날짜를 배열화 및 요일을 배열화한다.
	 int [] months = {31, 0, 31, 30, 31, 30 ,31, 31, 30, 31,30, 31};
	 
	 //요일의 배열화
	 String[] weekNames= {"일","월", "화", "수", "목", "금", "토" };
	 
	 int nalsu;//총 날짜 수 
	 int i;//반복문 사용 변수 
     int w;//숫자를 요일로 판별	 
	 
     /*윤년에 따른 2월의 날짜수 계산
      * 윤년 : 2월의 마지막 날짜가 29일로 
      * 평년 : 2월의 마지막 날짜가 28일
      */
     
     //return 
     
     if(y %4 ==0 && y !=100||y%400==0) {
    	//윤년 이라고 판정
   //인덱스가 0부터 시작하므로 2월 배열은 [1]로 잡아줌
    	 months[1]=29;
     
     }else {
    	 //평년
    	 months[1] =28;
     }
     
     // 날짜 수를 계산
     //1년 1월 1일 입력 받은 년도 이전 년도 의 12월 31일 까지의 날짜 수 계산
     //2015년 입력 시 2014년 까지 날짜 수 계산 y-1
    nalsu =(y-1)*365+(y-1)/4-(y-1)/100+(y-1)/400;
   System.out.println(nalsu);
     //입력받은 월(8월)이면 이전 월(7)까지의 날짜 수 계산
    for(i=0; i<(m-1); i++ ) 
    	nalsu+=months[i];
    	//System.out.println(nalsu);
    	//입력받은 월의 날짜만큼 날 수 추가하는 계산
    nalsu+=d;	
   System.out.println(nalsu);
     
    //무슨 요일인지 확인하기 위한 계산
    
    w= nalsu%7;
    //일요일.   전체 날짜 수 %7==0
    //월요일.   전체 날짜 수 %7==1
    //화요일.   전체 날짜 수 %7==2
    //수요일.   전체 날짜 수 %7==3
    //목요일.   전체 날짜 수 %7==4
    //금요일.   전체 날짜 수 %7==5
    
    
   System.out.println(w);
    
    
    
    
    
    return weekNames[w];
    
	}
    
    //출력
    
    public void write(String day) {
    	System.out.printf("%d년 %d월 %d일 -> %s 요일\n", y, m, d, day);
    
    } 
	
     
     
 }


