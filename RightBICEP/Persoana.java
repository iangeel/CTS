package clase;

public class Persoana {

	protected String nume;
	protected int varsta;
	
	public Persoana() {
		super();
		this.nume = "";
		this.varsta = 1;
	}
	
	public Persoana(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}
	
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	
}
