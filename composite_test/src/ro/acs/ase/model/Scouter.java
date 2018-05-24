package ro.acs.ase.model;

public class Scouter implements Employee {

	String name;
	
	public Scouter(String name) {
		this.name = name;
	}
	
	@Override
	public void addEmplyee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getEmployee(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showTeam() {
		System.out.println("      Scouter " + name);
		
	}
	
	

}
