package ro.ase.acs.model;


public class PersonalInformation {

	private String firstName;
	private String lastName;
	private Address address;

	public PersonalInformation(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public PersonalInformation() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static class PersonalInformationBuilder {
		
		private PersonalInformation personalInfo;
		
		public PersonalInformationBuilder(String firstName, String lastName) {
			this.personalInfo = new PersonalInformation();
			this.personalInfo.setFirstName(firstName);
			this.personalInfo.setLastName(lastName);
		}
		
		public PersonalInformationBuilder addAdress(Address address) {
			this.personalInfo.setAddress(address);
			return this;
		}
		
		public PersonalInformation build() {
			return this.personalInfo;
		}
	}

	@Override
	public String toString() {
		return "PersonalInformation [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
	
}
