package com.bankingapp;

class SavingsAccount {
	public static double annualInterestRate;

	public SavingsAccount() {
		annualInterestRate = 0.0;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
}
