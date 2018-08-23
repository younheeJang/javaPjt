package Hw1;

import java.util.*;
import static java.lang.System.out;

public class Inter implements Interface {

	Vector<ScoreV> v = new Vector<ScoreV>();

	Scanner sc = new Scanner(System.in);
	ScoreV s = new ScoreV();

	@Override
	public void input() {

		String str;
		out.print("�й�>");
		str = sc.next();

		out.print("�й�>");
		s.setStuNum(str);
		out.print("�̸�>");
		s.setName(sc.next());
		out.print("�������>");
		s.setBirth(sc.next());
		out.print("����>");
		s.setKor(sc.nextInt());
		out.print("����>");
		s.setEng(sc.nextInt());
		out.print("����>");
		s.setMat(sc.nextInt());

		v.add(s);

		out.println("�߰� �Ϸ�");
	}

	@Override
	public void update() {
		String str;

		out.print("������ �й��� �Է��ϼ���>");
		str = sc.next();

		out.print("�й�>");
		s.setStuNum(str);
		out.print("�̸�>");
		s.setName(sc.next());
		out.print("�������>");
		s.setBirth(sc.next());
		out.print("����>");
		s.setKor(sc.nextInt());
		out.print("����>");
		s.setEng(sc.nextInt());
		out.print("����>");
		s.setMat(sc.nextInt());

		v.add(s);
		out.println("���� �Ϸ�");
	}

	@Override
	public void delete() {
		String str;
		out.print("������ �й��� �Է��ϼ���>");
		str = sc.next();
		v.remove(s);
		out.println("���� �Ϸ�");
	}

	@Override
	public void listAll() {
		String str;
		out.println("��ü ���");
		out.print("�й� �Է�>");
		str = sc.next();
		Iterator<ScoreV> iterator = v.iterator();
		
	while(iterator.hasNext()) {
		ScoreV s=iterator.next();
		out.println(s);
	}
		
	}

	@Override
	public void searchHak() {
		String str;
		out.print("�˻��� �й� �Է�>");
		str = sc.next();
		ScoreV s = readScore(str);
		
		if(s != null) {
			out.println(s.toString());
		}
	out.println();
	}
	

	private ScoreV readScore(String str) {
		return null;
	}

	@Override
	public void searchName() {
		String name;
		out.print("�˻��� �̸� �Է�>");
		name = sc.next();
		name = sc.next();
		ScoreV s = readScore(name);
		
		if(s != null) {
			out.println(s.toString());
		}
	out.println();
	
	
	}

}
