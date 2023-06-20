
public class CarMemberMethodMain {

	public static void main(String[] args) {
		Car car1 =new Car();
		/*
		 * 1. 차량번호 1234 차량 12시 입차 메쏘드 호출
		 */
		// 입차시 데이터(번호,시간)대입 메쏘드호출
		car1.setIpChaData("1234", 12);
		
		/*
		 * 2.car1차량 16시출차
		 */
		/*
		 * 2-1 출차시간대입메쏘드호출
		 */
		car1.setOutTime(16);
		
		/*
		 * 2-2 주차요금계산메쏘드실행
		 */
		car1.calculateFee();
		/*
		 * 2-3 주차요금 영수증 출력 메쏘드 실행
		 */
		car1.print();
		
		
		System.out.println();
		System.out.println("--------------------------");
		Car car2 = new Car();
		car2.setIpChaData("7788",14);
		car2.setOutTime(17);
		car2.calculateFee();
		car2.print();
	}//end

}//end
