package q1.entities;

public class Restaurante {
	private String nome;
	private Double valorRefeicao;
	private Cidade cidade;

	public Restaurante(String nome, Double valorRefeicao, Cidade cidade) {
		this.nome = nome;
		this.valorRefeicao = valorRefeicao;
		this.cidade = cidade;
	}

	public Restaurante(String nome, Double valorRefeicao) {
		this.nome = nome;
		this.valorRefeicao = valorRefeicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorRefeicao() {
		return valorRefeicao;
	}

	public void setValorRefeicao(Double valorRefeicao) {
		this.valorRefeicao = valorRefeicao;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Restaurante [nome=" + nome + ", valorRefeicao=" + valorRefeicao + ", cidade=" + cidade + "]";
	}

}
