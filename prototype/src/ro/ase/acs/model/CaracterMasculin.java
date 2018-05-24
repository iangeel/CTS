package ro.ase.acs.model;

public class CaracterMasculin extends Caracter {
	
	private int nrBratari;
	
	public CaracterMasculin() {
		// TODO Auto-generated constructor stub
	}
	
	

	public int getNrBratari() {
		return nrBratari;
	}



	public void setNrBratari(int nrBratari) {
		this.nrBratari = nrBratari;
	}



	@Override
	public String toString() {
		return "CaracterMasculin [nrBratari=" + nrBratari + "]";
	}



	@Override
	public Object clone() throws CloneNotSupportedException {
		CaracterMasculin c = new CaracterMasculin();
		c.setNrBratari(this.getNrBratari());
		c.setRasa(this.getRasa());
		return c;
	}

}
