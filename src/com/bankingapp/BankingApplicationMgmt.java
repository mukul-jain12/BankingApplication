//Welcome To Banking Application

package com.bankingapp;

public class BankingApplicationMgmt {
	public static void main(String args[]) {
		System.out.println("Welcome To The Banking Application");
		
		//saving account object
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		
		//defined different saving balance
		saver1.setSavingsBalance(2000.00);
		saver2.setSavingsBalance(3000.00);
		
		//modify annual interest rate from 0 to 4%
		SavingsAccount.modifyInterestRate(0.04);
		
		//calculating monthly interest
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		//print new balance when ann. int. is 5%
		System.out.printf("New Balance for Saver1 with interest of 0.04 is " + saver1.getSavingsBalance() + "\n");
		System.out.printf("New Balance for Saver2 with interest of 0.04 is " + saver2.getSavingsBalance() + "\n");
		
		//modify annual interest rate from 4% to 5%		
		SavingsAccount.modifyInterestRate(0.05);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		//print new balance when ann. int. is 5%
		System.out.printf("New Balance for Saver1 with interest of 0.05 is " + saver1.getSavingsBalance() + "\n");
		System.out.printf("New Balance for Saver2 with interest of 0.05 is " + saver2.getSavingsBalance() + "\n");
	}
}