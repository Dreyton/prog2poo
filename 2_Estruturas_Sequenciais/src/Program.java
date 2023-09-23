import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		double y;
		String name;
		
		x = sc.nextInt(); 
		sc.nextLine();//limpa buffer
		y = sc.nextDouble();
		name = sc.nextLine();
		
		System.out.printf("%d, %.2f, %s", x, y, name);
		
		sc.close();		
	}
}
