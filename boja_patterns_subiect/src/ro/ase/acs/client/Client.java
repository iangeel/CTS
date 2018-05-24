package ro.ase.acs.client;

import ro.ase.acs.adapter.BankOperationObjectAdapter;
import ro.ase.acs.factory.BankManager;
import ro.ase.acs.model.BankAccount;
import ro.ase.acs.model.ContBancar;

public class Client {

	public static void main(String[] args) {
		
		BankManager bankManager = BankManager.getInstance();
//		
//		try {
//			ContBancar cont1 = bankManager.generareCont("credit", "ContCredit", "Bucuresti", 1);
//			ContBancar cont2 = bankManager.generareCont("debit", "ContDebit", "Tulcea", 2);
//			
//			System.out.println(cont1);
//			cont1.transfer(cont2, 200);
//			cont1.depune(200);
//			
//			System.out.println(cont2);
//			cont2.transfer(cont1, 300);
//			cont2.depune(300);
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			BankAccount contBancar = new BankOperationObjectAdapter(
					bankManager.generareCont("credit", "ContCredit", "Bucuresti", 1));
			contBancar.accountTransfer(contBancar, 50);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
