package InputOutput;

import java.io.*;//r

public class InputEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//변수설정
		
		String name;
		String year;
		String addr;
		String tel;
	
		//버퍼 설정
		BufferedReader br = new BufferedReader(
			 new InputStreamReader(System.in));
		System.out.print("이름:");
		
		//입력을 받아서 출력을 꾸민다.
		name = br.readLine();
	
		System.out.print("나이:");
		year = br.readLine();
		
		System.out.print("주소:");
		addr = br.readLine();
		
		System.out.print("전화번호:");
		tel = br.readLine();
		
		System.out.println();//한줄삽입 
	    System.out.println("당신의 이름은 "+name+"님 이시군요");
	    System.out.println("나이는 "+ year +"이고");
	    System.out.println("주소는 "+addr+"이며");
	    System.out.println("전화번호는 "+tel+"이군요");
	    
	
	}
	

}
