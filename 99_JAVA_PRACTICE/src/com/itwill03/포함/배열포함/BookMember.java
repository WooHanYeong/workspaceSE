package com.itwill03.포함.배열포함;



public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책들
	*/
	
	/*
	<<기능>>
	  회원정보출력 
	 */
	
	private int no;
	private String name;
	private String number;
	private Book[] books;
	
	public BookMember() {
		
		
	}

	public BookMember(int no, String name, String number,Book[] books) {
		super();
		this.no = no;
		this.name = name;
		this.number = number;
		this.books =books;
		
		
	}
	
	public void print() {
		System.out.println(this.no + "\t" + this.name + "\t" + this.number + "\t" );
		if (books.length !=0) {
			System.out.println("빌린책목록");
			for (Book book : books) {
				book.print();
			}
		}else {
			System.out.println("빌린책없음");
		}
		System.out.println();
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Book[] getRentBook() {
		return books;
	}

	public void setRentBooks(Book[] books) {
		this.books = books;
	}

	
	
}//end