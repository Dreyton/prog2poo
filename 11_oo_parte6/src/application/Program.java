package application;

import java.util.ArrayList;
import java.util.List;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Maria", 10, 20.0));
		employees.add(new Employee("Alex", 12, 30.0));
		employees.add(new OutsourcedEmployee("João", 10, 20.0, 15.0));
		employees.add(new OutsourcedEmployee("Joana", 13, 30.0, 15.0));
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		System.out.println("Total payment: " + totalPayment(employees));
		/*
		 *CRIAR INSTANCIAS DE EMPREGADOS (2 TIPOS) 
		 *E CRIAR METODOS QUE: (1) O TOTAL DE PAGAMENTO
		 *DE TODOS OS EMPREGADOS; (2) AUMENTE O VALOR POR
		 *HORA DOS EMPREGADOS 10 PARA Employee E 20 PARA
		 *OutSourcedEmployee*/
		plusValuePerHours(employees);//alterou valuePerHOour
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	public static double totalPayment(List<Employee> employees) {
		double total = 0.0;
		for (Employee employee : employees) {
			total += employee.payment();
		}
		return total;
	}
	public static void plusValuePerHours(List<Employee> employees) {
		
		for (Employee employee : employees) {
			if(employee instanceof OutsourcedEmployee)
				employee.setValuePerHour(employee.getValuePerHour() + 20);
			else
				employee.setValuePerHour(employee.getValuePerHour() + 10);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}






