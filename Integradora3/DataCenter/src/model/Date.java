package model;



/**
* It is the class that has the date object 
*/
public class Date {
	private int day;
	private int month;
	private int year;
	
	/**
    * this method is the constructor of the class
    
    * @param day int
	* @param month int
	* @param year int
    */
	public Date(int day, int month, int year) {
		this.day= day;
		this.month= month;
		this.year = year;
	}
	/**
    * A get method
    * @return day int
    */
	public int getDay() {
		return day;
	}
	/**
    * A set method
    * @param pday int
    */
	public void setDay(int pday) {
		this.day = pday;
	}
	/**
    * A get method
    * @return month int
    */
	public int getMonth() {
		return month;
	}
	/**
    * A set method
    * @param pmonth int
    */
	public void setMonth(int pmonth) {
		this.month = pmonth;
	}
	/**
    * A get method
    * @return year int
    */
	public int getYear() {
		return year;
	}
	/**
    * A set method
    * @param pyear int
    */
	public void setYear(int pyear) {
		this.year = pyear;
	}
	/**
    * It is the toString method of the class
    * @return string String
    */
	public String toString() {
		String string=day +"/" + month + "/" + year;
		return string;
	}

}
