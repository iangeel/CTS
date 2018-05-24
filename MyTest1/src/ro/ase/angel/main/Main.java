package ro.ase.angel.main;

import java.util.HashMap;


import ro.ase.angel.Employee;
import ro.ase.angel.Person;
import ro.ase.angel.Student;
import ro.ase.angel.calculator.NetIncomeCalculator;
import ro.ase.angel.exceptions.PersonException;

public class Main {

	public static void main(String[] args) {
		Employee itEmployee = new Employee("Gigel", 25, 4000, "IT");
		Employee simpleEmployee = new Employee("Mirel", 30, 3600, "media");
		Student scholarshipStudent = new Student("Popescu", 20, 700, 2);
		Student simpleStudent = new Student("Ionescu", 21, 0, 3);
		
//		System.out.println("IT Net income: " + itEmployee.netIncomeCalculator());
//		System.out.println("Simple Net income: " + simpleEmployee.netIncomeCalculator());
		
		HashMap<Integer, Person> persons = new HashMap<>();
		persons.put(1, itEmployee);
		persons.put(2, simpleEmployee);
		persons.put(3, scholarshipStudent);
		persons.put(4, simpleStudent);
		NetIncomeCalculator netIncomeCalculator = new NetIncomeCalculator(persons);
		
		try {
			System.out.println(netIncomeCalculator.calculateNetIncomeById(1));
			System.out.println(netIncomeCalculator.calculateNetIncomeById(2));
			System.out.println(netIncomeCalculator.calculateTotalNetIncome());
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
