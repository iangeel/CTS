package ro.acs.ase.models;

import java.util.Date;

import ro.acs.ase.observer.Observable;


public class Domeniu extends Observable {
	private Integer id;
	private String numeDomeniu;
	private Integer registrantId;
	private Date registrationDate;
	private String nameserver;
	private String host;
	
	public Domeniu() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeDomeniu() {
		return numeDomeniu;
	}

	public void setNumeDomeniu(String numeDomeniu) {
		this.numeDomeniu = numeDomeniu;
	}

	public Integer getRegistrantId() {
		return registrantId;
	}

	public void setRegistrantId(Integer registrantId) {
		this.registrantId = registrantId;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getNameserver() {
		return nameserver;
	}

	public void setNameserver(String nameserver) {
		this.nameserver = nameserver;
		super.notifyObserver();
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "Domeniu [id=" + id + ", numeDomeniu=" + numeDomeniu + ", registrantId=" + registrantId
				+ ", registrationDate=" + registrationDate + ", nameserver=" + nameserver + ", host=" + host + "]";
	}
	
	
	
	
	
	
}
