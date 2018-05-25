package ro.acs.ase.models;

public  class Imobil {
	private String adresa;
	private Double suprafata;
	private Double pret;
	
	public Imobil(String a, Double s, Double p) {
		this.adresa = a;
		this.suprafata = s;
		this.pret = p;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public Double getSuprafata() {
		return suprafata;
	}

	public void setSuprafata(Double suprafata) {
		this.suprafata = suprafata;
	}

	public Double getPret() {
		return pret;
	}

	public void setPret(Double pret) {
		this.pret = pret;
	}
	
	
}
