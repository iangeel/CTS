package ro.acs.ase.designpatterns.cor;

import ro.acs.ase.models.Patient;

public abstract class ConsultatieHandler {
	private ConsultatieHandler handler;
	
	
	
	public ConsultatieHandler getHandler() {
		return handler;
	}



	public void setHandler(ConsultatieHandler handler) {
		this.handler = handler;
	}



	public abstract void gestionareConsultatie(Patient patient);
}
