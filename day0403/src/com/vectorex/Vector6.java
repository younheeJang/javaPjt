package com.vectorex;

import java.util.*;

import static java.lang.System.out;

public class Vector6 {


	public static void main(String[] args) {
		
	
		Vector<My> v = new Vector<My>();
		
		v.add(new My("ȫ�浿", 26));
		v.add(new My("�̱浿", 26));
		v.add(new My("��浿", 26));
		v.add(new My("�ڱ浿", 26));
		
		for(My my : v)
		
			out.printf("\n"+"%s     %d", my.name, my.age);
		
				
	}
	
	
}
