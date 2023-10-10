package ex1.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int number = sc.nextInt(); sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		String resp = sc.next();
		
		double value;
		if(resp.equalsIgnoreCase("y")) {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
		}
		
		System.out.println("Account data: ");
		//System.out.printf("Account %d, Holder, %s, Balance: $ %.2f%n%n", , ,);
		
		System.out.print("Enter a deposit value: ");
		value = sc.nextDouble();
		
		System.out.println("Updated ccount data: ");
		//System.out.printf("Account %d, Holder, %s, Balance: $ %.2f%n%n", , ,);
		
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		
		System.out.println("Updated ccount data: ");
		//System.out.printf("Account %d, Holder, %s, Balance: $ %.2f%n%n", , ,);
		
	}

}
