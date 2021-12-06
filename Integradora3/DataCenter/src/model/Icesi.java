package model;

public class Icesi extends Company {
	
	private int registrationNumber;
	
	public Canal(int nit, String companyName, int registrationNumber) {
		this.nit = nit;
		this.companyName = companyName;
		this.registrationNumber = registrationNumber;
		
	}
	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
}