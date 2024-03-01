package com.arya.casestudy;

import com.arya.casestudy.application.MMBankFactory;
import com.arya.casestudy.framework.BankAccount;
import com.arya.casestudy.framework.BankFactory;

public class App {

	public static void main(String[] args) {
		BankFactory factory= new MMBankFactory();
		BankAccount savingAccount = factory.getNewSavingAccount(1234, "DB", 10000, true);
		
		savingAccount.withdraw(4000);
		savingAccount.deposit(5000);
		
		BankAccount currentAccount = factory.getNewCurrentAccount(5678, "SY", 5000, 1000);
		currentAccount.withdraw(3000);
		currentAccount.deposit(2000);
	}
}