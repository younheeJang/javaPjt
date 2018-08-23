package Hw1;

public class Subject {

	// 필드 생성
	String name;
	String tutor;
	String room;

	// 콘스트럭터 생성
	Subject(String name, String tutor, String room) {
		this.name = name;
		this.tutor = tutor;
		this.room = room;
	}

	// 카피 콘스트럭터 생성
	Subject(Subject subject) {
		this.name = subject.name;
		this.tutor = subject.tutor;
		this.room = subject.room;
	}

	// 필요 엑세서와 뮤테이터 생성
	public String getName() {
		return name;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	// 이퀄스 메소드 생성 - Subject 클래스의 객체 이름 subject
	@Override
	public boolean equals(Object sub) {
		if (sub instanceof Subject) {
			Subject s = (Subject) sub;
			if (s.getName().equals(this.name) && s.getTutor().equals(this.tutor) && s.getRoom().equals(this.room)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	
	//과목 이름을 리턴할 메소드 
	@Override
	public String toString() {
		return this.name;
	}

	//과목에 대한 세부적인 정보를 리턴하는 메소드
	public String getDetails(Object sub) {
		Subject s = (Subject) sub;
		this.name = s.name;
		this.tutor = s.tutor;
		this.room = s.room;
		return s.getDetails(sub);
	}
	//과목 이름만을 지정하는 콘스트럭터 생성
	public Subject(String name) {
		this.name = name;
	}

}
