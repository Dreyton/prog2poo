package list.ex1;

public class Employee {
	//private static int qtd = 0;
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		//this.id = ++qtd;
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + ", " + 
	           name + ", " + 
				String.format("%.2f", salary);
	}
	
	
}
