import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dia = "";
		
		System.out.print("Digite o dia da semana (1-7): ");
		int valor = sc.nextInt();
		
		switch (valor) {
		case 1:
			dia = "dom";
			break;
		case 2:
			dia = "seg";
			break;
		case 3:
			dia = "ter";
			break;
		case 4:
			dia = "qua";
			break;
		case 5:
			dia = "qui";
			break;
		case 6:
			dia = "sex";
			break;
		case 7:
			dia = "sab";
			break;
		default:
			dia = "valor inválido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		
		sc.close();
	}

}
