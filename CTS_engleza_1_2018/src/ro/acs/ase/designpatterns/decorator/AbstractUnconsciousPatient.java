package ro.acs.ase.designpatterns.decorator;

import ro.acs.ase.models.NewPatient;
import ro.acs.ase.models.PatientInterface;

public abstract class AbstractUnconsciousPatient {
	PatientInterface newPatient;
	
	
	public AbstractUnconsciousPatient(NewPatient newPatient) {
		super();
		this.newPatient = newPatient;
	}


	public String getDescription() {
		return newPatient.getDescription();
	}
}
