
package com.setex;

import java.util.*;

import static java.lang.System.out;

class AData {
	
	int x;
	int y;
	
	public AData(int x, int y) {
	this.x = x;
	this.y = y;

	
	
	}

	public void disp() {
		out.println("x=" +x+", y ="+y);

	}
}



















public class HashSetEX {

	public static void main(String[] args) {

		AData ap = new AData(10, 20);
		AData bp = new AData(20, 30);
		AData cp = new AData(30, 40);
		
		HashSet hs = new HashSet();
		hs.add(ap);
		hs.add(bp);
		hs.add(cp);
		System.out.println(hs.size());//총 데이터 크기
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			((AData)it.next()).disp();
			
			
		}
		
		
		
	}

}
