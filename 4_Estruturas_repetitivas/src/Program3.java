import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de valores a serem lidos: ");
		int n = sc.nextInt();
		int soma = 0;
		int valor;
		
		for(int i = 0; i< n; i++) {
			System.out.print("Digite um valor inteiro: ");
			valor = sc.nextInt();
			soma += valor;
		}

		System.out.println("Soma = " + soma);
		sc.close();
	}
}
