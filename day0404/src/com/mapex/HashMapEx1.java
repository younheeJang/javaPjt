package com.mapex;

import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class HashMapEx1 {
	public static void main(String[] args) throws IOException {

		/*
		 * Map<Å°, °ª> : Å°´Â Áßº¹À» Çã¿ëÇÏÁö ¾ÊÀ½ °ªÀº Áßº¹À» Çã¿ëÇÔ
		 */

		// ÇØ½Ã ¸Ê
		Map<String, String> map = new HashMap<String, String>();
		// ¼ø¼­´Â º¤ÅÍ¸»°í´Â ¾ø´Ù. ¸Ê¿¡¼­µµ ¸¶Âù°¡Áö·Î ¼ø¼­°¡ ¾ø´Ù.
		// ¹éÅÍ´Â ¸®½ºÆ®±¸Á¶ÀÌ±â ¶§¹®¿¡ ¼ø¼­°¡ ÀÖÀ½.


		out.println(map);
		out.println();
		// Å°¯“ ¼ÂÀ» ÀÌ¿ëÇÔ
		String key;
		//½ºÆ®¸µÀº ÀÔ·ÂµÇ¸é¼­ ÀÚµ¿À¸·Î °´Ã¼(¿ÀºêÁ§Æ®) Çü·Î º¯ÇÑ´Ù.
		Set set = map.keySet();
		// ¸Ê¿¡ Å°°ªÀ» ¼¼ÆÃÇÏ°í Å°¼ÂÀÌ¶ó´Â ¸Ş¼Òµå¸¦ ÀÌ¿ëÇØ¼­ Å°°ª¸¸ Ãâ·Â
		
		//ÀÎÅÍÆäÀÌ½º ÀÌÅÍ·¹ÀÌÅÍ¸¦ °¡Áö°í Å°¸¦ »ç¿ëÇÏ¿© ÀüÃ¼ Ãâ·ÂÀ» ÇÏ°Ô µÇ¸é °ªÀÌ ¼ø¼­´ë·Î ³ª¿Ã ¼ö ÀÖÀ½.
		Iterator it = set.iterator();
		while (it.hasNext()) {
			//ÀÌÅÍ·¹ÀÌÅÍ¸¦ °¡Áö°í Å°¸¦ ÀÔ·Â¹Ş¾Æ Ãâ·Â¿¡ ÀÌ¿ëÇÏ·Á°í ÇÒ ¶§¿¡´Â (String)°ú °°ÀÌ ÀÌÅÍ·¹ÀÌÅÍ
			//ÀÔ·Â ºÎºĞ ¾Õ¿¡ ½ºÆ®¸µÀ¸·Î °­Á¦ º¯È¯À» ÇØÁà¾ß ÇÔ. Å°°¡ ½ºÆ®¸µÀÌ´Ù.
			key = (String) it.next();
			out.println(map.get(key));
		}
		out.println();

		map.put("¿µÈ­", "¾ÆÀÌ¾ğ¸Ç");
		out.println(map);
		out.println();
		
		//µ¿ÀÏÇÑ Å°ÀÏ ¶§´Â °ªÀ» º¯°æÇÑ´Ù.
		//¿µÈ­ ¶ó´Â µ¿ÀÏÇÑ Å°¿¡ ¾ÆÀÌ¾ğ¸ÇÀÌ¶ó´Â »õ·Î¿î °ªÀ» ÀÔ·ÂÇÏ¸é °°Àº ¸ÊÀ» Ãâ·ÂÇÏ°Ô µÇ¾úÀ» ¶§
		//Å°¿¡ µş·ÁÀÖ´Â °ªÀÌ ¾ÆÀÌ¾ğ¸ÇÀ¸·Î ¹Ù²î¾î¼­ Ãâ·ÂµÈ´Ù.
			
	}

}
