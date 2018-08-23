package com.employee;
public class EmployeeVO {
	// 필드 선언 선언시 디비 테이블 변수 명과 같아야 한다. 변경자가 프라이빗이기 때문에 게터와 세터를 만든다.
	private int no;
	private String name;
	private String jobGrade;
	private int department;
	private String email;
	private String status;

	//디폴트 생성자 - 그때그때마다 필요한 생성자를 불러다 쓰기 위해 작성함
	public EmployeeVO() {}
	
	@Override//넘버와 이름만 리턴을 해준다.
	public String toString() {
	
		return getNo()+","+getName();
	}
	
	// 생성자
	public EmployeeVO(int no, String name, String jobGrade,  int department, String email) {

		this.no = no;
		this.name = name;
		this.jobGrade = jobGrade;
		this.department = department;
		this.email = email;
	}

	// 이전 생성자 매개변수에 status필드 초기화를 추가
	public EmployeeVO(int no, String name, String jobGrade, int department, String email,  String status) {

		this.no = no;
		this.name = name;
		this.jobGrade = jobGrade;
		this.department = department;
		this.email = email;
		this.status = status;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobGrade() {
		return jobGrade;
	}

	public void setJobGrade(String jobGrade) {
		this.jobGrade = jobGrade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
