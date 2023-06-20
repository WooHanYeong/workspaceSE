package com.itwill03.포함;

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
	 *
	 * <<기능>>
	 *   책정보출력
	 *   
	 */
	
	
	private int no;
	private String title;
	private String category;
	private String explanation;
	
	public Book() {
		
	}
	
	public Book(int no, String title, String category, String explanation) {
		this.no = no;
		this.title = title;
		this.category = category;
		this.explanation = explanation;
	}

	public void print() {
		System.out.print("\t"+this.no + "\t" + this.title + "\t" + 
							this.category+ "\t" + this.explanation);
	}
	
	
	//getter & setter
	
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

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
	
	


	
	
	
	
} //end 