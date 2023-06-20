package com.itwill04.array.student;

	public class StudentArrayMain {

		public static void main(String[] args) {
			/*
			 * 0.학생배열객체초기화
			 */
			Student[] students = { 
					new Student(1, "KIM", 89, 93, 94), 
					new Student(2, "HIM", 88, 77, 98),
					new Student(3, "AIM", 65, 87, 99), 
					new Student(4, "BIM", 75, 97, 60), 
					new Student(5, "XIM", 85, 98, 90),
					new Student(6, "KIM", 95, 88, 77), 
					new Student(7, "ZIM", 99, 93, 95), 
					new Student(8, "LIM", 83, 80, 99),
					new Student(9, "QIM", 73, 90, 80)
			};
		
			 
			 System.out.println(">>>>>>>>>>>>>>>>> 기본데이터 <<<<<<<<<<<<<<<<<<<<<<<");
			 System.out.printf("-----------------학생성적출력-----------------\n");
			 System.out.printf("%s %3s %s %s %s %s %3s %s %s\n",
					 "학번","이름","국어","영어","수학","총점","평균","평점","석차");
			 System.out.printf("----------------------------------------------\n");
			 for(int i=0;i<students.length;i++) {
				 System.out.printf("%4d %-6s %d %4d %4d \n",
						 students[i].getNo(),students[i].getName(),students[i].getKor(),
						 students[i].getEng(),students[i].getMath());
			 }System.out.println();
			
			
			/*
			 * 1. 전체학생들 개인별 총점,평균,평점계산
			 */
			System.out.println("1. 전체학생총점,평균,평점계산\n");
			
			for(int i=0; i<students.length; i++) {
				students[i].calculateTotal();
				students[i].calculateAvg();
				students[i].calculateGrade();
			}
			
			
			 
			/*
			 * 2. 전체학생 총점으로 석차계산
			 */
			 
			System.out.println("2. 전체학생 총점으로 석차계산\n");
			 for (int i = 0; i < students.length; i++) {
				for (int j = 0; j < students.length; j++) {
					if(students[i].getTot() < students[j].getTot()) {
						students[i].setRank(students[i].getRank() +1);
					}
				}
			} 

			


			/*
			 * 3. 전체학생출력
			 */
			System.out.println("3. 전체학생출력 ");
			System.out.println(">>>>>>>>>>>>>>>>> 전체학생 데이터 <<<<<<<<<<<<<<<<<<<<<<<");
			 System.out.printf("-----------------학생성적출력-----------------\n");
			 System.out.printf("%s %3s %s %s %s %s %3s %s %s\n",
					 "학번","이름","국어","영어","수학","총점","평균","평점","석차");
			 System.out.printf("----------------------------------------------\n"); 
			 for(int i=0;i<students.length;i++) {
				 System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d \n",
						 students[i].getNo(),students[i].getName(),students[i].getKor(),
						 students[i].getEng(),students[i].getMath(),students[i].getTot(),
						 students[i].getAvg(),students[i].getGrade(),students[i].getRank());
			}System.out.println();
			/*
			 * 4. 번호3번 학생한명 출력
			 */
			System.out.println("4.번호3번 학생한명 출력  ");
			for (int i = 0; i < students.length; i++) {
				if(students[i].getNo()==3) {
					students[i].print();
				}
			}System.out.println();
		
			/*
			 * 5. 학점A인 학생들 출력
			 */
			System.out.println("5. 학점A인 학생들 출력");
			for (int i = 0; i < students.length; i++) {
				if(students[i].getGrade()=='A') {
					students[i].print();
				}
			}System.out.println();
			
			/*
			 * 6. 학생총점으로 오름차순정렬
			 */
			System.out.println("6. 학생총점으로 내림(오름)차순정렬");
		for(int i =0;i<students.length;i++) {	
			for(int j=0;j < students.length-1;j++) {
				 if(students[j].getTot() > students[j+1].getTot()) {
					 //tot 교체
					 int studentsTot = students[j+1].getTot();
					 students[j+1].setTot(students[j].getTot());
					 students[j].setTot(studentsTot);
					 
					 //no교체
					 int studentsNo = students[j+1].getNo();
					 students[j+1].setNo(students[j].getNo());
					 students[j].setNo(studentsNo);
					 
					 //name교체
					 String studentsName = students[j+1].getName();
					 students[j+1].setName(students[j].getName());
					 students[j].setName(studentsName);
					 
					 //kor 교체
					 int studentskor = students[j+1].getKor();
					 students[j+1].setKor(students[j].getKor());
					 students[j].setKor(studentskor);
					 
					 //eng 교체
					 int studentseng = students[j+1].getEng();
					 students[j+1].setEng(students[j].getEng());
					 students[j].setEng(studentseng);
					 
					 //avg 교체
					 double studentsavg = students[j+1].getAvg();
					 students[j+1].setAvg(students[j].getAvg());
					 students[j].setAvg(studentsavg);
					 
					 //grade 교체
					 
					 char studentsgrade = students[j+1].getGrade();
					 students[j+1].setGrade(students[j].getGrade());
					 students[j].setGrade(studentsgrade);
					 
					 //rank 교체
					 int studentsrank = students[j+1].getRank();
					 students[j+1].setRank(students[j].getRank());
					 students[j].setRank(studentsrank);
				 	}
				 }
				
			 }
			System.out.println("3. 전체학생출력 ");
			System.out.println(">>>>>>>>>>>>>>>>> 전체학생 데이터 <<<<<<<<<<<<<<<<<<<<<<<");
			 System.out.printf("-----------------학생성적출력-----------------\n");
			 System.out.printf("%s %3s %s %s %s %s %3s %s %s\n",
					 "학번","이름","국어","영어","수학","총점","평균","평점","석차");
			 System.out.printf("----------------------------------------------\n"); 
			 for(int i=0;i<students.length;i++) {
				 System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d \n",
						 students[i].getNo(),students[i].getName(),students[i].getKor(),
						 students[i].getEng(),students[i].getMath(),students[i].getTot(),
						 students[i].getAvg(),students[i].getGrade(),students[i].getRank());
			}System.out.println();
		}

	}