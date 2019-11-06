package com.Class12;

public class StringManipulationDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*
         * .contains();
         * This method  searches the sequence of characters in the string.
         * If the sequences of characters are found,
         * then it returns true otherwise returns false.
         */
        String sentence="It was raining";
        String sen="raining";
        System.err.println(sen.contains(sentence));
        
        System.out.println(sentence.contains("was"));
        
        System.out.println("==============================");
        
        // Create two Strings and initaialize them with some value.
        //implement the following methods on those strings.
        
        /*
         * sen.length();
         * sen.equals();
         * sen.contains(s);
         * sen.toUpperCase();
         * sen.toLowerCase();
         * sen.equalsIgnoreCase(anotherString);
         */
        
        String s1="Sunday";
        String s2="Fun day";
        
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println();
        
        System.out.println(s1.equals(s2));
        System.out.println();
        
        System.out.println(s1.contains("day"));
        System.out.println(s2.contains(s1));
        System.out.println();
        
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toUpperCase());
        System.out.println();
        
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toLowerCase());
        System.out.println();
        
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.equalsIgnoreCase(s1));
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}