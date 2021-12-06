package model;
/**
* this is the company class
*/
public class Company {
	private String nit;
	private String companyName;
	/**
    * this method is the constructor of the class
    
    * @param nit String
	* @param companyName String
    */
	
	public Company(String nit, String companyName) {
		this.nit = nit;
		this.companyName = companyName;
		
	}
	/**
    * A get method
    * @return nit String
    */
	public String getNit() {
		return nit;
	}
	/**
    * A set method
    * @param nit String
    */
	public void setNit(String nit) {
		this.nit = nit;
	}
	/**
    * A get method
    * @return companyName String
    */
	public String getCompanyName() {
		return companyName;
	}
	/**
    * A set method
    * @param nit String
    */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
    * It is the toString method of the class
    * @return string String
    */
	public String toString() {
		String string=companyName +" NIT: " + nit +".";
		return string;
	}
}