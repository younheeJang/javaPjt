package study;

import java.util.Scanner; //스캐너 설정

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		
		//랜덤으로 수를 호출하자!
		/*1. Random 클래스의 사용
		 * import java.util.Random;
		 * Random random = new Random();
		 * ->System.out.println(random.nextBoolean()); 이것은 boolean형
		 * ->System.out.println(random.nextInt()); 이것은 정수형
		 * ->System.out.println(random.nextInt(100)+1); ((최댓값)+시작값) 
		 * 
		 * 2. Math 클래스의 random() 메소드 사용
		 * random() 메소드는 리턴(반환)형이 double이다.
		 * 실수를 반환하기 때문에 앞에 (int)를 선언해서 형 변환을 해야 함
		 * 
		 * ->int ranValue = (int)(Math.random()*100+1); *최댓값+시작값
		 * 
		 */
		
		
		//이름을 입력받아 국어, 영어, 수학 점수를 랜덤으로 배정해보자.
		
		//이름을 입력 받자.
		System.out.println("이름을 입력해 주세요.");
		String name =s.nextLine();
		
		
		//국어 영어 수학 점수에 대한 변수를 만들자.
	
		
		
		// 랜덤으로 수를 처리해 보자.
		int ranValue1 = (int) (Math.random()*100+1);
		//System.out.println(ranValue1);
		int ranValue2 = (int) (Math.random()*100+1);
		//System.out.println(ranValue2);
		int ranValue3 = (int) (Math.random()*100+1);
		//System.out.println(ranValue3);
	
		System.out.println(name+"님의 국어 점수는"+ranValue1);
		System.out.println("\n"+name+"님의 영어 점수는"+ranValue2);
		System.out.println("\n"+name+"님의 수학 점수는"+ranValue3+"입니다.");
		
	    int sum = ranValue1+ranValue2+ranValue3;
	    int avg = sum/3;
	    
		
	    System.out.println("\n총점은 "+sum+"이며 평균은"+avg+"입니다.");
	    
	    
	    switch(avg) {
	    
	    case 100 :
	    	System.out.println("Serendipity!");
	    	break;
	    	
	    case 90 :
	    	System.out.println("Lucky!");
	    	break;
	    	
	    case 80 :
	    	System.out.println("Lucky!");
	    	break;
	    	
	    case 70 : 
	    	System.out.println("Middle~");
	    	break;
	    	
	    case 60 : case 50 : case 40 : case 30 : case 20 : 
	    	System.out.println("SoSo-");
	    	break;
	    	
	    case 10 : case 0 : 	
	    	System.out.println("Unlucky!");
	    	break;
	    	
	    
	    }
		
		
	}
	
	

}
