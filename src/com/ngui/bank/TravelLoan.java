package com.ngui.bank;

public class TravelLoan extends Loan{

	int timePeriod = 1;
	double interestRate = 1;
	long minBalance = 5000000;
	
	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return interestRate;
	}

	@Override
	public int getTimeperiod() {
		// TODO Auto-generated method stub
		return timePeriod;
	}

	@Override
	public InteterstType getInterestType() {
		// TODO Auto-generated method stub
		return InteterstType.SIMPLE;
	}

	@Override
	public boolean loanApplicable(Person person) {
		boolean loanFlag = false;
		if(person.getAccountBalance() >= minBalance){
			loanFlag = true;
			
		}
		else
			System.out.println("Loan Rejected because of low account balance");
			
		if(!checkIfLoanExceededLimit(person.getRequestLoanAmount())){
			System.out.println("Loan exceeded permitted amount");
		}
		
		return (loanFlag && this.checkIfLoanExceededLimit(person.getRequestLoanAmount()));

	}

	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		return 0;
	}

}
