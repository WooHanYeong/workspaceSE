package method;

	/*
	  #### 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
	 */
	public class Student {

		/*
		 * << 속성(멤버변수)   >> 번호 이름 국어 영어 수학 총점 평균 평점 석차
		 * << 기능(멤버메쏘드) >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
		 */

		// 멤버변수 선언
		int no;
		String name;
		int kor;
		int eng;
		int math;
		int tot;
		double avg;
		char grade;
		int rank;
		
		// 멤버메쏘드 선언
		/*
		 * 기본데이타(번호,이름,국어,영어,수학)멤버변수에대입하는메쏘드
		 */
		void setAccountData(int no, String name, int kor,int eng,int math,int tot,
			double avg,char grade,int rank) {
			this.no=no;	this.name=name;	this.kor=kor; this.eng=eng; this.math=math;
			this.tot=tot; this.avg=avg; this.grade=grade; this.rank=rank;
		}
		
		/*
		 * 총점계산메쏘드
		 */
		void tot(int kor, int eng, int math) {
			this.tot=this.kor+this.eng+this.math;
		}
		/*
		 * 평균계산메쏘드
		 */
		
		/*
		 * 평점계산메쏘드
		 */
		
		/*
		 * 출력메쏘드
		 */
		void headerPrint() {
			System.out.println("-----------------------");
			System.out.printf("%s %s %4s %s\n","번호","이름","잔고","이율");
			System.out.println("-----------------------");
		}
		

		
	}