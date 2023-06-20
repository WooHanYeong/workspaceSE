
public class AccountEncapsutionMain {
	public static void main(String[] args) {
		
	Account account1 =new Account();
	account1.setAccountData(1111,"KIM", 89000, 2.4);
	
	/*
	 * account1에 8000원입금
	 */
	
	account1.deposit(8000);
	account1.headerPrint();
	account1.print();
	
	/*
	 * account1 이율변경
	 */
	account1.setIyul(account1.getIyul()+1.0);
	account1.print();
	
	/*
	 * account1의 잔고얻기
	 */
	int account1Balance = account1.getBalance();
	System.out.println("잔고 : "+account1Balance );
	
	Account acc1 = new Account();
	Account acc2 = new Account();
	Account acc3 = new Account();
	acc1.setAccountData(100,"Woo",890000,3.5);
	acc2.setAccountData(200,"Han",750000,2.5);
	acc3.setAccountData(300,"Yeong",150000,2.7);
	
	/*
	 * 모든계좌잔고 50원증가
	 */
	acc1.deposit(50);	
	acc2.deposit(50);	
	acc3.deposit(50);	
	
	acc1.print();
	acc2.print();
	acc3.print();

	}
}
