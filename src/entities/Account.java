package entities;

// number é o numero da conta. holder é o usuário e balance é o saldo

public class Account {

	private int number;
	private String holder;
	private double balance; 
	
	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
		
	}

	public Account(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit (double amount) {
		balance += amount;
	}
	
	
	public void withdraw (double amount) {
		balance -= amount;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+holder
				+ ", Balance: $ "
				+String.format("%.2f", balance);
	}
	
	
	
}
