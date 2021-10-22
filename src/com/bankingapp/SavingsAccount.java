package com.bankingapp;

//SavingAccount class
public class SavingsAccount {
	public static double annualInterestRate;
	private double savingsBalance;

	public SavingsAccount(double annIntRate, double savingsBalanace) {
		annualInterestRate = annIntRate;
		savingsBalance = savingsBalanace;
	}
	
	//
	public SavingsAccount() {
		annualInterestRate = 0;
		savingsBalance = 0;
	}

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