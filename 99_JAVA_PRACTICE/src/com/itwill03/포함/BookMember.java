package com.itwill03.포함;


public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	*/
	private int no;
	private String name;
	private String number;
	private Book borrowBook;
	
	
	public BookMember() {
		
	}
	
	public BookMember(int no, String name, String number) {
		super();
		this.no = no;
		this.name = name;
		this.number = number;
		
	}
	
	public void print() {
		System.out.println(this.no + "\t" + this.name + "\t" + this.number);
		if(borrowBook!=null) {
			borrowBook.print();
		}else {
			System.out.println("빌린책이없다.");
		}
	}

	//getter & setter
	
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Book getBorrowBook() {
		return borrowBook;
	}
	public void setBorrowBook(Book borrowBook) {
		this.borrowBook = borrowBook;
	}
	
	


	
	
	
	
	
}