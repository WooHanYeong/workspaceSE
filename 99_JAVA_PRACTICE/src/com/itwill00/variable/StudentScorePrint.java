package com.itwill00.variable;

public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언 - 번호, 이름, 국어, 영어, 수학, 총점, 평균,
		 * 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */
		int no1;
		String name1;
		double kor1;
		double eng1;
		double math1;
		double sum1;
		double mean1;
		char hakjum1;
		int grade1;

		int no2;
		String name2;
		double kor2;
		double eng2;
		double math2;
		double sum2;
		double mean2;
		char hakjum2;
		int grade2;

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력
		 */
		no1 = 1;
		name1 = "우한영";
		kor1 = 81.5;
		eng1 = 83.7;
		math1 = 95.5;
		no2 = 1;
		name2 = "한영우";
		kor2 = 80.5;
		eng2 = 87.7;
		math2 = 60.5;

		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크 - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */

		if (!(kor1 >= 0 && kor1 <= 100)) {
			return;
		}
		if (!(eng1 >= 0 && eng1 <= 100)) {
			return;
		}
		if (!(math1 >= 0 && math1 <= 100)) {
			return;
		}
		if (!(kor2 >= 0 && kor2 <= 100)) {
			return;
		}
		if (!(eng2 >= 0 && eng2 <= 100)) {
			return;
		}
		if (!(math2 >= 0 && math2 <= 100)) {
			return;
		}

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		sum1 = kor1 + eng1 + math1;
		mean1 = (sum1 / 3);


		if (mean1 >= 90) {
			hakjum1 = 'A';
		} else if (mean1 >= 80) {
			hakjum1 = 'B';
		} else if (mean1 >= 70) {
			hakjum1 = 'C';
		} else if (mean1 >= 60) {
			hakjum1 = 'D';
		} else {
			hakjum1 = 'F';
		}

		sum2 = kor2 + eng2 + math2;
		mean2 = (sum2 / 3);
		if (mean2 >= 90) {
			hakjum2 = 'A';
		} else if (mean2 >= 80) {
			hakjum2 = 'B';
		} else if (mean2 >= 70) {
			hakjum2 = 'C';
		} else if (mean2 >= 60) {
			hakjum2 = 'D';
		} else {
			hakjum2 = 'F';
		}

		if (mean1 > mean2) {
			grade1 = 1;
			grade2 = 2;
		} else if (mean1 < mean2) {
			grade1 = 2;
			grade2 = 1;
		} else {
			grade1 = 1;
			grade2 = 1;
		}

		/*
		 * - 출력포맷 - 평균은 소수점이하 첫째자리까지출력(반올림) - 석차는 구하지마세요 --------------학생
		 * 성적출력------------------- 학번 이름 국어 영어 수학 총점 평균 평점 석차
		 * ----------------------------------------------- 1 김경호 42 56 78 334 34.8 A 3 2
		 * 김경수 45 53 76 334 34.8 A 2 -----------------------------------------------
		 */
		System.out.printf("---------------------학생 성적출력--------------------------\n");
		System.out.printf("학번  이름   국어  영어  수학  총점  평균  평점 석차\n");
		System.out.printf("------------------------------------------------------------\n");
		System.out.printf("%2d %5s %5.1f %5.1f %5.1f %5.1f %5.1f %3s %5d \n", no1, name1, kor1, eng1, math1, sum1,
				mean1, hakjum1, grade1);
		System.out.printf("%2d %5s %5.1f %5.1f %5.1f %5.1f %5.1f %3s %5d \n", no2, name2, kor2, eng2, math2, sum2,
				mean2, hakjum2, grade2);

	}

}
