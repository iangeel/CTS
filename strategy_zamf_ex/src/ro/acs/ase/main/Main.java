package ro.acs.ase.main;

import ro.acs.ase.models.Receptioner;
import ro.acs.ase.models.VerificareNonUE;
import ro.acs.ase.models.VerificareUE;
import ro.acs.ase.models.VerificareUSA;

public class Main {

	public static void main(String[] args) {
		Receptioner receptioner = new Receptioner();
		
		receptioner.setStrategy(new VerificareUE());
		receptioner.verificare();
		receptioner.setStrategy(new VerificareNonUE());
		receptioner.verificare();
		receptioner.setStrategy(new VerificareUSA());
		receptioner.verificare();

	}

}
