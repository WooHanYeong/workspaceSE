
public class EmployeePayPrinFinalMain {

	public static void main(String[] args) {
		Employee[] emps = {
				new SalaryEnployee(1,"KIM",45000000),
				new SalaryEnployee(2,"GIM",80000000),
				new SalaryEnployee(3,"VIM",20000000),
				new HourlyEmployee(4,"HOM",100,30000),
				new HourlyEmployee(5,"GON",100,10000)
		};
	
	
	
		for (Employee emp : emps) {
			emp.calculatePay();
			System.out.println("-----------"+emp.getName()+"님 급여명세표--------");
			emp.print();
			double incentive=emp.calculateIncentive();
			System.out.println("\t인센티브 : "+incentive);
			System.out.println("-------------------");
		}
	
		
		System.out.println("사원인센티브율 : " + Employee.INCETIVE_RATE);
	
	

		
		
		
	}
}
