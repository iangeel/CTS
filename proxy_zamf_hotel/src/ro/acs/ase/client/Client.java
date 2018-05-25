package ro.acs.ase.client;

import ro.acs.ase.models.IRezervare;
import ro.acs.ase.models.Rezervare;
import ro.acs.ase.proxy.Proxy;

public class Client {

	public static void main(String[] args) {
		IRezervare rezervare = new Rezervare(1, 12);
		Proxy mProxy = new Proxy((Rezervare)rezervare);
		mProxy.anulareRezervare();

	}

}
