public class SalaryEnployee extends Employee {
	private int annualSalary;
	public SalaryEnployee() {
		
	}
	
	public SalaryEnployee( int no, String name,int annualSalary) {
		super(no,name);
		this.annualSalary = annualSalary;
	}
	
	public void print() {
		super.print();
		System.out.println(annualSalary);
	}


	@Override
	public void calculatePay() {
		int tempPay = this.annualSalary/12;
		this.setPay(tempPay);
	}



	public int getAnnualSalary() {
		return annualSalary;
	}



	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
}
