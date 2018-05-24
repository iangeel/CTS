package ro.ase.angel.calculator;


import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ro.ase.angel.Employee;
import ro.ase.angel.Person;
import ro.ase.angel.Student;
import ro.ase.angel.exceptions.PersonException;

public class TestNetIncomeCalculator {

	NetIncomeCalculator netIncomeCalculator;
	
	@Before
	public void init() {
		HashMap<Integer, Person> persons = new HashMap<>();
		
		persons.put(1, new Employee("Employee", 25, 5000d, "IT"));
		persons.put(2, new Student("Student", 20, 700d, 2));
	
		netIncomeCalculator = new NetIncomeCalculator(persons);
	}
	
//	@Test
//	public void calculateTotalNetIncomeBoundaryTest() {
//		
//	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void calculateTotalNetIncomeResultTest() throws PersonException {
		Assert.assertEquals(4050d, netIncomeCalculator.calculateTotalNetIncome(),0);
	}
	

}
