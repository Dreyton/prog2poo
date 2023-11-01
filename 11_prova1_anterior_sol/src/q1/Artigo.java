package q1;

public class Artigo {
	private int id;
	private String titulo;
	private String descricao;
	private static int cont = 0;
	private Bolsista bolsista;

	public Artigo() {
		id = ++cont;
	}

	public Artigo(String titulo, String descricao, Bolsista bolsista) {
		id = ++cont;
		this.titulo = titulo;
		this.descricao = descricao;
		this.bolsista = bolsista;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Bolsista getBolsista() {
		return bolsista;
	}

	public void setBolsista(Bolsista bolsista) {
		this.bolsista = bolsista;
	}

}
