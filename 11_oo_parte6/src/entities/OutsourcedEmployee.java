package entities;

public class OutsourcedEmployee extends Employee{
	private Double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	//GERAR CONSTRUTOR COMPLETO
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	//METODO payment()
	
	@Override
	public Double payment() {
		// TODO Auto-generated method stub
		return super.payment() + 1.1 * additionalCharge;
	}
	
//GERAR TOSTRING
	@Override
	public String toString() {
		return "OutsourcedEmployee [additionalCharge=" + additionalCharge + 
				", toString()=" + super.toString() + "]";
	}
	
	@Override
	public void setName(String name) {
		super.setName(name + "\n\n");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
