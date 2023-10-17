package vectors.ex1;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type the number of heights: ");
		int n = sc.nextInt();
		
		var vect = new double[n];
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Type the height #" + (i+1) +": ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double avg = sum / n;
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		sc.close();
	}
}
