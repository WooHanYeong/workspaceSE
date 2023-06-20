package com.itwill03.포함.배열포함;

public class Book {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 * 
	 * <<기능>>
	 *   책정보출력
	 *   
	 */
	
	private int no;
	private String title;
	private String category;
	private String explantion;
	
	public Book() {
		
	}

	public Book(int no, String title, String category, String explantion) {
		super();
		this.no = no;
		this.title = title;
		this.category = category;
		this.explantion = explantion;
	}
	
	public void print() {
		System.out.println("\t" +this.no + "\t" + this.title +"\t" +
									this.category +"\t" + this.explantion);
	}

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getExplantion() {
		return explantion;
	}

	public void setExplantion(String explantion) {
		this.explantion = explantion;
	}
	
	
	
}