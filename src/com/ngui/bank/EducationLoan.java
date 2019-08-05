package com.ngui.bank;

public class EducationLoan extends Loan {

	int timePeriod = 5;
	double interestRate = 6;
	long minBalance = 500000;
	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTimeperiod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public InteterstType getInterestType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean loanApplicable(Person person) {
		boolean loanFlag = false;
		if(person.getParentsAccountBalance() >= minBalance){
			loanFlag = true;
			
		}
		else
			System.out.println("Loan Rejected because of low parent account balance");
			
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
