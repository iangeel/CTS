package ro.ase.acs.decorator;

import ro.ase.acs.model.IFactura;

public class ConcretDecoratorFactura extends AbstractDecoratorFactura{

	public ConcretDecoratorFactura(IFactura factura) {
		super(factura);
	}

	@Override
	public void printeazaFactura() {
		super.printeazaFactura();
		printeazaFelicitare();
		oferaDiscout();

	}

	public void printeazaFelicitare() {
		System.out.println("La multi ani !");
	}
	
	public void oferaDiscout() {
		System.out.println("Discount oferit !");
		
	}
}
