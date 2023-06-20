package com.itwill03.포함.배열포함;


public class Dvd {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  번호
		타이틀
		쟝르
	 * 
	 * <<기능>>
	 *   Dvd정보출력
	 *   
	 */
	
	private int no;
	private String title;
	private String grene;
	
	public Dvd() {
	}

	public Dvd(int no, String title, String grene) {
		super();
		this.no = no;
		this.title = title;
		this.grene = grene;
	}

	public void dPrint() {
		System.out.println(this.no+"\t"+this.title+"\t"+this.grene+"\t");
	}
	
	// getter &setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGrene() {
		return grene;
	}

	public void setGrene(String grene) {
		this.grene = grene;
	}
	
	
	
}