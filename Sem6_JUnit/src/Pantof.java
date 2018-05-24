
public class Pantof {
	private String denProdus;
	private int cantitate;
	private ECuloare culoare;
	private float pret;
	
	public Pantof(String denProdus, int cantitate, ECuloare culoare, float pret) throws ExceptionConstructor{
		if(denProdus.length() >= 5 && cantitate > 0 && pret > 0) {
		this.denProdus = denProdus;
		this.cantitate = cantitate;
		this.culoare = culoare;
		this.pret = pret;
		}
		else throw new ExceptionConstructor();
	}

	public ECuloare getCuloare() {
		return culoare;
	}

	public void setCuloare(ECuloare culoare) {
		this.culoare = culoare;
	}

	public String getDenProdus() {
		return denProdus;
	}

	public float getPret() {
		return pret;
	}

	public int getCantitate() {
		return cantitate;
	}
}
