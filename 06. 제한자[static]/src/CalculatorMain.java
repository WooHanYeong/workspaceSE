

public class CalculatorMain {

	public static void main(String[] args) {
		/*
		System.out.println("---------access non static way------");
		Calculator calculator=new Calculator();
	
		int result=calculator.add(23,34);
		System.out.println(result);
		
		result=calculator.sub(23,34);
		System.out.println(result);
		
		result=calculator.mul(23,34);
		System.out.println(result);
		
		result=calculator.div(45435,34);
		System.out.println(result);
		*/
		
		
		System.out.println("---------access static way------");
		int result = Calculator.add(12, 23);
		System.out.println(result);
		result = Calculator.sub(12, 23);
		System.out.println(result);
		result = Calculator.mul(12, 23);
		System.out.println(result);
		result = Calculator.div(12, 23);
		System.out.println(result);
		
	}

}