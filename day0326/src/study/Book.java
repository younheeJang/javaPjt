package study;

public class Book {
	// 멤버 필드 (인스턴스 필드
	String name;
	String writer;
	int price=0;
	int nowPage;
	String isbn;

	// 메소드 만들기 - 하나의 기능임 어떠한 행동
	public Book() {
		// 생성자
	}

	public void nextPage() {
		nowPage++;

	}

	public void previousPage() {
		nowPage--;
	}

	
}
