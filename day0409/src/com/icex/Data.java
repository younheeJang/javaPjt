package com.icex;
import java.io.Serializable;
//Ŭ���� ��ü�� ��ü��.
public class Data implements Serializable {
	// �������̽��� �̿��� ��ü ����ȭ
	// ����/����Ʈ������Ʈ�� Ȱ���ϰ� �ȴ�.
	// ����Ʈ������Ʈ(���� ���� ����)�
	// �������� ���� ��ü�� ����ȭ�� �̿��� ä�� ����(����)���α׷� ���� ����.
	/*
	 * �ڹٿ��� ����� �����ʹ� ��Ʈ���� ���� �̵��ϴµ� ���ڿ��̳� ������ ���� �����Ϳʹ� �޸� 
	 * ��ü�� ����Ʈ���� �ƴϾ ��Ʈ���� ���� ���Ͽ�
	 * �����ϰų� ��Ʈ��ũ�� ������ �� ���� 
	 * ���� ��ü�� ��Ʈ���� ���� ������Ϸ��� ����Ʈ �迭�� ��ȯ�ϴ� ���� �ʿ��� 
	 * �̰��� ����ȭ��� ��
	 * 
	 */
	private int no;
	private String name;
	private String mail;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
