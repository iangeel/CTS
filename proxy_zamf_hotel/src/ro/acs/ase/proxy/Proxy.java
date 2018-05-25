package ro.acs.ase.proxy;

import ro.acs.ase.models.IRezervare;
import ro.acs.ase.models.Rezervare;

public class Proxy implements IRezervare {

	
	private Rezervare rezervare;
	
	public Proxy(Rezervare rezervare) {
		this.rezervare = rezervare;
	}
	
	
	@Override
	public void anulareRezervare() {
		if (rezervare.getNumarNopti() <= 1) {
			rezervare.anulareRezervare();
		}
		else System.out.println("Shalalalalaa");
		
	}

}
