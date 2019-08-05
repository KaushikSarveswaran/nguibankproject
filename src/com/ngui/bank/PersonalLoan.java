package com.ngui.bank;

public class PersonalLoan extends Loan {

	int timePeriod = 1;
	double interestRate = 5;
	
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
		if(! checkIfLoanExceededLimit(person.getRequestLoanAmount())){
			System.out.println("Loan amount exceeded permitted limit");
		}
		return checkIfLoanExceededLimit(person.getRequestLoanAmount());
	}

	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		return 0;
	}

}
