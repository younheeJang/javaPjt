package com.vscore;


//인터페이스는 이를 상속할 수 있는 클래스가 있어야 구현이 가능해 짐
public interface Score {

	
	
	public void insert();
//입력
	public void update();

	public void delete();

	public void listAll();
//출력
	
	
	public void searchHak();
//학번으로 검색할 때 

	public void searchName();
//이름으로 검색할 때
	

}
