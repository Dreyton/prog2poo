import java.util.Locale;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura do terreno: ");
		double largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		double valorMetroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = valorMetroQuadrado * area;
		
		System.out.printf("Area do terreno = %.2f%n", area);
		System.out.printf("Preço do terreno = %.2f%n", preco);

		sc.close();
	}
}
