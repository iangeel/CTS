package ro.ase.acs.main;

import ro.ase.acs.model.CaracterFeminin;
import ro.ase.acs.model.CaracterMasculin;
import ro.ase.acs.prototype.CaracterPrototype;

public class Main {

	public static void main(String[] args) {
		try {
			CaracterFeminin cf = (CaracterFeminin) CaracterPrototype.getSource("F");
			cf.setNrCercei(200);
			System.out.println(cf);
			
			CaracterMasculin cm = (CaracterMasculin) CaracterPrototype.getSource("M");
			cm.setNrBratari(1);
			System.out.println(cm);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
