
public class acoountMemberFieldMain {

	public static void main(String[] args) {
		
		/**********************case1************************/
		/*
		 * 1. 1111번계좌 8000원입금.
		 */
		
		/*
		 * 1-1계좌객체생성
		 * 1-2계좌데이터대입
		 */
		Account acc1 = new Account();
		acc1.no=1111;
		acc1.owner="KIM";
		acc1.balance=10000;
		acc1.iyul=3.0;
		/*
		 * 1-3 계좌잔고 8000증가
		 */
		acc1.balance+=8000;
		
		/*
		 * 2.1111계좌정보출력
		 */
		System.out.println("-----------------------");
		System.out.printf("%s %s %4s %s\n","번호","이름","잔고","이율");
		System.out.println("-----------------------");
		System.out.printf("%d %s %8d %.1f",
				acc1.no,acc1.owner,
				acc1.balance,acc1.iyul);
		
		
		/*************************case2************************/
		/*
		 * 1.은행모든계좌의 잔고 50원증가
		 */
		/*
		 * 1-1. 전체계좌생성
		 * 1-2  계좌데이터대입	
		 */
		Account a1 =new Account();
		a1.no=1000;
		a1.owner="KIM";
		a1.balance=70000;
		a1.iyul=2.0;
		
		Account a2 =new Account();
		a2.no=2000;
		a2.owner="LEE";
		a2.balance=98000;
		a2.iyul=3.5;
		
		Account a3 =new Account();
		a3.no=3000;
		a3.owner="SIM";
		a3.balance=34000;
		a3.iyul=2.8;
		
		/*
		 * 1-3 .모든계좌잔고 50원증가.
		 */
		a1.balance+=50;
		a2.balance+=50;
		a3.balance+=50;
		
		/*
		 * 은행계좌 전체정보출력
		 */
		System.out.println();
		System.out.println("-----------------------");
		System.out.printf("%s %s %4s %s\n","번호","이름","잔고","이율");
		System.out.println("-----------------------");
		System.out.printf("%d %s %8d %.1f",
				a1.no,a1.owner,
				a1.balance,a1.iyul);
		System.out.println();
		System.out.printf("%d %s %8d %.1f",
				a2.no,a2.owner,
				a2.balance,a2.iyul);
		System.out.println();
		System.out.printf("%d %s %8d %.1f",
				a3.no,a3.owner,
				a3.balance,a3.iyul);
		
		
	}

}
