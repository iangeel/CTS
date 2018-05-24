package ro.ase.acs.model;


public class BankAccount {

	
	private final Integer id;
	private PersonalInformation personalInformation;
	private final String pid;
	private double balance;
	private double interestRate;

	private BankAccount(Integer id, String pid) {
		this.id = id;
		this.pid = pid;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public Integer getId() {
		return id;
	}

	public String getPid() {
		return pid;
	}

	public PersonalInformation getPersonalInformation() {
		return personalInformation;
	}

	public void setPersonalInformation(PersonalInformation personalInformation) {
		this.personalInformation = personalInformation;
	}
	
	public static class BankAccountBuilder {
		
		private BankAccount bankAccount;
		
		public BankAccountBuilder(Integer id, String pid) {
			bankAccount = new BankAccount(id, pid);
		}
		
		public BankAccountBuilder addPersonalInfo(PersonalInformation personalInfo) {
			this.bankAccount.setPersonalInformation(personalInfo);
			return this;
		}
		
		public BankAccountBuilder addBalance(double balance) {
			this.bankAccount.setBalance(balance);
			return this;
		}
		
		public BankAccountBuilder addInterestRate(double rate) {
			this.bankAccount.setInterestRate(rate);
			return this;
		}
		
		public BankAccount build() {
			return this.bankAccount;
		}
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", personalInformation=" + personalInformation + ", pid=" + pid + ", balance="
				+ balance + ", interestRate=" + interestRate + "]";
	}
	
	
}
