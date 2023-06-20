
public class ReferenceTypeArrayMain {

	public static void main(String[] args) {
		
		/*int a=354 ; 
		int[] ia;
		Account acc;
		Account[] accArray;
		*/
		
		Account[] accountArray = new Account[5];
		accountArray[0] = 
				new Account(1, "KIM", 30000,0.4) ;
		accountArray[1] = 
				new Account(2, "Soo", 45000,0.8) ;
		accountArray[2] = 
				new Account(3, "Yen", 84000,4.2) ;
		accountArray[3] = 
				new Account(4, "Han", 17000,1.9) ;
		accountArray[4] = 
				new Account(5, "Woo", 20000,0.3) ;
	
		Account.headerPrint();
		accountArray[0].print();
		accountArray[1].print();
		accountArray[2].print();
		accountArray[3].print();
		accountArray[4].print();
		Account.headerPrint();
		System.out.println("-------------for------------");
		for (int i = 0; i < accountArray.length; i++) {
			accountArray[i].print();
		}
		
		
		
	}

}
