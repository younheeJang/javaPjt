package study;

public class Book {
	// ��� �ʵ� (�ν��Ͻ� �ʵ�
	String name;
	String writer;
	int price=0;
	int nowPage;
	String isbn;

	// �޼ҵ� ����� - �ϳ��� ����� ��� �ൿ
	public Book() {
		// ������
	}

	public void nextPage() {
		nowPage++;

	}

	public void previousPage() {
		nowPage--;
	}

	
}
