package com.itwill01.field;

public class StudentMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체 2명생성
		 */
		
		Student stu1;
		stu1 = new Student();
		Student stu2;
		stu2 = new Student();
		
		
		/*
		 * 학생객체의 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		
		stu1.stu1_No = 1;
		stu1.stu1_Name = "우한영";
		stu1.stu1_Kor = 80.5;
		stu1.stu1_Eng = 75;
		stu1.stu1_Math = 95;
		
		stu2.stu2_No = 2;
		stu2.stu2_Name = "한영우";
		stu2.stu2_Kor = 70.5;
		stu2.stu2_Eng = 98.5;
		stu2.stu2_Math = 92;

		
		
		/*
		 * 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		 */
		
		stu1.stu1_Sum = stu1.stu1_Kor + stu1.stu1_Eng +  stu1.stu1_Math ;
		stu1.stu1_Average = stu1.stu1_Sum / 3;
		
		if (stu1.stu1_Average>=90) {	
			stu1.stu1_Grade = 'A';
		}else if (stu1.stu1_Average>=80) {
			stu1.stu1_Grade = 'B';
		}else if (stu1.stu1_Average>=70) {
			stu1.stu1_Grade = 'C';
		}else if (stu1.stu1_Average>=60) {
			stu1.stu1_Grade = 'D';
		}else {
			stu1.stu1_Grade = 'F';
		}
		
		stu2.stu2_Sum = stu2.stu2_Kor + stu2.stu2_Eng +  stu2.stu2_Math ;
		stu2.stu2_Average = stu2.stu2_Sum / 3;
		
		//유효성체크 
		//100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		
		if (!(stu1.stu1_Kor >= 0 && stu1.stu1_Kor <= 100)) {
			System.out.println("유효한점수가 아닙니다.");
			return;
		}
		if (!(stu1.stu1_Eng >= 0 && stu1.stu1_Eng <= 100)) {
			System.out.println("유효한점수가 아닙니다.");
			return;
		}
		if (!(stu1.stu1_Math >= 0 && stu1.stu1_Math <= 100)) {
			System.out.println("유효한점수가 아닙니다.");
			return;
		}
		if (!(stu2.stu2_Kor >= 0 && stu2.stu2_Kor <= 100)) {
			System.out.println("유효한점수가 아닙니다.");
			return;
		}		
		if (!(stu2.stu2_Eng >= 0 && stu2.stu2_Eng <= 100)) {
			System.out.println("유효한점수가 아닙니다.");
			return;
		}	
		if (!(stu2.stu2_Math >= 0 && stu2.stu2_Math <= 100)) {
			System.out.println("유효한점수가 아닙니다.");
			return;
		}

			
			
		
		
		if (stu2.stu2_Average>=90) {	
			stu2.stu2_Grade = 'A';
		}else if (stu2.stu2_Average>=80) {
			stu2.stu2_Grade = 'B';
		}else if (stu2.stu2_Average>=70) {
			stu2.stu2_Grade = 'C';
		}else if (stu2.stu2_Average>=60) {
			stu2.stu2_Grade = 'D';
		}else {
			stu2.stu2_Grade = 'F';
		}
			
		// if문을 활용한 석차구하기.
		
		if (stu1.stu1_Average > stu2.stu2_Average) {
			stu1.stu1_Rank = 1;
			stu2.stu2_Rank = 2;
		} else if (stu1.stu1_Average < stu2.stu2_Average) {
			stu1.stu1_Rank = 2;
			stu2.stu2_Rank = 1;
		} else {
			stu1.stu1_Rank = 1;
			stu2.stu2_Rank = 1;
		}
				
				
		
		/*
		 * 학생 데이타를 출력 2명
		 */
		/*
		- 출력포맷
 		- 평균은 소수점이하 첫째자리까지출력(반올림)
 		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		System.out.printf("--------------학생 성적출력-------------------%n");
			System.out.printf("%2s %3s %4s %s %s %s %3s %s %s%n","학번","이름","국어", "영어","수학","총점","평균","평점","석차");
			System.out.printf("-----------------------------------------------%n");
			System.out.printf("%3d %4s %5.1f %4.1f %4.1f %4.1f %4.1f %3s %4s \n ",stu1.stu1_No , stu1.stu1_Name ,
			stu1.stu1_Kor,stu1.stu1_Eng,stu1.stu1_Math ,stu1.stu1_Sum,stu1.stu1_Average, stu1.stu1_Grade, stu1.stu1_Rank);
			System.out.printf("%2d %4s %5.1f %4.1f %4.1f %4.1f %4.1f %3s %4s \n ",stu2.stu2_No , stu2.stu2_Name ,
			stu2.stu2_Kor,stu2.stu2_Eng,stu2.stu2_Math ,stu2.stu2_Sum,stu2.stu2_Average , stu2.stu2_Grade , stu2.stu2_Rank);
	}

}