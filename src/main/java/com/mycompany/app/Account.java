package assignment;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Account implements Serializable{

	private Date date;
	private String holderName;
	private int accountID;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	
	
}

@SuppressWarnings("serial")
class Date implements Serializable{
	
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		// TODO Auto-generated constructor stub
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return day + "/" + month + "/" + year;
	}
}