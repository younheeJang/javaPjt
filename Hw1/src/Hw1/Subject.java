package Hw1;

public class Subject {

	// �ʵ� ����
	String name;
	String tutor;
	String room;

	// �ܽ�Ʈ���� ����
	Subject(String name, String tutor, String room) {
		this.name = name;
		this.tutor = tutor;
		this.room = room;
	}

	// ī�� �ܽ�Ʈ���� ����
	Subject(Subject subject) {
		this.name = subject.name;
		this.tutor = subject.tutor;
		this.room = subject.room;
	}

	// �ʿ� �������� �������� ����
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

	// ������ �޼ҵ� ���� - Subject Ŭ������ ��ü �̸� subject
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

	
	//���� �̸��� ������ �޼ҵ� 
	@Override
	public String toString() {
		return this.name;
	}

	//���� ���� �������� ������ �����ϴ� �޼ҵ�
	public String getDetails(Object sub) {
		Subject s = (Subject) sub;
		this.name = s.name;
		this.tutor = s.tutor;
		this.room = s.room;
		return s.getDetails(sub);
	}
	//���� �̸����� �����ϴ� �ܽ�Ʈ���� ����
	public Subject(String name) {
		this.name = name;
	}

}
