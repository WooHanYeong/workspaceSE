package com.itwill03.포함.배열포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		
		/*
		 * 책객체들생성
		 */
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체들 참조변수를 회원의 멤버변수에대입
		 */
		
		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		BookMember[] members= 
				{new BookMember(1,"WOO","010-1111-2222",null), 
				 new BookMember(2, "HAN", "010-3333-4444",null)
				,new BookMember(3, "YEONG", "010-5555-666",null)
		};
		
		
		
		Book b1 = new Book(1, "수학","수학공부", "수학공부하자");
		Book b2 = new Book(2, "영어","영어공부","영어공부하자");
		Book b3 = new Book(3, "국어 ","국어공부", "국어공부하자");
		Book b4 = new Book(4, "과학 ","과학공부", "과학공부하자");
		Book b5 = new Book(5, "중국어 ","중국어공부", "중국어공부하자");
		Book b6 = new Book(6, "일본어","일본어공부", "일본어공부하자");
		Book b7 = new Book(7, "체육","체육공부", "체육공부하자");

		Book[] rentbook1 = {b1,b2,b4};
		Book[] rentbook2 = {};
		Book[] rentbook3 = {b1,b2,b3,b6,b7};
		
		
		
		members[0].setRentBooks(rentbook1);
		members[1].setRentBooks(rentbook2);
		members[2].setRentBooks(rentbook3);

		
		
		
		members[0].print();
		members[1].print();
		members[2].print();
		

	}
}