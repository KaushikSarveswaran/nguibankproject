package com.ngui.bank;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double balance ;
		String firstName ;
		String lastName ;
		long mobileNumber;
		int employeeId;
		Scanner scanner = new Scanner(System.in);
		
		List<String> address = new ArrayList<>();
		System.out.println("** Enter the personal details **");
		System.out.println("Enter first Name ");
		firstName = scanner.nextLine();
		System.out.println("Enter last Name");
		lastName = scanner.nextLine();
		System.out.println("Enter your employee Id");
		employeeId = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter your phone number");
		mobileNumber = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter number of fields in your address");
		int fieldsInAddress = scanner.nextInt();
		scanner.nextLine();
		
		
		for(int i=0;i<fieldsInAddress;i++){
			System.out.println("Enter the address line "+ (i+1));
			String addressLine = scanner.nextLine();
			address.add(addressLine);
		}
		
		
		
		
		System.out.println("What kind of Loan do you want?");
		System.out.println("1. Housing Loan");
		System.out.println("2. Education Loan");
		System.out.println("3. Travel Loan");
		System.out.println("4. Personal Loan");
		
		int option = scanner.nextInt();
		scanner.nextLine();
		long requestedLoan ;
		System.out.println("Enter the request amount of loan");
		requestedLoan = scanner.nextLong();
		scanner.nextLine();
		
		if(option == 1){
			
			System.out.println("Enter the balance in your current account");
			balance = scanner.nextDouble();
			scanner.nextLine();
			Person person = new Person(firstName, lastName, mobileNumber, employeeId, address,balance);
			
			person.setRequestLoanAmount(requestedLoan);
			Loan housingLoan = new HousingLoan();
			if(housingLoan.loanApplicable(person)){
				System.out.println("Your housing loan request is approved");
				System.out.println("Your payable interest is "+ calculateInterest(housingLoan.getInterestType(), housingLoan.getInterestRate(), housingLoan.getTimeperiod(), requestedLoan));
			}
			
		}
		
		else if(option == 2){
			System.out.println("Enter the balance in your parents account");
			balance = scanner.nextDouble();
			scanner.nextLine();
			Person person = new Person(firstName, lastName, mobileNumber, employeeId, address);
			person.setParentsAccountBalance(balance);
			Loan eduLoan = new EducationLoan();
			person.setRequestLoanAmount(requestedLoan);
			if(eduLoan.loanApplicable(person)){
				System.out.println("Your education loan request is approved");
				System.out.println("Your payable interest is "+ calculateInterest(eduLoan.getInterestType(), eduLoan.getInterestRate(), eduLoan.getTimeperiod(), requestedLoan));

			}
		}
		
		else if (option == 3){
			System.out.println("Enter the balance in your current account");
			balance = scanner.nextDouble();
			scanner.nextLine();
			Person person = new Person(firstName, lastName, mobileNumber, employeeId, address,balance);
			Loan travelLoan = new TravelLoan();
			person.setRequestLoanAmount(requestedLoan);
			if(travelLoan.loanApplicable(person)){
				System.out.println("Your travel loan request is approved");
				System.out.println("Your payable interest is "+ calculateInterest(travelLoan.getInterestType(), travelLoan.getInterestRate(), travelLoan.getTimeperiod(), requestedLoan));

			}
			
		}
		else if(option == 4){
			Person person = new Person(firstName, lastName, mobileNumber, employeeId, address);
			Loan personalLoan = new PersonalLoan();
			person.setRequestLoanAmount(requestedLoan);
			if(personalLoan.loanApplicable(person)){
				System.out.println("Your personal loan request is approved");
				System.out.println("Your payable interest is "+ calculateInterest(personalLoan.getInterestType(), personalLoan.getInterestRate(), personalLoan.getTimeperiod(), requestedLoan));

			}
			
		}
		

		
	}
	
	public static double calculateInterest(InteterstType enumVar,double roi,int time,long principle){
		if(enumVar == InteterstType.COMPOUND){
			return (principle*((1+roi))*time);
		
		}
		else {
			return (principle* roi*time);
		}
	}

}
