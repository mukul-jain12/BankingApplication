package com.bankingapp;

//SavingAccount class
public class SavingsAccount {
	
	//static variables
	public static double annualInterestRate;
	public double savingsBalance;

	//setter method
	public void setSavingsBalance(double newBalance) {
		savingsBalance = newBalance;
	}
	
	//getter method
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	//getter method
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	//return the monthly interest
	public double calculateMonthlyInterest() {
		double annIntRate = (savingsBalance * annualInterestRate/12);
		savingsBalance = savingsBalance + annIntRate;
		return annIntRate;
	}

	//modified interest rate
	public static void modifyInterestRate(double newInteresRate) {
		annualInterestRate = newInteresRate;
	}
}