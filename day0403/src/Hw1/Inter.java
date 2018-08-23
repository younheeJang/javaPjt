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
		out.print("학번>");
		str = sc.next();

		out.print("학번>");
		s.setStuNum(str);
		out.print("이름>");
		s.setName(sc.next());
		out.print("생년월일>");
		s.setBirth(sc.next());
		out.print("국어>");
		s.setKor(sc.nextInt());
		out.print("영어>");
		s.setEng(sc.nextInt());
		out.print("수학>");
		s.setMat(sc.nextInt());

		v.add(s);

		out.println("추가 완료");
	}

	@Override
	public void update() {
		String str;

		out.print("수정할 학번을 입력하세요>");
		str = sc.next();

		out.print("학번>");
		s.setStuNum(str);
		out.print("이름>");
		s.setName(sc.next());
		out.print("생년월일>");
		s.setBirth(sc.next());
		out.print("국어>");
		s.setKor(sc.nextInt());
		out.print("영어>");
		s.setEng(sc.nextInt());
		out.print("수학>");
		s.setMat(sc.nextInt());

		v.add(s);
		out.println("수정 완료");
	}

	@Override
	public void delete() {
		String str;
		out.print("삭제할 학번을 입력하세요>");
		str = sc.next();
		v.remove(s);
		out.println("삭제 완료");
	}

	@Override
	public void listAll() {
		String str;
		out.println("전체 출력");
		out.print("학번 입력>");
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
		out.print("검색할 학번 입력>");
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
		out.print("검색할 이름 입력>");
		name = sc.next();
		name = sc.next();
		ScoreV s = readScore(name);
		
		if(s != null) {
			out.println(s.toString());
		}
	out.println();
	
	
	}

}
