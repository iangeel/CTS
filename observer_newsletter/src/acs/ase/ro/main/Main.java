package acs.ase.ro.main;

import acs.ase.ro.models.Bank;
import acs.ase.ro.models.Newsletter;
import acs.ase.ro.models.Observabil;
import acs.ase.ro.models.Observer;
import acs.ase.ro.models.Person;

public class Main {

	public static void main(String[] args) {
		Observer person = new Person("Gigel");
		Observer bank = new Bank("BCR");
		
		Newsletter observabils = new Newsletter("Palm Beach News");
		observabils.subscribe(person);
		observabils.subscribe(bank);
		
		observabils.unsubscribe(person);
		observabils.hasArrived();
	}

}
