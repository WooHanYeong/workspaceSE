public class AcademyStudent extends AcademyMember {
	public String ban;
	
	public AcademyStudent() {
	}
	
	public AcademyStudent(int no, String name,String ban) {
		this.no = no;
		this.name = name;
		this.ban = ban;
		
	
	}

	public void studentPrint() {
		this.print(); //sysoout,print(no+name) 상속.
		System.out.print(this.ban);
	}
	
	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}
	
	
}
