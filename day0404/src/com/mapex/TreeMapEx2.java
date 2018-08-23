package com.mapex;

import java.io.*;

import java.util.*;

public class TreeMapEx2 {

	public static void main(String[] args) {
		TreeMap<String, SungRec> map = new TreeMap<String, SungRec>();

		// ¸Ê¿¡´Ù µ¥ÀÌÅÍ¸¦ Áý¾î ³Ö±â
		// map.put("3333", new SungRec("È«±æµ¿", 80, 50, 90));
		map.put("3333", new SungRec("È«±æµ¿", 80, 50, 90));
		map.put("4444", new SungRec("È«±æµ¿", 80, 50, 90));
		map.put("1111", new SungRec("È«±æµ¿", 80, 50, 90));
		map.put("0000", new SungRec("È«±æµ¿", 80, 50, 90));
		
	
		
		String key;
		Set set = map.keySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			key = (String) it.next();
			SungRec data = map.get(key);

			
			//Ãâ·Â¹®
			System.out.printf("%7s %10s %5d %5d %5d %5d\n",
					key, data.getName(), data.getKor(), data.getEng(), data.getMat(), data.getTot());
		}

	}

}
