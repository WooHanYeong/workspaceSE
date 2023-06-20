/**
 * 주차장에서 차객체를 생성할 클래스.
 * @author KIM
 * @version 0.1
 * 
 */



public class Car {

	/*
	 * 멤버필드(변수)[속성]
	 * 
	 */
	
	/**
	 * 입차시데이터대입메쏘드
	 *  @param no 차량번호
	 *  @param inTime 입차시간
	 */
	
	private String no; //차량번호
	private int inTime; //입차시간
	private int outTime; //출차시간
	private int fee;     //주차요금
	
	/*
	 * 멤버메쏘드[기능] 
	 */
	
	/*
	 * 입차시데이터대입
	 */
	public void setIpChaData(String no ,int inTime) {
		this.no = no;
		this.inTime = inTime;
	}
	/*
	 * 출차시데이터대입.
	 */
	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}
	
	/*
	 * 주차요금계산
	 */
	/**
	 * 주차요금계산
	 */
	public void calculateFee() {
		this.fee=  (this.outTime-this.inTime)*1000;
	}
	/**
	 * 차량정보출력
	 */
	void print() {
		System.out.printf("------------------------------------\n");	
		System.out.printf("%s %s %s %s \n","차량번호","입차시간","출차시간","주차요금");
		System.out.printf("------------------------------------\n");	
		System.out.printf("%6s %7d %8d %9d",this.no,this.outTime,this.inTime,this.fee);
	}
	
	
	//setter
	
	public void setNo(String no) {
		this.no = no;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	//get 
	
	
	public String getNo() {
		return no;
	}
	public int getInTime() {
		return inTime;
	}
	public int getOutTime() {
		return outTime;
	}
	public int getFee() {
		return fee;
	}
	
	
	
	
	
} //end

























