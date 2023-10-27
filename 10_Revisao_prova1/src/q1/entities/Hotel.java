package q1.entities;

public class Hotel {
	private String nome;
	private Double valorDiaria;
	private Cidade cidade;

	public Hotel(String nome, Double valorDiaria, Cidade cidade) {
		this.nome = nome;
		this.valorDiaria = valorDiaria;
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(Double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Hotel [nome=" + nome + ", valorDiaria=" + valorDiaria + ", cidade=" + cidade + "]";
	}

}
