package ex1.entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		//balance -= amount + 5.0;
		if(amount + 5.0 <= balance) {
			balance = balance - amount - 5.0;
			return;
		}
		System.out.println("Your balance is very low.");
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

	@Override
	public String toString() {
		//Account 8532, Holder: Alex Green, Balance: $ 500.00
		return "Account " + number + ", Holder: " + holder +
				", Balance: $ " + String.format("%.2f", balance);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
