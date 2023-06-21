package com.itwill06.collection.student;
import java.util.ArrayList;


public class StudentArrayListMain {

	public static void main(String[] args) {
		/*
		 * 0.학생ArrayList객체생성초기화
		 */
		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(1,"KIM",89,93,94));
		studentList.add(new Student(2,"HIM",88,77,98));
		studentList.add(new Student(3,"AIM",65,87,99));
		studentList.add(new Student(4,"KIM",75,97,60));
		studentList.add(new Student(5,"XIM",85,98,90));
		studentList.add(new Student(6,"TIM",95,88,77));
		studentList.add(new Student(7,"KIM",99,93,95));
		studentList.add(new Student(8,"LIM",83,80,99));
		studentList.add(new Student(9,"QIM",73,90,80));
		/*
		 * 0.학생두명추가
		 */
		studentList.add(new Student(10,"WOO",92,98,90));
		studentList.add(new Student(11,"HAN",88,69,47));
		System.out.println(studentList.size());
		
		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");
		Student.headerPrint();
		for (Student student : studentList) {
			student.calculateTotal();
			student.calculateAvg();
			student.calculateGrade();
			student.print();
		}
		//총점,평균,평점대입.
		
		
		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		Student.headerPrint();
		for (int i = 0; i < studentList.size(); i++) {
			for (int j = 0; j < studentList.size(); j++) {
				Student student = studentList.get(i);
				Student student2 = studentList.get(j);
				if(student.getTot()>student2.getTot()) {
					student.increaseRank();
				}
			}
		}
		for (int i = 0; i < studentList.size(); i++) {
			studentList.get(i).print();	
		}
		/*
		 * 3. 전체학생출력
		 */
		System.out.println("3. 전체학생출력 (enhanced for)");
		Student.headerPrint();
		for (Student student : studentList) {
			student.print();
		}
		/*
		 * 4. 번호3번 학생한명 출력
		 */
		System.out.println("4.번호3번 학생한명 출력  ");
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			if (student.getNo() == 3) {
				student.print();
			}
		}
		/*
		 * 5. 학점A인 학생들 출력
		 */
		System.out.println("5. 학점A인 학생들 출력");
		Student.headerPrint();
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			if (student.getGrade() == 'A') {
				student.print();
			
			}
		}
		/*
		 6.이름이 KIM인학생들 출력
		 */
		System.out.println("6.이름이 KIM인학생들 출력");
		Student.headerPrint();
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			if( student.getName().equals("KIM")){
				student.print();
			}
		}
		/*
		 * 7.번호3번학생한명삭제
		 */
		System.out.println("7.번호3번학생삭제");
		Student.headerPrint();
		for (int i = 0; i < studentList.size(); i++) {
			Student tempStudent = studentList.get(i);
			if (tempStudent.getNo() ==3) {
				Student student = studentList.remove(i);
				break;
			}
	
		}
		
		/*
		 * 8.이름KIM인 학생들삭제
		 */
		System.out.println("8.이름KIM인 학생들삭제");
		Student.headerPrint();
		for (int i = 0; i < studentList.size(); i++) {
			Student tempStudent = studentList.get(i);
			if (tempStudent.getName().equals("KIM")) {
				Student student = studentList.remove(i);
			}
		}
		/*
		 * 9.평점 F 인 학생들삭제
		 */
		System.out.println("9.평점 F 인 학생들삭제");
		Student.headerPrint();
		for (int i = 0; i < studentList.size(); i++) {
			Student tempStudent = studentList.get(i);
			if (tempStudent.getGrade() == 'F') {
				Student student = studentList.remove(i);
			}
		}
		
		System.out.println("7,8,9 결과");
		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			student.print();
		}
		/******************안해도됨******************************/
		/*
		 * 10. 학생총점으로 오름차순정렬
		 */
		System.out.println("10. 학생총점으로 내림차순정렬");
		for (int i = 0; i < studentList.size(); i++) {
			for (int j = 0; j < studentList.size()-1; j++) {
				Student tempStudent = studentList.get(i);
				tempStudent.getTot();
			}
		}
		/*
		  11. 학생이름순으로 오름차순정렬
		 */
		System.out.println("11.학생이름순으로 오름차순정렬");
		/********************************************************/
	}
}