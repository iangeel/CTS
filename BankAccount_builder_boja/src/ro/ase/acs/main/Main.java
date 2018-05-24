package ro.ase.acs.main;

import ro.ase.acs.model.Address;
import ro.ase.acs.model.BankAccount;
import ro.ase.acs.model.BankAccount.BankAccountBuilder;
import ro.ase.acs.model.PersonalInformation;

public class Main {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount.BankAccountBuilder(111,"PID1").addBalance(10000)
				.addPersonalInfo(new PersonalInformation.PersonalInformationBuilder("Angel", "Ivana")
						.addAdress(new Address.AddressBuilder()
								.addCity("Tulcea").addStreet("Babadag").build()).build()).build();
		
		System.out.println(bankAccount);

	}

}
