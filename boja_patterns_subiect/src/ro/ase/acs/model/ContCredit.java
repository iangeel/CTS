package ro.ase.acs.model;

public class ContCredit extends ContBancar {

	public ContCredit() {}

	@Override
	public String toString() {
		return "ContCredit [getDenumire()=" + getDenumire() + ", getAdresa()=" + getAdresa() + ", getContor()="
				+ getContor() + "]";
	}

	@Override
	public void transfer(ContBancar destinatie, double suma) {
		System.out.println("ContCredit: trasfer");
		
	}

	@Override
	public void depune(double suma) {
		System.out.println("ContCredit: depunere");
		
	}

	
	
	
}
