package ro.angel.classes;

public class Video extends Media {
	
	private int rezolutie;

	public Video(String denumire, float lungime, int semnaturaUnica, int rezolutie) throws Exception {
		super(denumire, lungime, semnaturaUnica);
		
		if(this.getDenumire().equals(null)) {
			throw new Exception("Numele este null");
		}
		
		this.rezolutie = rezolutie;		
	}
	
	
	

	public int getRezolutie() {
		return rezolutie;
	}




	public void setRezolutie(int rezolutie) {
		this.rezolutie = rezolutie;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Video other = (Video) obj;
		if (rezolutie != other.rezolutie)
			return false;
		return true;
	}




	@Override
	protected Video clone() throws CloneNotSupportedException {
		try {
			return new Video(this.getDenumire(), this.getLungime(), this.getSemnaturaUnica(), this.getRezolutie());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}




	@Override
	public void returneazaPlayer() {
		System.out.println("Player video...");	
	}
	
	
	
	
}
