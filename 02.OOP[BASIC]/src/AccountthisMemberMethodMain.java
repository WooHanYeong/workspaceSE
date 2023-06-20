
public class AccountthisMemberMethodMain {

	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.setAccountData(1111, "KIm",1000, 3.0);
		acc1.deposit(8000);
		acc1.headerPrint();
		acc1.print();
	
	/*************************case2************************/
	System.out.println();
	/*
	 * 1.은행모든계좌의 잔고 50원증가
	 */
	/*
	 * 1-1. 전체계좌생성
	 * 1-2  계좌데이터대입	
	 */
	Account a1 = new Account();
	Account a2 = new Account();
	Account a3 = new Account();
	a1.setAccountData(1000, "KIm",70000, 2.0);
	a2.setAccountData(2000, "Lee",90000, 3.5);
	a3.setAccountData(3000, "SIN",34000, 2.8);
	
	a1.deposit(50);
	a2.deposit(50);
	a3.deposit(50);
	
	a1.headerPrint();
	a1.print();
	a2.print();
	a3.print();
	
	}
}
