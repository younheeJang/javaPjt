package study;

public class Book1 {
//클래스에 사용할 변수들을 설정해 준다.
	String writer;
	String name;
	int price;
	int nowpage;
	String isbn;

	
	//클래스 내에 메소드를 만든다.- 하나의 기능임 어떠한 행동.
	public Book1() {

	}

	public void nextpage() {
nowpage++;
	}

	public void previouspage() {
nowpage--;
	}

}
