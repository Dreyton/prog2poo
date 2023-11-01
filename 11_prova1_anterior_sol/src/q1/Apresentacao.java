package q1;

public class Apresentacao {
	private int id;
	private String local;
	private String horario;
	private double nota;
	private BancaAvaliadora banca;
	private Professor orientador;
	private Bolsista bolsista;
	private Artigo artigo;
	static int cont = 0;

	public Apresentacao() {
		id = ++cont;
	}

	public Apresentacao(String local, String horario, double nota, BancaAvaliadora banca, Professor orientador,
			Bolsista bolsista) {
		id = ++cont;
		this.local = local;
		this.horario = horario;
		this.nota = nota;
		this.banca = banca;
		this.orientador = orientador;
		this.bolsista = bolsista;
	}

	public int getId() {
		return id;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Artigo getArtigo() {
		return artigo;
	}

	public void setArtigo(Artigo artigo) {
		this.artigo = artigo;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public BancaAvaliadora getBanca() {
		return banca;
	}

	public void setBanca(BancaAvaliadora banca) {
		this.banca = banca;
	}

	public Professor getOrientador() {
		return orientador;
	}

	public void setOrientador(Professor orientador) {
		this.orientador = orientador;
	}

	public Bolsista getBolsista() {
		return bolsista;
	}

	public void setBolsista(Bolsista bolsista) {
		this.bolsista = bolsista;
	}

	public boolean foiAprovado() {
		return nota >= 8;
	}

}
