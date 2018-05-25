package ro.acs.ase.models;

public class NewPatient extends Patient implements PatientInterface {

	public NewPatient(Integer temp, boolean isBleeding, boolean isUnconscious) {
		super(temp, isBleeding, isUnconscious);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDescription() {
		if(this.isUnconscious() == false) {
			return this.getTemp() + ", bleeding: " + this.isBleeding() + 
					", unconscious: " + this.isUnconscious();
		}
		return "";
	}
}
