package ro.acs.ase.models;

public class Patient implements PatientInterface {
	private Integer temp;
	private boolean isBleeding;
	private boolean isUnconscious;

	
	
	public Patient(Integer temp, boolean isBleeding, boolean isUnconscious) {
		super();
		this.temp = temp;
		this.isBleeding = isBleeding;
		this.isUnconscious = isUnconscious;
		
	}
	
	
	public Integer getTemp() {
		return temp;
	}
	public void setTemp(Integer temp) {
		this.temp = temp;
	}
	public boolean isBleeding() {
		return isBleeding;
	}
	public void setBleeding(boolean isBleeding) {
		this.isBleeding = isBleeding;
	}
	public boolean isUnconscious() {
		return isUnconscious;
	}
	public void setUnconscious(boolean isUnconscious) {
		this.isUnconscious = isUnconscious;
	}


	@Override
	public String getDescription() {
		return this.getTemp() + ", bleeding: " + this.isBleeding() + 
				", unconscious: " + this.isUnconscious();
	}

	
	
}
