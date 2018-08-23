package comex.inher;

public class HashCodeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("test");
		String str2 = new String("test");
//해시코드 : 해시 함수의 출력 비트 문자열
		//같은 객체는 같은 해시 코드를 가져야 한다.

//equals()메드소가 같다면 일반적으로 같은 해시코드 값을 가진다고 한다




		System.out.println("str1과 str2의 주소값은 같나요?" + (str1 == str2));
		System.out.println("str1과 str2의 해시코드는 같나요?" + (str1.hashCode() == str2.hashCode()));


		System.out.println("h1의 해시코드:" + str1.hashCode());
		System.out.println("h2의 해시코드:" + str2.hashCode());

		
		HashCodeEx h1 = new HashCodeEx();
		HashCodeEx h2 = new HashCodeEx();

		System.out.println("h1과 h2의 주소값은 같나요?" + (h1 == h2));
		System.out.println("h1과 h2의 해시코드는 같나요?" + (h1.hashCode() == h2.hashCode()));

		System.out.println("h1의 해시코드:" + h1.hashCode());
		System.out.println("h2의 해시코드:" + h2.hashCode());

	}

}
// 스트링(주소값 다름 해시코드 같음 스트링은 따로 자료값을 저장해두는 공간이 있음
// 클래스(주소값 다름 해시코드 다름 클래스는 스트링과는 다르게 객체 하나하나가 빠져나가는 곳임
/*
 * 16진수 주소값을 정수값으로 변환한 값 = 해시코드 메소드*/
