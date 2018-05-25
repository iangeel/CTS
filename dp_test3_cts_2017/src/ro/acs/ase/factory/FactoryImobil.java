package ro.acs.ase.factory;

import ro.acs.ase.models.AgentieImobiliara;
import ro.acs.ase.models.Apartament;
import ro.acs.ase.models.Casa;
import ro.acs.ase.models.Garsoniera;
import ro.acs.ase.models.Imobil;
import ro.acs.ase.tranzactions.TranzactionStrategy;

public class FactoryImobil implements AgentieImobiliara {
	
	private static FactoryImobil instance;
	private TranzactionStrategy strategy;
	
	private FactoryImobil() {}
	
	public static FactoryImobil getInstance() {
		if(instance == null) {
			instance = new FactoryImobil();
		}
		return instance;
	}
	
	
	public Imobil genereazaImobil(String tipImobil, String a, Double s, Double p) throws Exception {
		Imobil imobil = null;
		
		switch(tipImobil) {
		case "apartament": 
			imobil = new Apartament(a, s, p);
			break;
		case "garsoniera":
			imobil = new Garsoniera(a, s, p);
			break;
		case "casa":
			imobil = new Casa(a, s, p);
			break;
		default: throw new Exception("Tipul nu exista...");
		}
		
		return imobil;
	}
	
	public void setStrategy(TranzactionStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void doTranzaction(Imobil imobil) {
		strategy.doTranzaction(imobil);
	}

	@Override
	public void vinde(Imobil imobil) {
		System.out.println("Imobil vandut la pretul de " + imobil.getPret());
		
	}

	@Override
	public void inchiriaza(Imobil imobil) {
		System.out.println("Imobil inchiriat la pretul de " + imobil.getPret());
		
	}
}
