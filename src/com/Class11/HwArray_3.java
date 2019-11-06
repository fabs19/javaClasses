package com.Class11;

public class HwArray_3 {

	public static void main(String[] args) {
		/*  3.Create an array of countries. While retrieving all values from an array print
		 * capital for each country.
		*/
		
		
		String []countries= {"USA","Russia","Turkey","Afghanistan", "Colombia"};
		
		for (int i = 0; i < countries.length; i++) {

			if (countries[i].equals("USA")) {
				System.out.println("Washington DC");
			} else if (countries[i].equals("Russia")) {
				System.out.println("Moscow");
			} else if (countries[i].equals("Turkey")) {
				System.out.println("Ankara");
			} else if (countries[i].equals("Afghanistan")) {
				System.out.println("Kabul");
			} else if (countries[i].equals("Colombia")) {
				System.out.println("Bogota");
			}
		}
		
		//for each way:

		String []countries2= {"USA","Russia","China"};
		
		for(String element:countries2) {
			
			if (element.equals("USA")) {
				System.out.println("Washington DC");
			} else if (element.equals("Russia")) {
				System.out.println("Moscow");
			} else if (element.equals("China")) {
				System.out.println("Beijing");
		}
			

	}

}}
