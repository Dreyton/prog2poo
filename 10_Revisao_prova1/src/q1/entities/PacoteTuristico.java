package q1.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PacoteTuristico {
	private String descricao;
	private LocalDateTime dataViagem;
	private Integer diasPermanencia;
	private Integer refeicoesPorDia;
	private Cidade cidade;
	private Restaurante restaurante;
	private List<Hotel> hoteis = new ArrayList<>();

	public PacoteTuristico(String descricao, LocalDateTime dataViagem, Integer diasPermanencia, Integer refeicoesPorDia,
			Cidade cidade, Restaurante restaurante) {
		this.descricao = descricao;
		this.dataViagem = dataViagem;
		this.diasPermanencia = diasPermanencia;
		this.refeicoesPorDia = refeicoesPorDia;
		this.cidade = cidade;
		this.restaurante = restaurante;
	}

	public PacoteTuristico(String descricao, LocalDateTime dataViagem, Integer diasPermanencia, Integer refeicoesPorDia,
			Cidade cidade) {
		this.descricao = descricao;
		this.dataViagem = dataViagem;
		this.diasPermanencia = diasPermanencia;
		this.refeicoesPorDia = refeicoesPorDia;
		this.cidade = cidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataViagem() {
		return dataViagem;
	}

	public void setDataViagem(LocalDateTime dataViagem) {
		this.dataViagem = dataViagem;
	}

	public Integer getDiasPermanencia() {
		return diasPermanencia;
	}

	public void setDiasPermanencia(Integer diasPermanencia) {
		this.diasPermanencia = diasPermanencia;
	}

	public Integer getRefeicoesPorDia() {
		return refeicoesPorDia;
	}

	public void setRefeicoesPorDia(Integer refeicoesPorDia) {
		this.refeicoesPorDia = refeicoesPorDia;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	public List<Hotel> getHoteis() {
		return hoteis;
	}

	public void addHotel(Hotel h) {
		hoteis.add(h);
	}

	public void removeHotel(Hotel h) {
		hoteis.remove(h);
	}

	@Override
	public String toString() {
		return "PacoteTuristico [descricao=" + descricao + ", dataViagem=" + dataViagem + ", diasPermanencia="
				+ diasPermanencia + ", refeicoesPorDia=" + refeicoesPorDia + ", cidade=" + cidade + ", restaurante="
				+ restaurante + ", hoteis=" + hoteis + "]";
	}

}
