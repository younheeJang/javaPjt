package forex1;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner c = new Scanner(System.in);

int i, j, k, num;

System.out.println("행의 단 입력:");

num = c.nextInt();

for(i=1; i<9; i+=num) {
	
	for(j=1; j<+9; j++) {
		
		for(k=1; k<=num; k++) {
			
             
			if(i+k<=9)
			
			System.out.print((i+k)+"*"+j
					+"="+((i+k)*j)+"\t");
		}
		
		
		
		System.out.println();
	}
	
	
	System.out.println();
}
	
	}

}
