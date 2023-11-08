package entities;

public class SavingsAccount extends Account{
	private Double interestRate;
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}



	public void updateBalance() {
		//balance = balance + balance * interestRate;
		this.deposit(this.getBalance() + 
				     this.getBalance() * interestRate);
	}
	
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	

}
