package ex2.application;

import java.util.Locale;
import java.util.Scanner;

import ex2.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product p = new Product();
		p.name = name;
		p.price = price;
		p.quantity = quantity;
		
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: % .2f%n%n",
				          p.name, p.price, p.quantity, p.totalValueInStock());
		System.out.print("Enter the number of products to be added in stock: ");
		int addQt = sc.nextInt();
		p.addProducts(addQt);

		sc.close();
	}

}
