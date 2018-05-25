package acs.ase.ro.models;

public class Newsletter extends Observabil {
	
	private String name;

	public Newsletter(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void hasArrived() {
		super.notifyObservers();
	}

}
