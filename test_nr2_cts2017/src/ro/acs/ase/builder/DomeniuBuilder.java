package ro.acs.ase.builder;

import java.util.Date;

import ro.acs.ase.models.Domeniu;

public class DomeniuBuilder implements Builder {

	private Domeniu domeniu;
	
	
	public DomeniuBuilder(Integer id, String numeDomeniu, Integer registrantId, Date regDate) {
		domeniu = new Domeniu();
		domeniu.setId(id);
		domeniu.setNumeDomeniu(numeDomeniu);
		domeniu.setRegistrantId(registrantId);
		domeniu.setRegistrationDate(regDate);
	}
	
	@Override
	public Domeniu build() {
		return domeniu;
	}
	
	public DomeniuBuilder setNameserver(String nameserver) {
		this.domeniu.setNameserver(nameserver);
		return this;
	}
	
	public DomeniuBuilder setHost(String host) {
		this.domeniu.setHost(host);
		return this;
	}

}
