package com.itwill03.포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember m1 = 
				new BookMember(1234,"WOO","010-1111-2222");
		/*
		BookMember m1 = 
				new BookMember(1234,"WOO","010-1111-2222",null);
		*/
		
		/*
		 * 책객체생성
		 */
		Book b1 = 
				new  Book(1,"수학의정석","수학책","수학공부");
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		
		m1.setBorrowBook(b1);
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		m1.print();
		
	}
}