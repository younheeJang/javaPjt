package Solving;

public class switch2 {

	public static void main(String[] args) {
		
	/*	초기값

		while(조건식){

		수행할 문장;
		증감식;

		}*/
		
		//boolean run = true;
	
		int a =0;//정수형 변수 지정 초기화를 0으로 놓는다.
		
		double sum=0;// 더블형 변수 썸 지정, 답이 실수로 나와야 하므로.
		
		//와일문에서 앞에 초기화해 놓은 변수, 와일문 바로 뒤 (조건문)을 잡고
		//와일문 안을 채운다.
		while(a<9) {
		//변수 a는 누적이 +2씩 되므로 10을 넘으면 안되기 때문에 최대값이 8이어야 함	
			//실수형으로 나누는 식은 하나만 실수여도 답이 실수로 도출되기 때문에
			//분자와 분모 중 하나만 더블로 지정해 줘도 무방.
			
			
			//누적함수 지정 꼭 해줘야 함"+=". 와일문은 조건을 충족하기 전까지는
			//무한 반복이기 때문에.
			sum += ((a+1)/(double)(a+2)); 
		
			//와일문의 마지막인 증감식을 세워준다.
			a++;	
		}
		
		//출력시 소수점 두자리수까지 지정해 준다. 답이 7.07로 정해져 있으므로.
		 System.out.printf("%.2f" ,sum);
	
/*	int a =1;
	int b =2;
	double sum =0;
	while(a<=9) {
		sum +=(a/(double)(b));
		a++;
		b++;
		
	}
	System.out.printf("%.2f", sum);*/
	}

}
