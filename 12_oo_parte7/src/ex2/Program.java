package ex2;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<TaxPayer> payers = new ArrayList<>();
		payers.add(new Individual("Alex", 50000.0, 2000.0));
		payers.add(new Company("SoftTech", 400000.0, 25));
		payers.add(new Individual("Bob", 120000.0, 1000.0));
		
		for (TaxPayer taxPayer : payers) {
			System.out.println(taxPayer);
		}
		System.out.println("Total: " + totalTax(payers));
	}
	
	public static double totalTax(List<TaxPayer> payers) {
		double total = 0.0;
		for (TaxPayer taxPayer : payers) {
			total += taxPayer.tax();
		}
		return total;
	}

}
