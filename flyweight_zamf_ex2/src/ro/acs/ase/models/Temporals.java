package ro.acs.ase.models;

public class Temporals {
	private Integer nrCamera;
	private String numeClient;
	
	
	public Temporals(Integer nrCamera, String numeClient) {
		super();
		this.nrCamera = nrCamera;
		this.numeClient = numeClient;
	}


	public Integer getNrCamera() {
		return nrCamera;
	}


	public void setNrCamera(Integer nrCamera) {
		this.nrCamera = nrCamera;
	}


	public String getNumeClient() {
		return numeClient;
	}


	public void setNumeClient(String numeClient) {
		this.numeClient = numeClient;
	}
	
	
}
