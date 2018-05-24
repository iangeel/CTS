package clase;

public class Avion {

	private final int CAPACITATE;	
	private int locuriOcupate;
	private Angajat pilot;	

	public Angajat getPilot() {
		return pilot;
	}

	public void setPilot(Angajat pilot) {
		if(pilot.getVarsta()>23 && pilot.getVechime()>5){
			this.pilot = pilot;
		}
	}

	public int getLocuriOcupate() {
		return locuriOcupate;
	}

	public void setLocuriOcupate(int locuriOcupate) {
		this.locuriOcupate = locuriOcupate;
	}

	public int getCAPACITATE() {
		return CAPACITATE;
	}
	
	public Avion() {
		CAPACITATE=220;
		locuriOcupate=0;
		pilot=new Pilot();
	}
	
	public Avion(int capacitate, int locuriOcupate, Angajat pilot) {
		this.CAPACITATE=capacitate;
		this.locuriOcupate=locuriOcupate;
		this.setPilot(pilot);
	}
	
	public void imbarca(int numarPersoane) {
		locuriOcupate-=numarPersoane;
	}
	
	public void debarca(int numarPersoane) {
		numarPersoane+=locuriOcupate;
	}
	
}
