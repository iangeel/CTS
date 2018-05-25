package ro.acs.ase.models;

public class Room implements IRoom {

	private Integer nrProsoape;
	private Integer nrPerne;
	
	
	public Room(Integer nrProsoape, Integer nrPerne) {
		super();
		this.nrProsoape = nrProsoape;
		this.nrPerne = nrPerne;
	}


	@Override
	public void tipareste(Temporals temp) {
		System.out.println("Camera " + temp.getNrCamera() + " alocata clientului " + 
				temp.getNumeClient() + " are in inventar " + 
				nrProsoape + " prosoape si " + 
				nrPerne + " perne.");
	}

}
