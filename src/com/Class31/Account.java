package com.Class31;

public class Account {
	 
   private  long accountNumber; 
   private double balance;
   
   //getters- give read only acess
   public long getAccountNumber() {
	   return accountNumber;
   }
   
   public double getBalance() {
	   return balance;
   }
   //setter-give write access
   public void setBalance(int amount) {
	   if(amount>0) {
	   balance=balance+amount;
	   }
   }

	public void setAccountNumber(long accountNumber) {
		if (String.valueOf(accountNumber).length() == 9) { // convert int to string
			this.accountNumber = accountNumber;
		}

	}
}






