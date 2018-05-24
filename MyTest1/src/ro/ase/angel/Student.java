package ro.ase.angel;

public class Student extends Person {


	private Integer year;
	
	
	public Student(String name, int age,double grossIncome, int year) {
		super(name, age, grossIncome);
		
		this.year = year;
		
	}



	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public double netIncomeCalculator() {
		return this.getGrossIncome() != null ? this.getGrossIncome() : 0;
	}
	
	
	
}
