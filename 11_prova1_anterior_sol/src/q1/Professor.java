package q1;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	private int matricula;
	private String nome;
	private String descCV;
	private static int id = 0;
	private List<Bolsista> bolsistas = new ArrayList<>();

	public Professor() {
		matricula = ++id;
	}

	public Professor(String nome, String descCV) {
		matricula = ++id;
		this.nome = nome;
		this.descCV = descCV;
	}


	public List<Bolsista> getBolsistas() {
		return bolsistas;
	}

	public void addBolsista(Bolsista b) {
		bolsistas.add(b);
	}
	
	public void removeBolsista(Bolsista b) {
		bolsistas.remove(b);
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescCV() {
		return descCV;
	}

	public void setDescCV(String descCV) {
		this.descCV = descCV;
	}

}
