/*
 *  계좌객체를 생성하기위한 클래스 (틀,타입)
 */
public class Account {
	/*
	 * 1.속성 [멤버필드(변수)]
	 */
	
	private int no; //계좌번호
	private String owner; //계좌주이름
	private int balance; //계좌잔고
	private double iyul; //계좌이율
	/**
	 * 기본값으로 초기화된 계좌객체생성
	 */
	public Account() {
		
	}
	/**
	 * 인자값으로 초기화된 계좌객체생성
	 * @param no	계좌번호
	 * @param owner	계좌주	
	 * @param balance	계좌잔고
	 * @param iyul	계좌이율
	 */
	
	public Account(int no, String owner, int balance, double iyul) {
		super();
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}



	/*
	 * 2.행위[멤버메쏘드]
	 */
	/*
	 * 계좌데이터를 대입하는 메쏘드
	 */
	public void setAccountData(int no, String owner, int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	
	/*
	 * 입금
	 */
	/**
	 * 입금
	 * @param money 입금할돈 0보다 큰수여야한다.
	 */
	 public void deposit(int money) {
			this.balance +=money;
		
	 }
	
	 /*
	 * 출금
	 */
	/**
	 * 출금
	 * @param money 출금할돈 
	 */
	 public void withDraw(int money) {
		 
		this.balance=this.balance-money;
	}
	
	/*
	 * 계좌헤더출력
	 */
		/**
		 * 헤더출력
		 * @param headerPrint 헤더출력 
		 */

	 static public void headerPrint() {
		System.out.println("-----------------------");
		System.out.printf("%s %s %4s %s\n","번호","이름","잔고","이율");
		System.out.println("-----------------------");
	}
	
	/*
	 * 계좌객체정보출력
	 */
	

	 public void print() {
			System.out.printf("%d %s %8d %.1f\n",
					no,owner,balance,iyul);
	 }
	 
	// getter , setter 
	// alt +shift + s --> r
	 
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getIyul() {
		return iyul;
	}

	public void setIyul(double iyul) {
		this.iyul = iyul;
	}
	 
	 
	 
	 
	 
	 
	 
}
