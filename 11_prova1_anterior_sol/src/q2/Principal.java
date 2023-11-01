package q2;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente("A", "Folha 1");
		p1.addExames(new Exame("Glicose", 85));//normal
		p1.addExames(new Exame("Colesterol", 120));//normal
		
		Paciente p2 = new Paciente("B", "Folha 2");
		p2.addExames(new Exame("Glicose", 200));//anormal
		p2.addExames(new Exame("Colesterol", 120));//normal
		
		Paciente p3 = new Paciente("C", "Folha 3");
		p3.addExames(new Exame("Plaquetas", 150000));//normal
		p3.addExames(new Exame("Leucocitos", 2000));//anormal
		
		Paciente p4 = new Paciente("D", "Folha 4");
		p4.addExames(new Exame("Hemoglobina", 15));//normal
		p4.addExames(new Exame("Colesterol", 120));//normal
		
		Laboratorio lab1 = new Laboratorio("Lab Barros Barreto");
		lab1.addPaciente(p1);
		lab1.addPaciente(p2);
		
		Laboratorio lab2 = new Laboratorio("Lab Albert Einstein");
		lab2.addPaciente(p3);
		lab2.addPaciente(p4);
		
		var labs = new ArrayList<Laboratorio>();//apenas para impressao
		labs.add(lab1);
		labs.add(lab1);
		
		for (var lab: labs) {
			System.out.println("Laboratório: " + lab.getNome());
			for (var paciente: lab.getPacientes()) {
				System.out.println("Paciente: " + paciente.getNome());
				System.out.println("Exames normais? " + paciente.examesNormais());
				for (var exame: paciente.getExames()) {
					System.out.println("Exame: " + exame.getTipo());
					System.out.println("Nivel: " + exame.getNivel());
				}
				System.out.println();
			}
			System.out.println("===================================");
		}
		
		
	}

}
