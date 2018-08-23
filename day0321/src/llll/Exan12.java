package llll;
import java.io.*;

public class Exan12 {

	public static void main(String[] args)throws IOException {
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;

//이름 과목 합계 평균 등급 석차



String[] name = new String [5];

String[] sub = {"국어", "영어", "수학", "사회", "과학"};

char[] grade = new char[5];

int[] sum =  new int[5];
int[] avg = new int[5];
int[] rank = new int[5];


int[][] soc = new int[5][5];

int i, j, h, k;// 앞에 두 개는 입력에 이용 석차까지, 나머지 두 개는 출력코드에 이용.
		

for(i=0; i<name.length; i++) {
	System.out.print("이름");
	name[i] = br.readLine();
	
	for(j=0; j<sub.length; j++) {
	 System.out.print(sub[j]+"점수:");
		soc[i][j] = Integer.parseInt(br.readLine());//버퍼 리드라인 문자형으로 입력받아서
		sum[i] += soc[i][j];// 정수형 인트로 바꿔준다. 그래서 저장해놓는다.
		//누구의 국어가 영어가 수학이 사회가 과학이 차례로 누적되면서 한 사람의 과목의 총점을 구할 수 있다.
	}
	
	avg[i]=sum[i]/5;
	if(avg[i]>=90) {
		grade[i]='A';
	}else if(avg[i]>=80) {
		grade[i]='B';
	}else if(avg[i]>=70) {
		grade[i]='C';
	}else if(avg[i]>=60) {
		grade[i]='D';
	}else {
		grade[i]='F';
	}
	
	System.out.println();
	
}
for(i=0; i<name.length; i++) {
rank[i] = 1;
	for(j=0; j<sub.length; j++) {
		if(avg[i]<avg[j]) {
			rank[i]++;
			
		}
		
	}
	
	
}//첫번째 포문이 끝난다.
	//이전까지는 입력이 되어서 데이터가 저장이 된 상태기 때문에 이후 출력 기호를 입력해줘야
//함

System.out.println("이름\t국어\t영어\t수학\t사회\t과학\t총점\t평균\t등급\t석차");
for(k=0; k<name.length; k++) {
	System.out.print(name[k]);
	for(h=0; h<sub.length; h++) {
		System.out.print("\t"+soc[k][h]);
	}
System.out.println("\t"+sum[k]+"\t"+avg[k]+"\t"+grade[k]+"\t"+rank[k]);
}



	}

}
