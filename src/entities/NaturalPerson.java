package entities;

public class NaturalPerson extends Person {

	private Double healthCareSpending = 0.0d;
	
	public NaturalPerson() {
	}
	
	public NaturalPerson(String name, Double annualIncome, Double healthCareSpending) {
		super(name, annualIncome);
		this.healthCareSpending = healthCareSpending;
	}

	public Double getHealthCareSpending() {
		return healthCareSpending;
	}

	public void setHealthCareSpending(Double healthCareSpending) {
		this.healthCareSpending = healthCareSpending;
	}

	@Override
	public Double incomeTax() {
		//Rule: annual income less than 20.000, the tax is going to be 15% of the annual income
		//      annual income equal or greater 20.000, the tax is going to be 25% of the annual income
		//      if it had health care spending, deduced 50% of this value of the final tax. 
		Double halfHealthCareSpending = 0.0d;
		if (healthCareSpending > 0) {
			halfHealthCareSpending = healthCareSpending / 2;
		}
		if (annualIncome < 20000.00) {
			return (annualIncome * 0.15) - halfHealthCareSpending;
		}else {
			return (annualIncome * 0.25) - halfHealthCareSpending;
		}
	}
}