package ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		String[] words = sc.nextLine().split(" ");
		Integer position = sc.nextInt();
		
		System.out.println(words[position]);
		}
		catch(InputMismatchException e) {
			System.out.println("Type a number!");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Type a number in array bounds!");
		}
		sc.close();

	}

}
