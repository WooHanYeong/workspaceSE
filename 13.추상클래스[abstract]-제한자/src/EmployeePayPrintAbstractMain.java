
public class EmployeePayPrintAbstractMain {

	public static void main(String[] args) {
		Employee[] emps = {
				new SalaryEnployee(1, "고범석" ,4000),
				new SalaryEnployee(2, "권경록" ,4500),
				new SalaryEnployee(3, "김숙현" ,4300),
				new HourlyEmployee(4, "고길동" ,200,10000),
				new HourlyEmployee(5, "김둘리" ,100,9000),
		};
		
		for (Employee employee : emps) {
			employee.calculatePay();
			System.out.println("--------"+employee.getName()+"님 급여명세표----------");
		}
	
	}
}
