package ro.ase.acs.model;


public class Address {

	private String city;
	private String street;
	private Integer streetNumber;

	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(String city, String street, Integer streetNumber) {
		super();
		this.city = city;
		this.street = street;
		this.streetNumber = streetNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(Integer streetNumber) {
		this.streetNumber = streetNumber;
	}
	
	public static class AddressBuilder {
		
		private Address address;
		
		public AddressBuilder() {
			address = new Address();
		}
		
		public AddressBuilder addCity(String city) {
			this.address.setCity(city);
			return this;
		}
		
		public AddressBuilder addStreet(String street) {
			this.address.setStreet(street);
			return this;
		}
		
		public AddressBuilder addStreetNo(Integer streetNo) {
			this.address.setStreetNumber(streetNo);
			return this;
		}
		
		public Address build() {
			return this.address;
		}
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", streetNumber=" + streetNumber + "]";
	}
	
}
