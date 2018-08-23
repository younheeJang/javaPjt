package solvingEx;

public class DoWhile04 {

	public static void main(String[] args) {
	 
		int sum=0;
		int i = 1;//È¦¼ö +=2
		int  p= 1;//Â¦¼ö  +=2
		
		do {
			
		p=-p;
		sum+=p*(i*i);
		i++;
		}
		while(i<=100);
		System.out.println(sum);

	}

}
