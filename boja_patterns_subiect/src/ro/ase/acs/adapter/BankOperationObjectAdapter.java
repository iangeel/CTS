package ro.ase.acs.adapter;

import ro.ase.acs.model.BankAccount;
import ro.ase.acs.model.ContBancar;

public class BankOperationObjectAdapter implements BankAccount {
	
	ContBancar contBancar;
	
	public BankOperationObjectAdapter(ContBancar contBancar) {
		this.contBancar = contBancar;
	}

	@Override
	public void accountTransfer(BankAccount account, double amount) {
		System.out.println("Se transfera din contul curent...");
		
	}
	
	
}
