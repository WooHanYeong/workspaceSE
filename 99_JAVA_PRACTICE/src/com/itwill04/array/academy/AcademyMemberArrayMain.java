package com.itwill04.array.academy;

public class AcademyMemberArrayMain {

	public static void main(String[] args) {
		AcademyMember[] members={
				new AcademyStudent(1, "KIM", "자바"),
				new AcademyStudent(2, "LEE", "리눅스"),
				new AcademyStudent(3, "KIM", "자바"),
				new AcademyStudent(4, "LEE", "IOT"),
				new AcademyGangsa(5, "CHOI", "파이썬"),
				new AcademyGangsa(6, "KIM", "자바"),
				new AcademyGangsa(7, "DIM", "자바"),
				new AcademyStaff(8, "AIM", "영업"),
				new AcademyStaff(9, "QIM", "생산")
		};
		
		System.out.println("1.AcademyMember 전체출력");
		for (AcademyMember academyMember : members) {
			academyMember.print();
			break;
		 }System.out.println();
			
		
	
		System.out.println("2.번호 1   번 AcademyMember 한명 출력");
		/*
		 for (int i = 0; i < members.length; i++) {
			if(members[i].getNo() == 1) {
				members[i].print();
				break;
			}
		}
		
		*/
		for (AcademyMember academyMember : members) {
			if (academyMember.getNo() ==1){
				academyMember.print();
				break;
			}
		}System.out.println();
		
		
		System.out.println("2.번호 2   번 AcademyMember 한명 출력");
		/*
		for (int i = 0; i < members.length; i++) {
			if(members[i].getNo() == 2) {
				members[i].print();
				break;
			}
		}
		*/
		for (AcademyMember academyMember : members) {
			if (academyMember.getNo() ==2){
				academyMember.print();
			}
		}System.out.println();
		
		System.out.println("2.이름 KIM 인 AcademyMember 들   출력");
		/*
		for (int i = 0; i < members.length; i++) {
			if(members[i].getName().equals("KIM")) {
				members[i].print();
			}
		}System.out.println();
		*/
		for (AcademyMember academyMember : members) {
			if (academyMember.getName() =="KIM"){
				academyMember.print();
			}
		}System.out.println();
		/*******************************************************************************/
		System.out.println("3.AcademyMember 중에서 AcademyStudent들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				members[i].print();
				AcademyStudent tempStudent=(AcademyStudent)members[i];
				System.out.println("학생반:"+tempStudent.getBan());
			}
		}System.out.println();
		
		System.out.println("3.AcademyMember 중에서 AcademyGangsa들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				members[i].print();
				AcademyGangsa tempGangsa=(AcademyGangsa)members[i];
				System.out.println("학생반:"+tempGangsa.getSubject());
			}
		}System.out.println();
		
		System.out.println("3.AcademyMember 중에서 AcademyStaff들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				members[i].print();
				AcademyStaff tempGangsa=(AcademyStaff)members[i];
				System.out.println("학생반:"+tempGangsa.getDepart());
			}
		}System.out.println();
		
		System.out.println("4.AcademyMember 중에서 자바 반  인 AcademyStudent 들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				AcademyStudent tempStudent=(AcademyStudent)members[i];
				if (tempStudent.getBan().equals("자바")) {
					members[i].print();
				}
			}		
		}System.out.println();
		
		System.out.println("4.AcademyMember 중에서 자바 과목인 AcademyGangsa  들 출력");
		for (int i  = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				AcademyGangsa tempGangsa = (AcademyGangsa)members[i];
				if (tempGangsa.getSubject().equals("자바")) {
					members[i].print();
				}	
			}
		}
		System.out.println("4.AcademyMember 중에서 영업 부서인 AcademyStaff   들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				AcademyStaff tempStaff = (AcademyStaff)members[i];
				if (tempStaff.getDepart().equals("영업")) {
					members[i].print();
				}
			}		
		}
	
		
		/******************************************************************************/
		
	}

}