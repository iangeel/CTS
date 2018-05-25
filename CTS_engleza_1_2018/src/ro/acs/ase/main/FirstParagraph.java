package ro.acs.ase.main;


import ro.acs.ase.designpatterns.cor.ConsultatieHandler;
import ro.acs.ase.designpatterns.cor.ConsultatieInconstienta;
import ro.acs.ase.designpatterns.cor.ConsultatieSangerare;
import ro.acs.ase.designpatterns.cor.ConsultatieStareNormala;
import ro.acs.ase.designpatterns.cor.ConsultatieTemperatura;
import ro.acs.ase.models.Patient;

public class FirstParagraph {

	public static void main(String[] args) {
		Patient pacient1 = new Patient(45, false, false);
		Patient pacient2 = new Patient(30, true, false);
		Patient pacient3 = new Patient(30, false, true);
		
		ConsultatieHandler consultaTemperatura = new ConsultatieTemperatura();
		ConsultatieHandler consultaSangerare = new ConsultatieSangerare();
		ConsultatieHandler consultaInconstienta = new ConsultatieInconstienta();
		ConsultatieHandler consultaStareNormala = new ConsultatieStareNormala();
		
		consultaTemperatura.setHandler(consultaSangerare);
		consultaSangerare.setHandler(consultaInconstienta);
		consultaInconstienta.setHandler(consultaStareNormala);
		
		consultaTemperatura.gestionareConsultatie(pacient1);
		consultaTemperatura.gestionareConsultatie(pacient2);
		consultaTemperatura.gestionareConsultatie(pacient3);
	}

}
