package com.Class11;

public class Task3 {

	public static void main(String[] args) {
		/*  3.Create an array of countries. While retrieving all values from an array print
		 * capital for each country.
		*/
		
		
		String[]countries= {"India","Canada","USA"};
		
//		for(dataType variable:arrayName) {
//			
//		}

		for(String getCountry:countries) {
			if(getCountry.equals("India")) {
				System.out.println("Delhi");
			}else if(getCountry.equals("Canada")) {
				System.out.println("Ontario");
			}else if(getCountry.equals("USA")) {
				System.out.println("Washington DC");
			}
		}
		
	}

}
