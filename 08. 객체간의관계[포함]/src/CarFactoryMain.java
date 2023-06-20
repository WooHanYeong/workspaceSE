
public class CarFactoryMain {

	public static void main(String[] args) {
		/*
		 * 자동차공장
		 */
		Engine porcheEngine=new Engine("A",5000);
						
		Car porcheCar =new Car();
		porcheCar.setNo(1234);
		porcheCar.setModel("PORCHE");
		porcheCar.setEngine(porcheEngine);
		
		porcheCar.print();
		
		System.out.println("------차량엔진검사-------");
		Car gumsaCar = porcheCar;
		Engine returngumsaEngine = gumsaCar.getEngine();
		returngumsaEngine.print();
		
		System.out.println();
		Car volvoCar = 
				new Car(5678,"xc90",new Engine("S",4900));
		volvoCar.print();
		System.out.println("------차량엔진검사-------");
		volvoCar.getEngine().print();
	}
}
