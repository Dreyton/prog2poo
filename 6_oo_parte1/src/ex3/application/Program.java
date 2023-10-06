package ex3.application;

import java.util.Locale;
import java.util.Scanner;

import ex3.entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Salário bruto: ");
		double salary = sc.nextDouble();
		System.out.print("Imposto: ");
		double tax = sc.nextDouble();
		
		Employee e = new Employee();
		e.name = name;
		e.grossSalary = salary;
		e.tax = tax;
		
		System.out.println(e);
		System.out.print("Qual a porcentagem para aumentar o salário? ");
		double percentage = sc.nextDouble();
		e.increaseSalary(percentage);
		System.out.println(e);
		
		sc.close();
	}

}
