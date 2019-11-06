package com.Class5;

public class NestedIfRecap {

	public static void main(String[] args) {
		/*Verify if  button is dispayed on the page
		 * if button is displayed then we need to verify text on
		 * if text equal to sign in -> test case pass
		 * otherwise-> wrong text is displayed
		 */

		boolean isDisplayed=true;
		String buttonText="Sign in";
		
		if (isDisplayed) {
			System.out.println("button is displayed");
			if (buttonText.equals("Sign in")) {
				System.out.println("Test case pass");
			} else {
				System.out.println("wrong text is displayed");
			}

		} else {
			System.out.println("not displayed");
		}
		
		
		 
		
		
		
	}

}
