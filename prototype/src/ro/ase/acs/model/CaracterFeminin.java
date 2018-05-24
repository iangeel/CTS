package ro.ase.acs.model;

public class CaracterFeminin extends Caracter {

	private int nrCercei;
	
	
	public CaracterFeminin() {}
	
	public int getNrCercei() {
		return nrCercei;
	}




	public void setNrCercei(int nrCercei) {
		this.nrCercei = nrCercei;
	}




	@Override
	public Object clone() throws CloneNotSupportedException {
		CaracterFeminin c = new CaracterFeminin();
		c.setNrCercei(this.getNrCercei());
		c.setRasa(this.getRasa());
		return c;
	}

	@Override
	public String toString() {
		return "CaracterFeminin [nrCercei=" + nrCercei + "]";
	}

	
}
