package q2;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
	private int id;
	private String nome;
	private String endereco;
	private static int cont = 0;
	private List<Exame> exames = new ArrayList<>();

	public Paciente() {
		id = ++cont;
	}

	public Paciente(String nome, String endereco) {
		id = ++cont;
		this.nome = nome;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Exame> getExames() {
		return exames;
	}

	public void addExames(Exame e) {
		exames.add(e);
	}
	
	public void removeExames(Exame e) {
		exames.remove(e);
	}

	public boolean examesNormais() {
		/*
		 * 1 - Glicose (entre 70 a 99 mg/dL); 
		 * 2 - Colesterol total (menor que 190 mg/dL); 
		 * 3 - Leucócitos (entre 3500 a 10000/mm 3 ); 
		 * 4 - Plaquetas (entre 140000 a 550000/mm 3 ); 
		 * 5 - Hemoglobina (entre 13 a 18 g/dL)
		 */		
		boolean continua = false;

		for (Exame exame: exames) {
			if (exame.getTipo().compareTo("Glicose") == 0 
					&& exame.getNivel() >= 70
					&& exame.getNivel() <= 99) {
				continua = true;
			} else if (exame.getTipo().compareTo("Colesterol") == 0 					
					&& exame.getNivel() < 190) {
				continua = true;
			} else if (exame.getTipo().compareTo("Leucocitos") == 0 
					&& exame.getNivel() >= 3500
					&& exame.getNivel() <= 10000) {
				continua = true;
			} else if (exame.getTipo().compareTo("Plaquetas") == 0 
					&& exame.getNivel() >= 140000
					&& exame.getNivel() <= 550000) {
				continua = true;
			} else if (exame.getTipo().compareTo("Hemoglobina") == 0 
					&& exame.getNivel() >= 13
					&& exame.getNivel() <= 18) {
				continua = true;
			} else {
				return false;
			}
		}

		return continua;
	}

}
