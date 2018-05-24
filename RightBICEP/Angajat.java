package clase;

public class Angajat extends Persoana {
	protected int vechime;

	public Angajat() {
		super();
		vechime = 0;
	}

	public Angajat(String nume, int varsta, int vechime) {
		super(nume, varsta);
		this.vechime = vechime;
	}

	public int getVechime() {
		return varsta;
	}

	public void setVechime(int vechime) {
		this.vechime = vechime;
	}
}
