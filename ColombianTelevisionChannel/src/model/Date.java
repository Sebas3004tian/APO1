package model;



/**
* It is the class that has the date object 
*/
public class Date {
	private int day;
	private int month;
	private int year;
	
	
	public Date(int day, int month, int year) {
		this.day= day;
		this.month= month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int pday) {
		this.day = pday;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int pmonth) {
		this.month = pmonth;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int pyear) {
		this.year = pyear;
	}
	
	public String toString() {
		return day +"/" + month + "/" + year;
	}

}
