package entidades;

import java.util.ArrayList;
import java.util.List;

public class RH {
	public List<Funcionario> funcs = new ArrayList<Funcionario>();
	
	public void cadastrar(Funcionario f) {
		funcs.add(f);
	}
	
	public void excluir(int mat) {
		funcs.removeIf(f -> (f.matricula==mat));
	}
	
	public void listar() {
		for (int i = 0; i < funcs.size(); i++) {
			System.out.println("Mat: " + funcs.get(i).matricula);
			System.out.println("Nome: " + funcs.get(i).nome);
			System.out.println("Salário: " + funcs.get(i).salario);
			System.out.println();
		}
	}
	
}
