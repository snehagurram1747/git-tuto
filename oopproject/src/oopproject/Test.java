package oopproject;

public class Test {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
    
		SavingsAccount account = new SavingsAccount();
     
		account.accountno = 101;
		account.balance = 5000;
		account.pin = 1234;
  
		System.out.println("Account : " +account.accountno);
		System.out.println("balance : " +account.balance);
		System.out.println("pin : " +account.pin);
		System.out.println("MinimumBalance :" +SavingsAccount.MinimumBalance);
		account.deposit(1000);
		
		SavingsAccount account2 = new SavingsAccount(102, 6000, 2345);
		
//		account2.accountno = 102;
//		account2.balance = 6000;
//		account2.pin = 2345;
  
		//String.format("%n");
		System.out.println("Account : "  +account2.accountno);
		System.out.println("balance : " +account2.balance);
		System.out.println("pin : " +account2.pin);
		System.out.println("MinimumBalance :" +SavingsAccount.MinimumBalance);
		account2.deposit(3000);
		
		SavingsAccount account3 = new SavingsAccount(103, 3000,5678);
		
			System.out.println("Account : "  +account3.accountno);
			System.out.println("balance : " +account3.balance);
			System.out.println("pin : " +account3.pin);
			System.out.println("MinimumBalance :" +SavingsAccount.MinimumBalance);
		account3.withdraw(4000);
		
		
	}

}
