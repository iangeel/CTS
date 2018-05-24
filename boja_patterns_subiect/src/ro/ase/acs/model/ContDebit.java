package ro.ase.acs.model;

public class ContDebit extends ContBancar {

	public ContDebit() {}

	@Override
	public String toString() {
		return "ContDebit [getDenumire()=" + getDenumire() + ", getAdresa()=" + getAdresa() + ", getContor()="
				+ getContor() + "]";
	}

	@Override
	public void transfer(ContBancar destinatie, double suma) {
		System.out.println("ContDebit: trasfer");
		
	}

	@Override
	public void depune(double suma) {
		System.out.println("ContDebit: depunere");
		
	}
	
	
}
