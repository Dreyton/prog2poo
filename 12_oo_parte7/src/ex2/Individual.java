package ex2;

public class Individual extends TaxPayer {

	private Double healthExpendintures;

	public Individual() {

	}

	public Individual(String name, Double annualIncome, Double healthExpendintures) {
		super(name, annualIncome);
		this.healthExpendintures = healthExpendintures;
	}

	@Override
	public Double tax() {
		if(getAnnualIncome() <= 20000.0) 
				return getAnnualIncome() * 0.15 - (healthExpendintures * 0.5);
		else
				return getAnnualIncome() * 0.25 - (healthExpendintures * 0.5);
	}

	public Double getHealthExpendintures() {
		return healthExpendintures;
	}

	public void setHealthExpendintures(Double healthExpendintures) {
		this.healthExpendintures = healthExpendintures;
	}

	@Override
	public String toString() {
		return "Individual [healthExpendintures=" + healthExpendintures + ", " + super.toString() + "]";
	}

}
