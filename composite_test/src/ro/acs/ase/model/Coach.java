package ro.acs.ase.model;

import java.util.ArrayList;
import java.util.List;

public class Coach implements Employee{

	private String name;
	List<Employee> mEmployee;;
	
	public Coach(String name) {
		mEmployee = new ArrayList<>();
		this.name = name;
	}
	
	@Override
	public void addEmplyee(Employee employee) {
		mEmployee.add(employee);
		
	}

	@Override
	public void removeEmployee(Employee employee) {
		mEmployee.remove(employee);
		
	}

	@Override
	public Employee getEmployee(int index) {
		return mEmployee.get(index);
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getmEmployee() {
		return mEmployee;
	}

	public void setmEmployee(List<Employee> mEmployee) {
		this.mEmployee = mEmployee;
	}

	@Override
	public void showTeam() {
		System.out.println("   Coach " + this.getName());
		for(Employee e : mEmployee) {
			e.showTeam();
		}
	}

}
