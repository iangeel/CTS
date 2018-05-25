package acs.ase.ro.models;

public class Person implements Observer {
	
	private String name;
	
	

	public Person(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void notifyMe(Observabil observabil) {
		System.out.println("Hey " + name + " your newsletter has arrived");
		
	}
	
}
