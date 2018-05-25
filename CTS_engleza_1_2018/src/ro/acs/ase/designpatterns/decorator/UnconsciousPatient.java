package ro.acs.ase.designpatterns.decorator;

import ro.acs.ase.models.NewPatient;

public class UnconsciousPatient extends AbstractUnconsciousPatient {
	private String companionPersonName;
	
	public UnconsciousPatient(String companion, NewPatient patient) {
		super(patient);
		this.companionPersonName = companion;
	}
	
	public String getDescription() {
		return super.getDescription() + " " +this.descrieCompanion();
	}
	
	public String descrieCompanion() {
		return this.companionPersonName;
	}
}
