package com.vscore;

//임포트를 하나하나 다 추가하기 싫으면 임포트 별을 이용해도 상관없다.
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

//클래스 만들 때 셀렉트해서 만들어놓은 인터페이스를 추가해야 함.
//인터페이스 추가 후 피니시를 누르면 자동으로 오버라이드가 됨

public class ScoreImpl implements Score {

	// 여기서만 쓸 거니까 접근 제한자를 프라이베이트형으로 선언
	private Vector<ScoreVO> list = new Vector<ScoreVO>();
	// 벡터를 선언 후 스코어브이오를 불러오면 스코어브이오에 있는 필드들이 다 들어옴

	private Scanner sc = new Scanner(System.in);

	@Override
	public void insert() {
		System.out.println("\n 자료추가........");

		String hak;
		System.out.println("학번:");
		hak = sc.next();
		// 중복 제거까지 만들어 본다!

		ScoreVO temp = readScore(hak);
		if (temp != null) {
			System.out.println("등록된 학번입니다.");
			return; // 다시한 번 넣을 수 있도록 리턴을 해준다.
		}

		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		System.out.print("이름:");
		vo.setName(sc.next());
		System.out.print("생년월일:");
		vo.setBirth(sc.next());
		System.out.print("국어:");
		vo.setKor(sc.nextInt());
		System.out.print("영어:");
		vo.setEng(sc.nextInt());
		System.out.print("수학:");
		vo.setMat(sc.nextInt());

		// 데이터 입력 후 벡터에 추가해야 함
		list.add(vo);
		System.out.println("추가 완료...........\n");
	}

	// 기존 학번의 읽어 오는 메소드 구현
	public ScoreVO readScore(String hak) {

		ScoreVO vo = null;
		for (ScoreVO temp : list) {

			// 벡터에 있는 데이터를 temp로 저장
			if (temp.getHak().equals(hak)) {
				vo = temp;
				break;

			}
		}

		return vo;

	}

	@Override
	public void update() {

		System.out.println("\n자료 수정......");

		// 기준이 학번이다.
		String hak;
		System.out.print("수정할 학번 입력:");
		hak = sc.next();

		ScoreVO vo = readScore(hak);

		if (vo == null) {
			System.out.println("등록된 자료가 없습니다.\n");
			return;
		}

		System.out.print("이름:");
		vo.setName(sc.next());
		System.out.print("생년월일:");
		vo.setBirth(sc.next());
		System.out.print("국어:");
		vo.setKor(sc.nextInt());
		System.out.print("영어:");
		vo.setEng(sc.nextInt());
		System.out.print("수학:");
		vo.setMat(sc.nextInt());

		System.out.println("수정 완료........\n");
		// 기존에 있던 자료이기 때문에 입력된 자료를 그냥 불러오면 된다.

	}

	@Override
	public void delete() {

		System.out.println("\n 자료 삭제..........");
		String hak;
		System.out.print("삭제할 학번입력:");
		hak = sc.next();

		ScoreVO vo = readScore(hak);
		if (vo == null) {
			System.out.println("\n 등록된 자료가 없습니다.\n");
			return;
		}

		list.remove(vo);
		System.out.println("삭제 완료........\n");

	}

	@Override
	public void listAll() {
		System.out.println("\n 전체 출력........");
		// 한꺼번에 출력할 때는 인터페이스에 있는 이터레이터 메소드를 사용해 줄 수 있다.
		Iterator<ScoreVO> it = list.iterator();
		while (it.hasNext()) {// 백터에 구성요소가 존재하는지 여부
			ScoreVO vo = it.next();
			System.out.println(vo);
		}
		System.out.println();
	}

	@Override
	public void searchHak() {

		System.out.println("\n 학번 검색.......");
		String hak;
		System.out.print("검색할 학번 입력:");
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

		System.out.println("\n 이름 검색 .........");
		String name;
		System.out.print("검색할 이름 입력:");
		name = sc.next();

		/*
		 * ScoreVO vo = readScore(name); if(vo != null) {
		 * 
		 * System.out.println(vo.toString()); }
		 */

		
		for (ScoreVO vo : list) {
			
									//첫문자만 일치해도 검색이 가능한 메소드 startsWith를 사용해 준다.
			if (vo.getName().startsWith(name)) {
				System.out.println(vo);
			}

		}

		System.out.println();
	}

}
