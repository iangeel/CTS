package acs.ase.ro.models;

public class Bank implements Observer {
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	private String bankName;

	public Bank(String bankName) {
		super();
		this.bankName = bankName;
	}

	@Override
	public void notifyMe(Observabil observabil) {
		System.out.println("Hello " + bankName + ", your newsletter has arrived");
		
	}
	
	
	
	
}
