package com.Class11;

import java.util.Arrays;

public class IQ_ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//actual is from ui
//expected is from database
//sorts:sorts it in alphabetical order, starting from 0 - whatever number
		//IQ:How to sort array?thers aray class theres is a method there called 
		//sort and thats how we can sort it. num0-9 hass acces to index will pick
		//up index 
		
		
		String[] actualNames= {"Jhon", "Smith","Alex","Tanaz"};
        Arrays.sort(actualNames);
        
        String[] expectedNames= { "Smith","Jhon","Alex","Tanaz"};
        
        //To sort the elements of an Array
        Arrays.sort(expectedNames);
        
        System.out.println(Arrays.toString(actualNames));
        
        String actual=Arrays.toString(actualNames);
        String expected=Arrays.toString(expectedNames);
        
        System.out.println(actual.equals(expected));
        
        /*
         * 
         */
        
        ////IQ:how can u sort element of array ascending order?
        int[]numbers= {123,34,15,66,99};
        Arrays.sort(numbers);  //theres class called array inside there is a method called sort
        for(int i:numbers) {
        	System.out.println(i+" ");
        }
        
        
        
        
        
        
        
	}

}

