
public class CarEncapsulationMain {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.setIpChaData("1234",12);
		
		Car car2 = new Car();
		car2.setIpChaData("8890", 13);
		
		
		car1.setOutTime(16);
		car1.calculateFee();
		car1.print();
		System.out.println();
		car2.setOutTime(16);
		car2.calculateFee();
		car2.print();
		
		/*
		 * car1객체의 주차요금
		 */
		//System.out.println(car1.fee);
		System.out.println();
		System.out.println();
		int car1Fee = car1.getFee();
		System.out.println("car1의 주차요금 : "+car1Fee);
		
		
		
	}

}
