package constructor;
public class StudentConstructorMain {
		public static void main(String[] args) {
			/*
			 학생객체생성(3명)
			  - 1명은 기본생성자사용
				  학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출
			  - 2명은 인자5개 생성자사용
			 */
			Student student1 = new Student();
			student1.setStudentData(1, "우한영", 60, 70, 55);
			
			
			Student student2 = new Student(2,"한영우",80,90,75);
			
			
			Student student3 = new Student(3,"영한우",50,85,97);
			
						
			/*
			 학생총점계산 메쏘드 호출(3명)
			 학생평균계산 메쏘드 호출(3명)
			 학생평점계산 메쏘드 호출(3명)
			 */
			student1.calculateTotal();
			student1.calculateAvg();
			student1.calculateGrade();
			
			student2.calculateTotal();
			student2.calculateAvg();
			student2.calculateGrade();

			student3.calculateTotal();
			student3.calculateAvg();
			student3.calculateGrade();
			
			/*
			 * 학생데이타 출력메쏘드 호출(3명)
			 */
			student1.headerPrint();
			student1.print();
			
			student2.headerPrint();
			student2.print();
			
			student3.headerPrint();
			student3.print();
			
			/*
			 * 학생 student1 의 이름변경한후(이름변경메쏘드호출후) student1학생객체출력
			 * 학생 student1 의 총점데이타 반환받은후 메인블록에서출력
			 * 학생 student1 의 학점데이타 반환받은후 메인블록에서출력
			 */
		
			student1.setName("홍길동");
			student1.headerPrint();
			student1.print();
			System.out.println();
			int get1Tot = student1.getTot();
			System.out.println("총점데이터 : "+get1Tot);
			char get1Grade = student1.getGrade();
			System.out.println("학점데이터 : "+get1Grade);
			
			
			
		}
	}