public class Car {

	/*
	 * 멤버필드(변수)[속성]
	 * 
	 */
	String no; //차량번호
	int inTime; //입차시간
	int outTime; //출차시간
	int fee;     //주차요금
	
	/*
	 * 멤버메쏘드[기능] 
	 */
	
	/*
	 * 입차시데이터대입
	 */
	void setIpChaData(String no ,int inTime) {
		this.no = no;
		this.inTime = inTime;
	}
	/*
	 * 출차시데이터대입.
	 */
	void setOutTime(int outTime) {
		this.outTime = outTime;
	}
	
	/*
	 * 주차요금계산
	 */
	void calculateFee() {
		this.fee=  (this.outTime-this.inTime)*1000;
	}
	
	void print() {
		System.out.printf("------------------------------------\n");	
		System.out.printf("%s %s %s %s \n","차량번호","입차시간","출차시간","주차요금");
		System.out.printf("------------------------------------\n");	
		System.out.printf("%6s %7d %8d %9d",this.no,this.outTime,this.inTime,this.fee);
	}
	
	
} //end

























