package entities;

public class Account extends Object{
	private Integer number;
	private String holder;
	private Double balance;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public void withdraw(double value) {
		this.balance -= value;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		if(number <= 1000)
			this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + "]";
	}
	
	
}
