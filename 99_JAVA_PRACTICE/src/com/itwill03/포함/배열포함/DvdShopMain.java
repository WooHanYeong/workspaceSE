package com.itwill03.포함.배열포함;


public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember[] members= 
			{new DvdMember(1,"WOO","010-1111-2222",null), 
			 new DvdMember(2, "HAN", "010-3333-4444",null)
			,new DvdMember(3, "YEONG", "010-5555-666",null)
	};
		/*
		 * Dvd들객체생성
		 */
		Dvd d1 =new Dvd(1,"범죄도시","범죄");
		Dvd d2 =new Dvd(2,"드림","코믹");
		Dvd d3 =new Dvd(3,"해리포터","판타지");
		Dvd d4 =new Dvd(4,"반지의제왕","판타지");
		Dvd d5 =new Dvd(5,"극한직업","코믹");
		Dvd d6 =new Dvd(6,"명량","역사");
		
		Dvd[] rentdvd1 = {d1,d2,d3};
		Dvd[] rentdvd2 = {d1,d3,d6};
		Dvd[] rentdvd3 = {};
		
		
		members[0].setRentDvds(rentdvd1);
		members[1].setRentDvds(rentdvd2);
		members[2].setRentDvds(rentdvd3);
		
		members[0].print();
		members[1].print();
		members[2].print();
		
		
		
		/*
		 * 회원이Dvd들을 대여
		 * - Dvd를 3개까지 대여할수있다.
		 * 
		 * Dvd객체배열 참조변수를 회원의 멤버변수에대입
		 */
		
		/*
		 * 회원정보출력(회원이빌린Dvd들정보출력)
		 */
		
		
	}

}