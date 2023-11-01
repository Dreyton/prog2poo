package q1;

public class Bolsista {
	private int matricula;
	private String nome;
	private int semestre;
	private double CRG;
	private static int id = 0;

	public Bolsista() {
		matricula = ++id;
	}

	public Bolsista(String nome, int semestre, double cRG) {
		matricula = ++id;
		this.nome = nome;
		this.semestre = semestre;
		CRG = cRG;
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

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public double getCRG() {
		return CRG;
	}

	public void setCRG(double cRG) {
		CRG = cRG;
	}

}
