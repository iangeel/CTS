package ro.acs.ase.client;

import ro.acs.ase.factory.FactoryImobil;
import ro.acs.ase.models.Imobil;
import ro.acs.ase.tranzactions.Cumparare;
import ro.acs.ase.tranzactions.Inchiriere;

public class Client {

	public static void main(String[] args) {
		FactoryImobil factory = FactoryImobil.getInstance();
		
		try {
			Imobil apartament = factory.genereazaImobil("apartament", "Bucuresti", 140d, 70000d);
			Imobil casa = factory.genereazaImobil("casa", "Mogosoaia", 500d, 120000d);
			Imobil garsoniera = factory.genereazaImobil("garsoniera", "Constanta", 40d, 40000d);
			
//			factory.vinde(apartament);
//			factory.inchiriaza(garsoniera);
			factory.setStrategy(new Cumparare());
			factory.doTranzaction(apartament);
			
			factory.setStrategy(new Inchiriere());
			factory.doTranzaction(casa);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
