package ex3.entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		//grossSalary = grossSalary + grossSalary * percentage;
		grossSalary*=(1 + percentage);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Funcionário: %s, $ %.2f", 
				name, netSalary());
	}
	
}