public class AcademyGangsa extends AcademyMember{
	public String ban;
	
	public AcademyGangsa() {
	}
	
	public AcademyGangsa(int no, String name,String ban) {
		super(no,name);
		/*
		this.no = no;
		this.name = name;
		*/
		this.ban = ban;
		
	}
	
	public void print() {
		super.print();
		System.out.print(this.ban);
		
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}
	
	
	
}
