package com.Class26;

public class Bank { //Parent
	
	double money;
	
	public double chargeFee() {
		double fee=0;
		if(money<1000) {
			fee=money*0.1;
		}else {
			fee=0;
		}
		return fee;
		
		
	}
}
//to write 2 classes witin same file.Make sure only one class is public. Make sure second class is out side the first class
class PNC extends Bank{
	@Override// placed on top of method u overridding.
	public double chargeFee() {  //@Override: optional annotation helps identify whether ur actually overwrittin or not
		double fee;
		if(money<1000) {
			fee=money*0.05;
		}else {
			fee=0;
		}
		return fee;
	}
}