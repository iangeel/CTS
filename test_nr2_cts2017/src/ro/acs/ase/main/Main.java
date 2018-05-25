package ro.acs.ase.main;

import java.util.Date;


import ro.acs.ase.builder.DomeniuBuilder;
import ro.acs.ase.models.Domeniu;
import ro.acs.ase.observer.Observable;
import ro.acs.ase.singleton.Registru;

public class Main {

	public static void main(String[] args) {
	
		Observable ase = new DomeniuBuilder(1, "ase.ro", 10, new Date()).setHost("ASE").build();
		Observable dom = new DomeniuBuilder(2, "dom", 20, new Date()).build();

		Registru registru = Registru.getInstance();
		
		try {
			registru.inregistreazaDomeniu((Domeniu) ase);
			registru.inregistreazaDomeniu((Domeniu) dom);
			
			registru.vizualizareDomeniu(1);
			registru.vizualizareDomeniu(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		ase.addObservertor(registru);
		dom.addObservertor(registru);
		
		((Domeniu) ase).setNameserver("www.ase.ro");
	}

}
