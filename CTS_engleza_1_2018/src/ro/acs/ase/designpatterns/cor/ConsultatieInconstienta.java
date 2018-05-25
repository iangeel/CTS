package ro.acs.ase.designpatterns.cor;

import ro.acs.ase.models.Patient;

public class ConsultatieInconstienta extends ConsultatieHandler {

	@Override
	public void gestionareConsultatie(Patient patient) {
		if(patient.isUnconscious()) {
			System.out.println("Move patient to neurology unit!");
		}
		else {
			super.getHandler().gestionareConsultatie(patient);
		}
		
	}

}
