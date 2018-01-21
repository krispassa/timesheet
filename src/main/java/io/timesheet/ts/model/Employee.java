package io.timesheet.ts.model;


import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String eID;
	private String fname;
	private String lname;
	private String address;
	private String startTime;
	private String endTime;
	private double totalhrs;
	private double payRate;
	public Employee() {}
	public Employee(String eID, String fname, String lname, String address, String startTime, String endTime,
			double totalhrs) {
		this.eID = eID;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.startTime = startTime;
		this.endTime = endTime;
		this.totalhrs = totalhrs;
	}
	public String geteID() {
		return eID;
	}
	public void seteID(String eID) {
		this.eID = eID;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	public double getTotalhrs() {
		return totalhrs;
	}
	public void setTotalhrs(double totalhrs) {
		this.totalhrs = totalhrs;
	}
	public double getTotalSalary() {
		double totalamt = getPayRate() * getTotalhrs();
		return totalamt;
	}
	
	

}
