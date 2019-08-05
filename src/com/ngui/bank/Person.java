package com.ngui.bank;

import java.util.List;
import java.util.Collection;

public class Person implements PersonalDetails{

	private String firstName; 
	
	private String lastName ;
	
	private long mobileNumber;
	
	private int employeeId;
	
	private List<String> address;
	
	private double accountBalance ;
	
	private double parentsAccountBalance;
	
	private long requestLoanAmount;
	
	public Person(String firstName, String lastName, long mobileNumber, int employeeId, List<String> address,
			double accountBalance) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.employeeId = employeeId;
		this.address = address;
		this.accountBalance = accountBalance;
	}

	
	


	public Person(String firstName, String lastName, long mobileNumber, int employeeId, List<String> address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.employeeId = employeeId;
		this.address = address;
	}


//	public Person getPersonDetails(Person person){
//		
//	}



	@Override
	public String getUserName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return (firstName+lastName);
	}

	@Override
	public Long getMobileNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getEmployeeId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<String> getAddress() {
		// TODO Auto-generated method stub
		return null;
	}





	public String getFirstName() {
		return firstName;
	}





	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}





	public String getLastName() {
		return lastName;
	}


	



	public long getRequestLoanAmount() {
		return requestLoanAmount;
	}





	public void setRequestLoanAmount(long requestLoanAmount) {
		this.requestLoanAmount = requestLoanAmount;
	}





	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}





	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





	public double getAccountBalance() {
		return accountBalance;
	}





	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}





	public double getParentsAccountBalance() {
		return parentsAccountBalance;
	}





	public void setParentsAccountBalance(double parentsAccountBalance) {
		this.parentsAccountBalance = parentsAccountBalance;
	}





	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}





	public void setAddress(List<String> address) {
		this.address = address;
	}

	
}
