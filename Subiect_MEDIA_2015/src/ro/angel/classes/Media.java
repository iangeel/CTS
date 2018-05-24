package ro.angel.classes;

public abstract class Media {
	private String denumire;
	private float lungime;
	private final int semnaturaUnica;
	
	
	public Media(String denumire, float lungime, int semnaturaUnica) {
		this.denumire = denumire;
		this.lungime = lungime;
		this.semnaturaUnica = semnaturaUnica;
	}


	public String getDenumire() {
		return denumire;
	}


	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}


	public float getLungime() {
		return lungime;
	}


	public void setLungime(float lungime) {
		this.lungime = lungime;
	}


	public int getSemnaturaUnica() {
		return semnaturaUnica;
	}
	
	public abstract void returneazaPlayer();
	
}
