
public class CarMemberFiled {

	public static void main(String[] args) {
		/*
		 * 주차관리 프로그램시작.
		 */
		/*
		 * 1.차량번호 1234 차량 12시입차
		 */
		Car car1; //차객체의 주소값을저장할 Car클래스타입 참조변수선언
		car1 = new Car(); 
		//Car클래스를 사용해서 차객체를 생성한 후 차 객체의 주소값이
		//car1 변수에 대입
		
		car1.no ="1234"; //차객체(car1)의 멤버필드no에 "1234"값대입
		car1.inTime =12; //차객체(car1)의 멤버필드inTime에 12값대입
		
		/*
		 * 2. car2차량 16시출차
		 */
		/*
		 *  2-1. 출차시간대입
		 */
		car1.outTime=16; //차객체(car1)의 멤버필드outTime에 16값대입
		/*
		 * 	2-2. 주차요금계산
		 */
		car1.fee = (car1.outTime-car1.inTime)*1000;
		//차객체(car1)의 멤버필드 fee에 차객체(car1)의 
		//outTime,inTime멤버필드를 사용해서주차요금계산 후 대입.
		
		
		/*
		 * 2-3. 주차요금 영구증출력
		 */
		System.out.printf("------------------------------------\n");	
		System.out.printf("%s %s %s %s \n","차량번호","입차시간","출차시간","주차요금");
		System.out.printf("------------------------------------\n");	
		System.out.printf("%6s %7d %8d %9d",car1.no,car1.outTime,car1.inTime,car1.fee);
	
	}

}
