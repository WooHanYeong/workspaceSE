
public class ReferenceTypeArrayAccountMain {

	public static void main(String[] args) {
		System.out.println("-------{}를 사용한 배열객체생성과 초기화.");
		Account acc1 = new Account(1111,"LEE",5600,0.8);
		
		Account[] accounts = { acc1, new Account(2222, "KIM", 568000, 3.5), new Account(3333, "PARK", 965000, 6.9),
						new Account(4444, "LEE", 342000, 2.9), new Account(5555, "CHOI", 783000, 4.8),
						new Account(6666, "SIM", 612900, 9.2), new Account(7777, "SOO", 560000, 5.8),
						new Account(8888, "MIN", 123000, 2.2), new Account(9999, "JANG", 980000, 8.9) };
		
		
		System.out.println("1.은행총계좌수 : "+accounts.length + "개\n");
		
		System.out.println("2.은행계좌 전체출력");
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}System.out.println();
		
		System.out.println("3.은행계좌들 총잔고");
		int totBalance =0;
		for (int i = 0; i < accounts.length; i++) {
			totBalance +=accounts[i].getBalance();
		}
		System.out.println(">> " + totBalance);
		System.out.println();
		
		System.out.println("4.은행 계좌들중에서 계좌번호 3333번계좌 한개 찾아서 출력(계좌번호는 중복되지않는다)");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == 3333) {
				accounts[i].print();
			}	
		}System.out.println();
		
		System.out.println("5.은행 계좌들중에서 계좌잔고 500000원이상인 VIP계좌 여러개 찾아서 출력[enhanced for]");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance() >= 500000) {
				accounts[i].print();
			}
		}System.out.println();
		
		System.out.println("6.은행 계좌들중에서 계좌이율 2.0 이상인 계좌 여러개 찾아서 출력[Quiz]");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul() >=2.0){
				accounts[i].print();
			}
		}
		System.out.println();

		
		System.out.println("6.은행 계좌들중에서 이름이 KIM인 계좌 여러개 찾아서 출력[String객체배우고난후에]");
		System.out.println();
		
		System.out.println("7.6666번계좌 3000원입금");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo() == 6666) {
				System.out.print("입금전 : "); accounts[i].print();
				accounts[i].deposit(3000);
				System.out.print("입금후 : ");accounts[i].print();
			}
		}System.out.println();
		
		System.out.println("8.9999번계좌 3000원출금[Quiz]");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo() == 9999) {
				System.out.print("입금전 : "); accounts[i].print();
				accounts[i].withDraw(3000);
				System.out.print("입금후 : ");accounts[i].print();
				break;
			}
		}System.out.println();
		
		System.out.println("9.계좌잔고순으로 오름차순정렬");
		System.out.println("정렬전");

			for (int j = 0; j < accounts.length; j++) {
				accounts[j].print();
		}
		for(int j=0;j<accounts.length-1;j++) {	
		for (int i = 0; i < accounts.length-1-j; i++) {
			if(accounts[i].getBalance() >accounts[i+1].getBalance()) {
				Account tempAccount = accounts[i+1];
				accounts[i+1] = accounts[i];
				accounts[i]=tempAccount;
				}
			}	
		}
			
		System.out.println("정렬후");

			for (int j = 0; j < accounts.length; j++) {
				accounts[j].print();
		}System.out.println();
		
		System.out.println("9.계좌잔고순으로 내림차순정렬[Quiz]");
		System.out.println("정렬전");

		for (int j = 0; j < accounts.length; j++) {
			accounts[j].print();
		}
		for(int j=0;j<accounts.length-1;j++) {	
		for (int i = 0; i < accounts.length-1-j; i++) {
			if(accounts[i].getBalance() <accounts[i+1].getBalance()) {
				Account tempAccount = accounts[i+1];
				accounts[i+1] = accounts[i];
				accounts[i]=tempAccount;
				}
			}	
		}
		
	System.out.println("정렬후");

		for (int j = 0; j < accounts.length; j++) {
			accounts[j].print();
	}
		//동일경우 다른차순생각하가.
		
		System.out.println("9.계좌번호순으로 오름(내림)차순정렬[Quiz]");
		
		System.out.println("9.계좌이름순으로 오름(내림)차순정렬(String 클래스를 배운후에추가)");
		
		System.out.println("10.5555계좌한개 이율을 3.6으로변경");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo() == 5555) {				
				System.out.println("변경 전 이율 : " + accounts[i].getIyul());
				accounts[i].setIyul(3.6);
				System.out.println("변경 후 이율 : " + accounts[i].getIyul());
				break;
			}
		}
		
		System.out.println("11.VIP계좌(잔고50000원이상)여러개 잔고 50원 증가");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance()>=500000) {
				accounts[i].deposit(50);		
			}
		}
		
		Account.headerPrint();
		for (Account account : accounts) {
			account.print();
		}
		
		
		
	}
}
