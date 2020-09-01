package entities;

public abstract class Person {

	protected String name = null;
	protected Double annualIncome = 0.0d;

	public Person() {
	}

	public Person(String name, Double anualIncome) {
		this.name = name;
		this.annualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return annualIncome;
	}

	public void setAnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public abstract Double incomeTax();
}
