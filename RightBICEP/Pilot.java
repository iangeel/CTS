package clase;

public class Pilot extends Angajat {
	private int orePilotaj;	

	public Pilot() {
		super();
		this.orePilotaj=0;
	}

	public Pilot(String nume, int varsta, int vechime, int orePilotaj) {
		super(nume, varsta, vechime);
		this.orePilotaj=orePilotaj;
	}

	public int getOrePilotaj() {
		return varsta-vechime;
	}

	public void setOrePilotaj(int orePilotaj) {
		this.orePilotaj = orePilotaj;
	}
	
}
