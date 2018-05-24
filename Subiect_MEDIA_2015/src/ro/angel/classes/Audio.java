package ro.angel.classes;

public class Audio extends Media{
	
	private int calitate;

	public Audio(String denumire, float lungime, int semnaturaUnica, int calitate) throws Exception {
		super(denumire, lungime, semnaturaUnica);
		
		if(this.getDenumire().equals(null)) {
			throw new Exception("Numele este null");
		}
		
		this.calitate = calitate;
		
	}
	
	

	public int getCalitate() {
		return calitate;
	}


	public void setCalitate(int calitate) {
		this.calitate = calitate;
	}
	
	


	@Override
	protected Audio clone() throws CloneNotSupportedException {
		try {
			return new Audio(this.getDenumire(), this.getLungime(), this.getSemnaturaUnica(),
					this.getCalitate());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Audio other = (Audio) obj;
		if (calitate != other.calitate)
			return false;
		return true;
	}

	


	@Override
	public void returneazaPlayer() {
		System.out.println("Player audio...");
		
	}
	
	
	
}
