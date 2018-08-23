package InputOutput;

// 숫자 두 개 이상 입력 받을 경우
import java.io.*;


public class inputEx4 {

	public static void main(String[] args)throws IOException {
  
		//버퍼 설정
		BufferedReader br = new BufferedReader(
				 new InputStreamReader(System.in));
		
		//국어, 영어, 수학 세 과목의 점수를 입력받아 합계를 구하시오.
		int kor, eng, mat, sum=0;

	System.out.print("국어점수:");
    kor = Integer.parseInt(br.readLine());
    
	System.out.print("영어점수:");
    eng = Integer.parseInt(br.readLine());
    
    System.out.print("수학점수:");
    mat = Integer.parseInt(br.readLine());
		
    sum = kor + eng + mat;

		
		System.out.println("세 과목의 합계는"+sum+"입니다.");

	}

}
