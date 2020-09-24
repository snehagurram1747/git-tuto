package oopproject;

public class JuniorSavingsAccount extends SavingsAccount{
	
	String GuardiaNname;

	public JuniorSavingsAccount(int accountno, float balance, int pin, String guardiaNname) {
		super(accountno, balance, pin); // call to the super class constructor
		GuardiaNname = guardiaNname;
	}

	
	
	
}
