import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		somaNumeros();
	}

	public static void somaNumeros() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor inteiro: ");
		int n = sc.nextInt();
		int soma = n;

		while (n != 0) {
			System.out.print("Digite um valor inteiro: ");
			n = sc.nextInt();
			soma += n;
		}

		System.out.println("Soma = " + soma);
		sc.close();
	}
}
