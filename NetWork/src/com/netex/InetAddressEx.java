package com.netex;

import java.net.*;

import org.omg.CORBA.portable.UnknownException;

public class InetAddressEx {

	public static void main(String[] args) {
		// InetAdress : ip������ host ������ ������ ��ü
		// InetAdress ��ü�� �����ڰ� �ƴ� STATIC �޼Ҵ��� �̿��ؼ� ������

		try {
			// host �̸��� �ش��ϴ� ip������ ���� InetAddress��ü�� ��� ��

			InetAddress ipinfo1 =  InetAddress.getByName("www.naver.com");
			// ip�ּ� ����
			// ip�ּ� ���

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
