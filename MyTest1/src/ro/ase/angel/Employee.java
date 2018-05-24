package ro.ase.angel;

public class Employee extends Person {


	private String domain;
	
	public Employee(String name, int age,double grossIncome, String domain) {
		super(name, age, grossIncome);
		this.domain = domain;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public double netIncomeCalculator() {
		if(this.domain.equals("IT")) {
			return this.getGrossIncome() != null ? this.getGrossIncome() * (1 - 0.13 - 0.2) : 0;
		}
		else return this.getGrossIncome() != null ? getGrossIncome() * (1 - 0.13 - 0.2 - 0.1) : 0;
	}
	
	
}
