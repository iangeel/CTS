package ro.acs.ase.designpatterns.cor;

import ro.acs.ase.models.Patient;

public class ConsultatieSangerare extends ConsultatieHandler {

	@Override
	public void gestionareConsultatie(Patient patient) {
		if(patient.isBleeding()) {
			System.out.println("Move patient to surgical unit!");
		}
		else {
			super.getHandler().gestionareConsultatie(patient);
		}
		
	}

}
