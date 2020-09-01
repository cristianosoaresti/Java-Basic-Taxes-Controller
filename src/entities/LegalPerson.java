package entities;

public class LegalPerson extends Person {

	private Integer employeeNumber = 0;

	public LegalPerson() {
	}

	public LegalPerson(String name, Double annualIncome, Integer employeeNumber) {
		super(name, annualIncome);
		this.employeeNumber = employeeNumber;
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public Double incomeTax() {
		if (employeeNumber > 10) {
			return annualIncome * 0.14;
		} else {
			return annualIncome * 0.16;
		}
	}
}
