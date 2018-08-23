package com.netex;

import java.net.*;

import org.omg.CORBA.portable.UnknownException;

public class InetAddressEx {

	public static void main(String[] args) {
		// InetAdress : ip정보와 host 정보를 가지는 객체
		// InetAdress 객체는 생성자가 아닌 STATIC 메소느를 이용해서 생성됨

		try {
			// host 이름에 해당하는 ip정보를 가진 InetAddress객체를 얻어 놈

			InetAddress ipinfo1 =  InetAddress.getByName("www.naver.com");
			// ip주소 없디
			// ip주소 얻기

			String ip = ipinfo1.getHostAddress();
			System.out.println(ip);
			InetAddress[] ipArray = InetAddress.getAllByName("www.naver.com");

			for (InetAddress tempip : ipArray) {
				System.out.println(tempip);
			}

			InetAddress myhost = InetAddress.getLocalHost();
			System.out.println("host:" + myhost.getHostName());
			System.out.println("host ip:" + myhost.getHostAddress());
		} catch (UnknownHostException ue) {
			ue.printStackTrace();
		}
	}

}
