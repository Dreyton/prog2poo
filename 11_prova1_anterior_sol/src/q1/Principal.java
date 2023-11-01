package q1;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Bolsista b1 = new Bolsista("Astrogildo", 4, 9.2);
		Bolsista b2 = new Bolsista("Nena", 5, 9.87);
		Bolsista b3 = new Bolsista("Bob", 6, 8.86);

		Professor orientador = new Professor("Jão", "Formado em SI");
		orientador.addBolsista(b1);
		orientador.addBolsista(b2);
		orientador.addBolsista(b3);

		Artigo a1 = new Artigo("Kernel PCA", "In this paper, it is proposed a novel method...", b1);
		Artigo a2 = new Artigo("Gaussian Mixture Models", "A probability model is designed in this work...", b2);
		Artigo a3 = new Artigo("Neural networks", "A weighted technique is investigated in this study...", b3);

		BancaAvaliadora ba1 = new BancaAvaliadora("Engenharias e Computação");
		ba1.addProfessor(new Professor("Manoel", "Formado em EE, atua...."));
		ba1.addProfessor(new Professor("Claudio", "Formado em EC, atua..."));

		BancaAvaliadora ba2 = new BancaAvaliadora("Engenharias e Computação");
		ba2.addProfessor(new Professor("Nadson", "Formado em EE, atua...."));
		ba2.addProfessor(new Professor("Elton", "Formado em EC, atua..."));

		BancaAvaliadora ba3 = new BancaAvaliadora("Engenharias e Computação");
		ba3.addProfessor(new Professor("Fran", "Formada em Física, atua...."));
		ba3.addProfessor(new Professor("Aline", "Formada em Telecom, atua..."));

		Apresentacao ap1 = new Apresentacao("Tauri", "15:30", 6.5, ba1, orientador, b1);
		Apresentacao ap2 = new Apresentacao("Castanheiras", "10:30", 9.5, ba2, orientador, b2);
		Apresentacao ap3 = new Apresentacao("Ipê", "14:20", 8.5, ba3, orientador, b3);
		ap1.setArtigo(a1);
		ap2.setArtigo(a2);
		ap3.setArtigo(a3);

		List<Apresentacao> aps = new ArrayList<>();// apenas para impressao
		aps.add(ap1);
		aps.add(ap2);
		aps.add(ap3);
		
		for (Apresentacao ap : aps) {
			System.out.println("Apresentação - ID: " + ap.getId());
			System.out.println("Título: " + ap.getArtigo().getTitulo());
			System.out.println("Local: " + ap.getLocal());
			System.out.println("Horário: " + ap.getHorario());
			System.out.println("Bolsista: " + ap.getBolsista().getNome());
			System.out.println("Orientador: " + ap.getOrientador().getNome());
			System.out.println("Nota da apresentação: " + ap.getNota());
			System.out.println("Aprovado? " + ap.foiAprovado());

			for (Professor membroBanca : ap.getBanca().getProfessores())
				System.out.println("Banca: " + membroBanca.getNome());
			
			System.out.println("=====================================");
		}
	}

}
