package com.java.collection;

public class StudentName {
	
	private String fName;
	private String LName;
	
	
	
	public StudentName(String fName, String lName) {
		super();
		this.fName = fName;
		this.LName = lName;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		this.LName = lName;
	}

	@Override
	public String toString() {
		return "StudentName [fName=" + fName + ", LName=" + LName + "]";
	}
	
	
	
	

}
