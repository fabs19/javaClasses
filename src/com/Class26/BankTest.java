package com.Class26;

public class BankTest {

	public static void main(String[] args) {
	
		Bank bank=new Bank();
		bank.money=900;
		double fee=bank.chargeFee(); //store return value in variable
		System.out.println("bank fee="+fee);
		
		
		
		PNC pnc=new PNC();
		pnc.money=900;
		double pncFee=pnc.chargeFee();  //assigning return value to variable
		System.out.println("PNC fee="+pncFee);
	}

}
