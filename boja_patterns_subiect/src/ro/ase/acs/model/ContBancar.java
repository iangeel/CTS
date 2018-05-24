package ro.ase.acs.model;

public abstract class ContBancar {
	private String denumire;
	private String adresa;
	private int contor;
	
	
	
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public int getContor() {
		return contor;
	}
	public void setContor(int contor) {
		this.contor = contor;
	}
	
	public abstract void transfer(ContBancar destinatie, double suma);
	public abstract void depune(double suma);

	
}
