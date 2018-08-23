package llll;

import java.io.*;

public class Exam11 {

	public static void main(String[] args) throws IOException{
	
		
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		
		//배열 선언
		
		//이름
		
		String[] name = new String[5];
		
		//총점
		
		int[] sum = new int[5];
		
		//평균
		int[] avg = new int[5];
		
		//학점
		char[] grade = new char[5];
		
	int i,j, k, h;
	
	String sub[] = {"국어","영어","수학","사회","과학"};
	
	
	
	
	//2차원
	
	

	int[][] soc = new int[5][5];
	
	
	int[] rank = new int[5];//석차
	
	
	
	for(i=0; i<name.length; i++) {
		//이름 입력
		System.out.print("이름입력: ");
		
		name[i] =br.readLine();//이름 입력
		//각 과목 점수 입력
		for(j=0; j<sub.length; j++) {
		//과목 점수입력받음	
			
		System.out.print(sub[j]+"점수:");//sub[j]+"점수:"  sub[j]가 앞에서 할당해준 과목의 이름이니까 그 과목의 이름 + 점수(스트링 문자)
		soc[i][j]=Integer.parseInt(br.readLine());//점수 입력을 받는다.
		//과목 변수의 자료형이 스트링이기 때문에 과목 변수에 대한 점수를 입력을 받을 때는
		//인트로 변환을 시켜줘야 함. 자료형, 파쎄인트,(버퍼.원 자료형)
		
		
	sum[i]+=soc[i][j]; // 합계
		
		}
		
		avg[i]= sum[i]/5;
		
		if(avg[i]>=90)
			grade[i]='A';
		else if(avg[i]>=80)
			grade[i]='B';
		else if(avg[i]>=70)
			grade[i]='C';
		else if(avg[i]>=60)
			grade[i]='D';
		else
			grade[i]='F';
		
		System.out.println();
		
	}
		// 석차 구하기
	for(i=0; i<name.length; i++){
		rank[i]=1;//1등
		for(j=0; j<sub.length; j++){
			if(avg[i]<avg[j]) {
				rank[i]++;
				
				/*for(i=0; i<name.length; i++) {
					rank[i] = 1;
						for(j=0; j<sub.length; j++) {
							if(rank[i]<rank[j]) {
								rank[i]++;
								
							}*/
			}
		
		}
		
		
	}
    
	//출력
	System.out.println("이름\t국어\t영어\t수학\t사회\t과학\t총점\t평균\t학점\t석차");
	for(k=0; k<name.length; k++) {
		System.out.print(name[k]);//이름출력
		for(h=0; h<sub.length; h++) {
			System.out.print("\t"+soc[k][h]);//이름별 각 과목 점수
		
		}
	
	System.out.println("\t"+sum[k]+"\t"+avg[k]+"\t"+grade[k]+"\t"+rank[k]);
	}
	
	
 }

	
}
