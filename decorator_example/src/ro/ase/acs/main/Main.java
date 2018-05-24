package ro.ase.acs.main;

import ro.ase.acs.decorator.ConcretDecoratorFactura;
import ro.ase.acs.model.Factura;
import ro.ase.acs.model.IFactura;

public class Main {

	public static void main(String[] args) {
		IFactura factura = new ConcretDecoratorFactura(new Factura(101,100));
		factura.printeazaFactura();

	}

}
