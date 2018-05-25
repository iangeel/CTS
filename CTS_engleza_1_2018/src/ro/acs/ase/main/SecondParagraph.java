package ro.acs.ase.main;

import ro.acs.ase.designpatterns.decorator.AbstractUnconsciousPatient;
import ro.acs.ase.designpatterns.decorator.UnconsciousPatient;
import ro.acs.ase.models.NewPatient;
import ro.acs.ase.models.Patient;
import ro.acs.ase.models.PatientInterface;

public class SecondParagraph {

	public static void main(String[] args) {
		PatientInterface patient1 = new NewPatient(40, true, false);
		PatientInterface patient2 = new NewPatient(40, true, true);
		
		AbstractUnconsciousPatient uncp2 = new UnconsciousPatient("Gigel",(NewPatient) patient2);
		
		
		System.out.println(uncp2.getDescription());
	}

}
