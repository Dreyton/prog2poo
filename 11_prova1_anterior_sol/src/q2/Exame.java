package q2;

public class Exame {
	private int id;
	private String tipo;
	private double nivel;
	private static int cont = 0;

	public Exame() {
		id = ++cont;
	}

	public Exame(String tipo, double nivel) {
		id = ++cont;
		this.tipo = tipo;
		this.nivel = nivel;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getNivel() {
		return nivel;
	}

	public void setNivel(double nivel) {
		this.nivel = nivel;
	}

	public int getId() {
		return id;
	}

}
