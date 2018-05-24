package ro.ase.angel.calculator;

import java.util.HashMap;

import ro.ase.angel.Person;
import ro.ase.angel.exceptions.PersonException;

public class NetIncomeCalculator implements NetIncomeCalculatorInterface {

	private HashMap<Integer, Person> persons;
	
	public NetIncomeCalculator(HashMap<Integer, Person> persons) {
		this.persons = persons;
	}

	@Override
	public double calculateNetIncomeById(int id) throws PersonException {
		if(this.persons == null || id == 0 || this.persons.size() == 0) {
			throw new PersonException("Person id not found...");
		}
		
		return persons.containsKey(id) ? persons.get(id).netIncomeCalculator() : 0;
	}

	@Override
	public double calculateTotalNetIncome() throws PersonException {
		if (this.persons == null || persons.size() == 0) {
			throw new PersonException("Person not found...");
		} 
		
		double sum = 0;
		
		for (Person person : persons.values()) {
			sum += person.netIncomeCalculator();
		}
		
		
		return sum;
	}
	
	
	
}
