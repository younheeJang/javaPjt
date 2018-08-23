package study;

public class ReferenceParameter2 {

	//배열 처럼 기본 자료형의 데이터를 바로 받지 않는 참조형으로 데이터를 받을 때 
	
	public void increase(int [] a ) {
		//배열 형태 참조형
		
		for(int i =0; i<a.length; i++) {
			a[i]++;
		}
		
	}
	
	
public static void main(String[] args) {
	//배열 자료형 선언
	int [] g = {100, 300, 800, 500};
	//사용할 메소드를 가진 클래스를 호출해 준다.
	ReferenceParameter2 t = new ReferenceParameter2();
	//호출한 클래스의 명칭에 .을 찍고 해당 클래스가 가지고 있는 메소드의 명칭을 가져와 
	//그 기능을 사용할 수 있도록 한다.
	t.increase(g);

	//인크리즈라는 메소드의 기능말 빌려올 뿐 실제 실행인 메인 메소드에서는 메인 메소드 안의
	//값을 가지고 출력을 행하므로 프린트에는 메인 메소드의 자료형 이름이 들어가야 한다.
	for(int j =0; j<g.length; j++) {
		
		System.out.println(g[j]);
	}
	
	
} 


}
