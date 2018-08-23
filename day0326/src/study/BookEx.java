package study;

class MaxEx{   
	
public  static int max (int num1, int num2){


int result;

if(num1>num2)

result = num1;

else
result = num2;

return result;

}

}

public class BookEx {

	public static void main(String[] args) {
		Book bb = new Book();
		//북 클래스의 객체 생성 뉴 라는 연산자를 씀
		
		MaxEx me = new MaxEx();
		
		/*bb.name="정의란 무엇인가?";
		
		bb.writer="마이클..";
		
		bb.price=15000;
		
		bb.isbn="12345";
		*/
		//같은 패키지 내에서 생성된 서로 다른 클래스.에서 만들어 놓은 자료형 변수를 
		//같은 패키지 내의 다른 클래스로 가져와 위와 같이 쓸 수 있다.
			
        int dd = me.max(10,20);

        
        System.out.println("최대값:"+dd);
		
	}

}
