package model;

public class Company {
	private String nit;
	private String companyName;
	
	public Company(String nit, String companyName) {
		this.nit = nit;
		this.companyName = companyName;
		
	}
	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String toString() {
		return companyName +" NIT: " + nit +".";
	}
}