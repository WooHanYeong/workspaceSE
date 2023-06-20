package com.itwill00.variable;

public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		
		/*
		 * 변수선언
		 */
		int memberNumber;
		String name;
		String residentNumber;
		char gender;
		int numberOfMarriages;
		boolean smoking;
		double height;
		char study;
		String face;
		
		
		/*
		 * 변수에데이타 대입
		 */
		memberNumber = 236514;
		name = "홍길동";
		residentNumber = "201212-3495039";
		gender = '남';
		numberOfMarriages = 0;
		smoking = true;
		height = 178.3;
		study = 'A';
		face = "상(중)";
		
		
		/*
		 * 변수내용출력
		 */
		System.out.println("**********************************");
		System.out.println("회원번호 : "+ memberNumber);
		System.out.println("이    름 : "+ name);
		System.out.println("주민번호 : "+ residentNumber);
		System.out.println("성    별 : "+ gender);
		System.out.println("결혼횟수 : "+ numberOfMarriages);
		System.out.println("흡연여부 : "+ smoking);
		System.out.println("학    점 : "+ study);
		System.out.println("용    모 : "+ face);
		System.out.println("**********************************");
		
		
	}

}
