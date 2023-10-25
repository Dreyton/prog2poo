package ex1.entities;

import java.util.ArrayList;
import java.util.List;

public class Worker {
	private String name;
	//outros atributos aqui
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker(String name, Department department) {
		this.name = name;
		this.department = department;
	}
	
	public void addContract(HourContract hc) {
		contracts.add(hc);
	}

	public void removeContract(HourContract hc) {
		contracts.remove(hc);
	}

}
