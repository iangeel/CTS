package ro.acs.ase.models;

public class Receptioner {
	private VerificareStrategy strategy;
	
	public Receptioner() {}
	
	public void setStrategy(VerificareStrategy strategy) {
		this.strategy = strategy;
	}
	
	
	public void verificare() {
		strategy.verificare();
	}
	
	
}
