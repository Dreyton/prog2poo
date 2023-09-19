import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//Locale.setDefault(Locale.forLanguageTag("pt-br"));
		int idade;
		double altura;
		String nome;
		char sexo;
		
		//Colocar valores e imprimi-los
		idade = 33;
		altura = 1.65;
		nome = "Bob";
		sexo = 'M';
		
		System.out.printf("Nome: %s, Idade: %d, "
				+ "Altura: %.3f, Sexo: %c%n", 
				nome, idade, altura, sexo);
		
		System.out.println("Nome: " + nome + 
				", Idade: " + idade + 
				", Altura: " + altura + 
				", Sexo: " + sexo);	
	}
}

