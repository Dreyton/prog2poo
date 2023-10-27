package q1.entities;

public class Cidade {
	private String nome;
	private String website;
	private String estado;

	public Cidade(String nome, String website, String estado) {
		this.nome = nome;
		this.website = website;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cidade [nome=" + nome + ", website=" + website + ", estado=" + estado + "]";
	}

}
