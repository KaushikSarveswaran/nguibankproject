package com.ngui.bank;

public abstract class Loan {

	public final long maxLoan = 10000000;
	
	public boolean checkIfLoanExceededLimit(long loanAmount){
		if(loanAmount > maxLoan)
			return false;
		else
			return true;
	}
	
	public abstract double getInterestRate();
	
	public abstract int getTimeperiod();
	
	public abstract InteterstType getInterestType();
	
	public abstract boolean loanApplicable(Person person);
	
	public abstract double calculateInterest();
	
	
}
