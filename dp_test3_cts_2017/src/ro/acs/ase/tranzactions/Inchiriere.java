package ro.acs.ase.tranzactions;

import ro.acs.ase.models.Imobil;

public class Inchiriere implements TranzactionStrategy {

	@Override
	public void doTranzaction(Imobil imobil) {
		System.out.println("Imobilul a fost inchiriat...");
		
	}
	
}
