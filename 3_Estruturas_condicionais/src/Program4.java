import java.util.Locale;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario, novoSalario, aumento, porcentagem;

		System.out.print("Digite o salário da pessoa: ");
		salario = sc.nextDouble();

		if (salario <= 1000.0) {
			porcentagem = 0.2;
			aumento = salario * porcentagem;
			novoSalario = salario + aumento;
		} else if (salario <= 3000) {
			porcentagem = 0.15;
			aumento = salario * porcentagem;
			novoSalario = salario + aumento;
		} else if (salario <= 8000) {
			porcentagem = 0.1;
			aumento = salario * porcentagem;
			novoSalario = salario + aumento;

		} else {
			porcentagem = 0.05;
			aumento = salario * porcentagem;
			novoSalario = salario + aumento;
		}

		System.out.printf("Novo salário = R$ %.2f%n", novoSalario);
		System.out.printf("Aumento = R$ %.2f%n", aumento);
		System.out.printf("Porcentagem = %d %%\n", (int) (porcentagem*100));
		
		sc.close();

	}

}
