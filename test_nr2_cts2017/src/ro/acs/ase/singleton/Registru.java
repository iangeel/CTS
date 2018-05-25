package ro.acs.ase.singleton;

import java.util.HashMap;
import java.util.Map;

import ro.acs.ase.models.Domeniu;
import ro.acs.ase.observer.Observable;
import ro.acs.ase.observer.Observer;

public class Registru implements Observer {

	private static Registru instance;
	private static Map<Integer, Domeniu> listaDomenii = new HashMap<>();
	
	private Registru() {}
	
	public static Registru getInstance() {
		if (instance == null) {
			instance = new Registru();
		}
		
		return instance;
	}
	
	public void inregistreazaDomeniu(Domeniu domeniu) throws Exception {
		if(listaDomenii.containsKey(domeniu.getId())) {
			throw new Exception("Domeniu existent!");
		}
		else {
			listaDomenii.put(domeniu.getId(), domeniu);
		}
	}
	
	public void vizualizareDomeniu(Integer idDomeniu) throws Exception {
		if(listaDomenii.containsKey(idDomeniu)) {
			System.out.println(listaDomenii.get(idDomeniu));
		}
		else throw new Exception("Domeniul nu exista");
	}

	@Override
	public void notifyMe(Observable observable) {
		System.out.println( "Nameserver-ul domeniului " + ((Domeniu) observable).getId() + " "
				+ "updatat. Verifica lista de domenii.");
		
	}
}
