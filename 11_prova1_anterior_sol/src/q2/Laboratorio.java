package q2;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio {
	private int id;
	private String nome;
	private static int cont = 0;
	private List<Paciente> pacientes = new ArrayList<>();

	public Laboratorio() {
		id = ++cont;
	}

	public Laboratorio(String nome) {
		id = ++cont;
		this.nome = nome;
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

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void addPaciente(Paciente p) {
		pacientes.add(p);
	}
	
	public void removePaciente(Paciente p) {
		pacientes.remove(p);
	}

}
