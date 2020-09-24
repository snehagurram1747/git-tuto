package oopproject;

public class SavingsAccount {
	
	int accountno;
	float balance;
	int pin;
	
	static int MinimumBalance=1000;
	
	//default constructor
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public SavingsAccount(int accountno, float balance, int pin) {
		super();
		this.accountno = accountno;
		this.balance = balance;
		this.pin = pin;
	}

	
    public static int getMinimumBalance()
      {
        return MinimumBalance; 
      }


	public void deposit(int amount) {
		if(amount>0) {
			this.balance = this.balance + amount;
			System.out.println("New balance:" +balance);
		}else {
			System.out.println("Invalid deposit amount");
		}
	}
	
	public void withdraw(int withdrawalAmount) {
		if(withdrawalAmount <= this.balance) {
			this.balance = this.balance - withdrawalAmount;
			System.out.println("Amount withdrawn:" +balance);
		}else {
			System.out.println("u have Insufficient funds");
		}
	}
	
}
