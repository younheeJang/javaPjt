package com.vscore;

//����Ʈ�� �ϳ��ϳ� �� �߰��ϱ� ������ ����Ʈ ���� �̿��ص� �������.
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

//Ŭ���� ���� �� ����Ʈ�ؼ� �������� �������̽��� �߰��ؾ� ��.
//�������̽� �߰� �� �ǴϽø� ������ �ڵ����� �������̵尡 ��

public class ScoreImpl implements Score {

	// ���⼭�� �� �Ŵϱ� ���� �����ڸ� �����̺���Ʈ������ ����
	private Vector<ScoreVO> list = new Vector<ScoreVO>();
	// ���͸� ���� �� ���ھ���̿��� �ҷ����� ���ھ���̿��� �ִ� �ʵ���� �� ����

	private Scanner sc = new Scanner(System.in);

	@Override
	public void insert() {
		System.out.println("\n �ڷ��߰�........");

		String hak;
		System.out.println("�й�:");
		hak = sc.next();
		// �ߺ� ���ű��� ����� ����!

		ScoreVO temp = readScore(hak);
		if (temp != null) {
			System.out.println("��ϵ� �й��Դϴ�.");
			return; // �ٽ��� �� ���� �� �ֵ��� ������ ���ش�.
		}

		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("�̸�:");
		vo.setName(sc.next());
		System.out.print("�������:");
		vo.setBirth(sc.next());
		System.out.print("����:");
		vo.setKor(sc.nextInt());
		System.out.print("����:");
		vo.setEng(sc.nextInt());
		System.out.print("����:");
		vo.setMat(sc.nextInt());

		// ������ �Է� �� ���Ϳ� �߰��ؾ� ��
		list.add(vo);
		System.out.println("�߰� �Ϸ�...........\n");
	}

	// ���� �й��� �о� ���� �޼ҵ� ����
	public ScoreVO readScore(String hak) {

		ScoreVO vo = null;
		for (ScoreVO temp : list) {

			// ���Ϳ� �ִ� �����͸� temp�� ����
			if (temp.getHak().equals(hak)) {
				vo = temp;
				break;

			}
		}

		return vo;

	}

	@Override
	public void update() {

		System.out.println("\n�ڷ� ����......");

		// ������ �й��̴�.
		String hak;
		System.out.print("������ �й� �Է�:");
		hak = sc.next();

		ScoreVO vo = readScore(hak);

		if (vo == null) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�.\n");
			return;
		}

		System.out.print("�̸�:");
		vo.setName(sc.next());
		System.out.print("�������:");
		vo.setBirth(sc.next());
		System.out.print("����:");
		vo.setKor(sc.nextInt());
		System.out.print("����:");
		vo.setEng(sc.nextInt());
		System.out.print("����:");
		vo.setMat(sc.nextInt());

		System.out.println("���� �Ϸ�........\n");
		// ������ �ִ� �ڷ��̱� ������ �Էµ� �ڷḦ �׳� �ҷ����� �ȴ�.

	}

	@Override
	public void delete() {

		System.out.println("\n �ڷ� ����..........");
		String hak;
		System.out.print("������ �й��Է�:");
		hak = sc.next();

		ScoreVO vo = readScore(hak);
		if (vo == null) {
			System.out.println("\n ��ϵ� �ڷᰡ �����ϴ�.\n");
			return;
		}

		list.remove(vo);
		System.out.println("���� �Ϸ�........\n");

	}

	@Override
	public void listAll() {
		System.out.println("\n ��ü ���........");
		// �Ѳ����� ����� ���� �������̽��� �ִ� ���ͷ����� �޼ҵ带 ����� �� �� �ִ�.
		Iterator<ScoreVO> it = list.iterator();
		while (it.hasNext()) {// ���Ϳ� ������Ұ� �����ϴ��� ����
			ScoreVO vo = it.next();
			System.out.println(vo);
		}
		System.out.println();
	}

	@Override
	public void searchHak() {

		System.out.println("\n �й� �˻�.......");
		String hak;
		System.out.print("�˻��� �й� �Է�:");
		hak = sc.next();

		ScoreVO vo = readScore(hak);
		if (vo != null) {
			/*
			 * System.out.print(vo.getHak()+"\t"); System.out.print(vo.getName()+"\t");
			 * System.out.print(vo.getBirth()+"\t"); System.out.print(vo.getKor()+"\t");
			 * System.out.print(vo.getEng()+"\t"); System.out.print(vo.getMat()+"\t");
			 * System.out.print(vo.getTot()+"\t"); System.out.print(vo.getTot()/3+"\t");
			 */
			System.out.println(vo.toString());

		}
		System.out.println();

	}

	@Override
	public void searchName() {

		System.out.println("\n �̸� �˻� .........");
		String name;
		System.out.print("�˻��� �̸� �Է�:");
		name = sc.next();

		/*
		 * ScoreVO vo = readScore(name); if(vo != null) {
		 * 
		 * System.out.println(vo.toString()); }
		 */

		
		for (ScoreVO vo : list) {
			
									//ù���ڸ� ��ġ�ص� �˻��� ������ �޼ҵ� startsWith�� ����� �ش�.
			if (vo.getName().startsWith(name)) {
				System.out.println(vo);
			}

		}

		System.out.println();
	}

}
