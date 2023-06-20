
public class AcademyGangsa extends AcademyMember{
	public String subject;
	
	public AcademyGangsa() {
	}
	
	public AcademyGangsa(int no, String name,String subject) {
		super(no,name);
		/*
		this.no = no;
		this.name = name;
		*/
		this.subject =subject;
		
	}
	
	public void print() {
		super.print();
		System.out.print(this.subject);
		
	}

	public String getBan() {
		return subject;
	}

	public void setBan(String ban) {
		this.subject = ban;
	}

	public String getSubject() {
		// TODO Auto-generated method stub
		return subject;
	}
	
	
	
}
