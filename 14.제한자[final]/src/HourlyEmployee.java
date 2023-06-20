public class HourlyEmployee extends Employee {
	private int workHour;   //일한시간
	private int payPerHour; //시간당급여
	
	public HourlyEmployee() {
	}
	
	
	public HourlyEmployee(int no,String name,int workHour, int payPerHour) {
		super(no,name); 
		this.workHour = workHour;
		this.payPerHour = payPerHour;
	}
	
	public void print() {
		super.print();
		System.out.println(this.workHour + "\t" + this.payPerHour+"\t");
		
	}
	
	@Override
	public void calculatePay() {
		this.setPay(this.workHour * this.payPerHour);
		
	}


	public int getWorkHour() {
		return workHour;
	}


	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}


	public int getPayPerHour() {
		return payPerHour;
	}


	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}
	
}
