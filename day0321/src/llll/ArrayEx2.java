package llll;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열선언
		char[] ch;
		String[][] str ={  { "홍길동", "김유신"},
		{ "이순신", "을지문덕" }, 
		{ "이순신", "을지문덕"} };
		
		
		
		ch = new char[4];// 배열 초기화
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';

		for(char temp:ch)
			System.out.print(temp+"\t");
		
		
		int cc[][][]=new int [2][3][4];
		
		
		
	}

}
