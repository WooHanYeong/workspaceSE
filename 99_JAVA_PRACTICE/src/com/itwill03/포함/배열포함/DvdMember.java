package com.itwill03.포함.배열포함;



public class DvdMember {
	/*
	- 캡슐화
	<<속성>>
	회원번호
	회원이름
	전화번호
	빌린dvd들
	 */
	private int no;
	private String name;
	private String number;
	private Dvd[] dvds;
	
	/*
	<<기능>>
	  회원정보출력 
	 */
	public DvdMember() {
		
	}

	public DvdMember(int no, String name, String number, Dvd[] dvds) {
		super();
		this.no = no;
		this.name = name;
		this.number = number;
		this.dvds = dvds;
		
	}

	public void print() {
		System.out.println(this.no + "\t" +this.name + "\t" + this.number +"\t");
		if (dvds.length !=0) {
			System.out.println("빌린DVD목록");
			for (Dvd dvd : dvds) {
				dvd.dPrint();
			}
		}else {
			System.out.println("빌린DVD없음");
		}
		System.out.println();
		}
	
	
	//getter&setter
	
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

	public Dvd[] getRentDvds() {
		return dvds;
	}

	public void setRentDvds(Dvd[] dvds) {
		this.dvds = dvds;
		
	}
	
}