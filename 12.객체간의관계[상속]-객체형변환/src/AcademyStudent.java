
public class AcademyStudent extends AcademyMember {
	public String ban;
	
	public AcademyStudent() {
		super();
	}
	
	public AcademyStudent(int no, String name,String ban) {
		super(no,name);
		/*this.no = no;
		this.name = name;
		*/
		this.ban = ban;
		
	
	}

	public void print() {
		super.print(); //sysoout,print(no+name) 상속.
		System.out.print(this.ban);
	}
	
	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}
	
	
}
