package oopproject;

public class TestInheritance {

	

	public static void main(String[] args) {

	JuniorSavingsAccount account = new JuniorSavingsAccount(112,2000,2323, "harry");	
		
			
	
	System.out.println("Account : " +account.accountno);
	System.out.println("balance : " +account.balance);
	System.out.println("pin : " +account.pin);
	System.out.println("MinimumBalance :" +SavingsAccount.MinimumBalance);
	account.withdraw(1000);
	}
}
