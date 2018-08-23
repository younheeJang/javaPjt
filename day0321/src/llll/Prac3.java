package llll;

public class Prac3 {

	public static void main(String[] args) {
	
	    //변수 생성
		int b;
				
		//머리 만들기
		for(b=4; b<10; b+=2) {
		//4부터 시작해서 1씩 올라감 10이 되기 전까지 계속 그래서 여섯 줄이 나옴	
			//appr(20-b);//공백
			app(10-b);//동그라미
			apprs(b*2);//별
			app((10-b)*2);//동그라미
			//appr((40-b));//공백
			apprs(b*2);//별
			app(10-b);//동그라미
			
			System.out.println("\n");
		}
		
		//꼬리 만들기
		for(b=20; b>=0; b-=2) {
			
			//appr(20-b);//공백
			app(20-b);//동그라미
			apprs(b*2);//별
			app(20-b);//동그라미
			
			System.out.println("\n");
			
		}
	
    }



public static void app(int m) {
	int e;
	for(e=0; e<m; e++) {
		System.out.print("○");
		
	}
	
}


public static void appr(int a) {
	
	int i;
	for(i = 0; i<a; i++) {
		
		
			
			System.out.print(" ");
		
	}
		
	}

	public static void apprs(int a) {
		int i;
		for(i = 0; i<a; i++) {
			
		
				
				System.out.print("★");
			}
	
	}
}