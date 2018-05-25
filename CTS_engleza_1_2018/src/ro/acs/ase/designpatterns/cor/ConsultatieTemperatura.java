package ro.acs.ase.designpatterns.cor;

import ro.acs.ase.models.Patient;

public class ConsultatieTemperatura extends ConsultatieHandler {

	@Override
	public void gestionareConsultatie(Patient patient) {
		if(patient.getTemp() > 40) {
			System.out.println("A general doctor will investigate more...");
		}
		else {
			super.getHandler().gestionareConsultatie(patient);
		}
		
	}

}
