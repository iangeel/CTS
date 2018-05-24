package ro.ase.acs.factory;

import ro.ase.acs.model.ContBancar;
import ro.ase.acs.model.ContCredit;
import ro.ase.acs.model.ContDebit;

public class BankManager {
	
	private static BankManager instance;
	
	private BankManager() {}
	
	public static BankManager getInstance() {
		
		if(instance == null) {
			instance = new BankManager();
		}
		
		return instance;
	}
	
	private ContBancar creareCont(String tipCont) throws Exception {
		ContBancar result = null;
		
		if(tipCont == null) {
			throw new Exception("Type is null...");
		}
		
		switch(tipCont) {
		case "credit": 
			result = new ContCredit();
			break;
		case "debit":
			result = new ContDebit();
			break;
		default :
			throw new Exception("Unknown document type...");
		}
		
		return result;
		
	}
	
	public ContBancar generareCont(String tip, String denumire, String adresa, Integer nrContor) throws Exception {
		ContBancar result = creareCont(tip);
		
		if(result != null) {
			result.setAdresa(adresa);
			result.setDenumire(denumire);
			result.setContor(nrContor);
		}
		
		return result;
	}
}
