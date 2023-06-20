
public class AcademyMemberArrayTypeCastingMain {

	public static void main(String[] args) {
		AcademyMember[] members = {
				new AcademyStudent(1, "KIM", "JAVA"),
				new AcademyStudent(2, "LIM", "DESIGN"),
				new AcademyStudent(3, "MIN", "ANDROID"),
				new AcademyGangsa(4, "OIM", "JAVA"),
				new AcademyGangsa(5, "PIM", "ANDROID"),
				new AcademyStaff(6, "QIM", "ACCOUNTING"),
				new AcademyStaff(7, "EIM", "MARKETING")
		};
		
		System.out.println("-------AcademyMember 전체출력-------");
		for (AcademyMember academyMember : members) {
			academyMember.print();
			System.out.println();
		}
		System.out.println("-------AcademyMember 전체출력-------");
		for (int i = 0; i < members.length; i++) {
			members[i].print();
			System.out.println();
		
		}
		
		System.out.println("-------------intanceof----------");
		AcademyMember am = new AcademyStudent(90,"김학생","정보처리");
		if(am instanceof AcademyStudent) {
			AcademyStudent tempStudent = (AcademyStudent)am;
			String tempBan = tempStudent.getBan();
			System.out.println("학생반 : " + tempBan);
		}
		System.out.println("---AcademyMember 배열에있는 객체들중에서 AcademyStudent객체들만 출력---");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				members[i].print();
				AcademyStudent tempStudent=(AcademyStudent)members[i];
				System.out.println("학생반:"+tempStudent.getBan());
			}else if(members[i] instanceof AcademyGangsa) {
				members[i].print();
				AcademyGangsa tempGangsa=(AcademyGangsa)members[i];
				System.out.println("강사과목:"+tempGangsa.getSubject());
			}else if(members[i] instanceof AcademyStaff) {
				members[i].print();
				AcademyStaff tempStaff=(AcademyStaff)members[i];
				System.out.println("스텝부서:"+tempStaff.getDepart());
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
