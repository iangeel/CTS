package ro.ase.angel.calculator;

import ro.ase.angel.exceptions.PersonException;

public interface NetIncomeCalculatorInterface {
	
	double calculateNetIncomeById(int id) throws PersonException;
	double calculateTotalNetIncome() throws PersonException;
}
