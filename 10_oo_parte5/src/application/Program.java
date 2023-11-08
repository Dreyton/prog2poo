package application;

import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(31234, "Alex", 3000.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount();
		Account acc3 = new SavingsAccount();
		
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2;
	}
	
	public static void payTaxes(List<Account> accounts) {
		//business -10.0
		//savings -15.0
		for (Account account : accounts) {
			if(account instanceof BusinessAccount) {
				BusinessAccount ba = (BusinessAccount) account;
				ba.withdraw(10.0);
				ba.loan(0);
			}
			if(account instanceof SavingsAccount) {
				SavingsAccount ba = (SavingsAccount) account;
				ba.withdraw(15.0);
				ba.updateBalance();
			}
			if(account instanceof Account) {
				account.withdraw(10.0);
			}
		}
		
	}
	
	public static double totalBalance(List<Account> accounts) {
		double total = 0;
		for (Account account : accounts) {
			total += account.getBalance();
		}
		return total;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
