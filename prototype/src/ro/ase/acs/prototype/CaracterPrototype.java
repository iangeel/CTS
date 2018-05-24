package ro.ase.acs.prototype;

import java.util.HashMap;
import java.util.Map;

import ro.ase.acs.model.Caracter;
import ro.ase.acs.model.CaracterFeminin;
import ro.ase.acs.model.CaracterMasculin;

public class CaracterPrototype {

	private static Map<String, Caracter> source = new HashMap<>();
	
	static {
		CaracterMasculin cm = new CaracterMasculin();
		cm.setRasa("masculina");
		cm.setNrBratari(150);
		source.put("M", cm);
		
		CaracterFeminin cf = new CaracterFeminin();
		cf.setRasa("feminina");
		cf.setNrCercei(6);
		source.put("F", cf);
	}
	
	public static Caracter getSource(String tipCaracter) throws CloneNotSupportedException {
		return tipCaracter == null ? null : (source.get(tipCaracter) == null ? null : 
			(Caracter) source.get(tipCaracter).clone());
	}
	
}