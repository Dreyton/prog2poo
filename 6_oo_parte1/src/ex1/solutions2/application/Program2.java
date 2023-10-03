package ex1.solutions2.application;

import java.util.Locale;
import java.util.Scanner;

import ex1.solution2.entities.Triangle;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x = new Triangle();

		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		double areaX = x.area();

		Triangle y = new Triangle();

		System.out.println("Enter the measures of triangle X: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		sc.close();

	}
}
