package study;

public class ReferenceParameter {

	
	//void 리턴값이 필요 없음
	public void increase(int[] n) {
		//배열 형태 참조형
		for(int i = 0; i<n.length; i++) {
			
			n[i]++;
		}
			
	}
	
	
	
	
	public static void main(String[] args) {
		
		int ref[]= {100, 200, 800, 500};
		//ref에 다 들어가 있음
		//ref만 넘겨주면 됨

		 ReferenceParameter rp=new  ReferenceParameter();
		 
		 rp.increase(ref);
		for(int i =0; i<ref.length; i++) 
			System.out.println("ref["+i+"]:"+ref[i]);
		//메인에서ref 배열 자체를 참조하여 위 클래스의 연산식으로 넘겨 계산을 완료한 후 
		//다시 메인으로 돌려보내 출력
		
		
		
		
		/*배열 혹은 객체!
		 * 메소드 호출시 전달하려는 인자를 참조(객체) 자료형을 사용할 경우를 의미함
		 * 여기에는 기본자료형 아닌 참조형 (객체 또는 배열)이 속함
		 * 
		 */
	}

}
