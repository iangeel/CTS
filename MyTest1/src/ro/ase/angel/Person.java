package ro.ase.angel;

public class Person {
	
	private String name;
	private Integer age;
	private Double grossIncome;
	
	public Person(String name, int age, double grossIncome) {
		this.name = name;
		this.age = age;
		this.grossIncome = grossIncome;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getGrossIncome() {
		return grossIncome;
	}

	public void setGrossIncome(Double grossIncome) {
		this.grossIncome = grossIncome;
	}
	
	public double netIncomeCalculator() {
		return this.grossIncome != null ? grossIncome * (1 - 0.13 - 0.2 - 0.1) : 0;
	}
	
}
