package ro.ase.cts_boja;

import ro.ase.exception.OperationsException;
import ro.ase.interfaces.PersonInterface;

public class BankAccount {
	double balance;
	double limit;
	double lowestBalance;
	PersonInterface personIntefaceService;
	
	public BankAccount(double b, double l, double lb){
		balance=b;
		limit=l;
		lowestBalance=lb;
	}
	
	public BankAccount(double b, double l, double lb, PersonInterface pi) {
		balance=b;
		limit=l;
		lowestBalance=lb;
		personIntefaceService = pi;
	}
	
	public boolean checkAge(int age) {
		return personIntefaceService.valitateAge(age) >= 0;
	}
	
	
	//Retrage bani
	public void withdraw(double amount) throws OperationsException {
		if(amount > this.getBalance() || amount > this.limit) {
			throw new OperationsException("Amount must be less than balance or withdraw limit...");
		}
		if(amount <= 0 || Double.isNaN(amount)) {
			throw new OperationsException("Withdraw a positive value...");
		}
		if((balance - amount) < this.lowestBalance) {
			throw new OperationsException("Balance too low...");
		}
			balance=balance-amount;
	}
	
	//Depozit
	public void deposit(double amount){
		balance=balance+amount;
	}
	
	//Get the value of balance
	public double getBalance(){
		return balance;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	public double getLowestBalance() {
		return lowestBalance;
	}

	public void setLowestBalance(double lowestBalance) {
		this.lowestBalance = lowestBalance;
	}
	
	
}
