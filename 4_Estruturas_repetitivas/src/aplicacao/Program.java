package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.RH;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int op;
		RH rh = new RH();

		do {
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Excluir");
			System.out.println("4 - Sair");
			System.out.print("Digite uma opção: ");
			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.print("Mat: ");
				int matricula = sc.nextInt();
				sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Salario: ");
				double salario = sc.nextDouble();
				Funcionario f = new Funcionario();
				f.matricula = matricula;
				f.nome = nome;
				f.salario = salario;
				rh.cadastrar(f);
				break;
			case 2:
				rh.listar();
				break;
			case 3:
				System.out.print("Mat: ");
				matricula = sc.nextInt();
				rh.excluir(matricula);;
				break;
			default:
				System.out.println("Saindo ou opção inválida");
			}
		} while (op != 4);

		sc.close();
	}

}
