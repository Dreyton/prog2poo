package ex.application;

import java.util.Locale;
import java.util.Scanner;

import ex.entities.Product;

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
		
		Product p = new Product(name, price, quantity);
		
		System.out.println(p);
		
		System.out.print("Enter the number of products to be added in stock: ");
		int addQt = sc.nextInt();
		p.addProducts(addQt);
		
		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: % .2f%n%n",
		          p.getName(), p.getPrice(), p.getQuantity(), p.totalValueInStock());
		
		System.out.print("Enter the number of products to be removed in stock: ");
		int removeQt = sc.nextInt();
		p.removeProducts(removeQt);
		
		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: % .2f%n%n",
				p.getName(), p.getPrice(), p.getQuantity(), p.totalValueInStock());

		sc.close();
	}

	
	
	
	
	
	
	
	
	
}
