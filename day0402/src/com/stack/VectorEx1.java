package com.stack;
import java.util.*;
import  static java.lang.System.out;

public class VectorEx1 {

	private static final String colors[] = { "검정", "노랑", "녹색", "청색", "빨강", "연두색" };
	
	public static void main(String[] args) {
		
		int	 i;
		String str;
		//백터 생성
		Vector v = new Vector();
		//백터에 데이터 저장(추가)
		for(i = 0; i<colors.length; i++) {
			//배열에 있는 데이터를 백터에 추가
			v.add(colors[i]);
			//v.add(10);//컴파일에러
		}
		str = (String)v.firstElement() ;
		out.println("첫번째 요소 :"+str+"\n");
				
		str = (String)v.get(1) ;
		out.println("두번째 요소 :"+str+"\n");
		
		
		
		//첫번째와 마지막을 뺴고 나머지는 겟 메소드로 출력이 가능하다. 겟(두번째, 세번째 등을 수로 표현)
		str = (String)v.lastElement() ;
		out.println("마지막 요소 :"+str+"\n");
		
		
		//전체출력
		
		out.println("\n전체 출력:"+"\n");
		
		/*//이터레이터 인터페이스를 활용하여 배열 전체를 한꺼번에 출력한다.
		//인터페이스에 있는 iterator()메소드 활용
		Iterator it = v.iterator();

			while(it.hasNext()) {
				// 다음 요소가 존재하는지의 여부를 판정한다. 요소가 있으면 next()메소드에 의해서 요소값을 가지고 옴
			str = (String)it.next();
			out.println(str+" ");
			//프린트엘엔으로 출력하면 세로로 출력
			}
*/
		
		for(Object o : v) {
			str=(String)o;
			out.print(str+"\t");
			//프린트로 출력하면 가로로 출력
		
		}
		
		
		
		out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
