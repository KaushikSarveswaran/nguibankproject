package com.ngui.bank;

public class HousingLoan extends Loan {

	int timePeriod = 5;
	double interestRate = 6;
	long minBalance = 1000000;
	
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
		return InteterstType.COMPOUND;
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
