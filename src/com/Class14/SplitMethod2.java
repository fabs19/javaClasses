package com.Class14;

public class SplitMethod2 {
//dnt copy this one
	public static void main(String[] args) {
		// TODO Auto-generated method stub

       //how to seperate comma delimited string
        
        String str = "If you come to class early,"
        		+ " you can study more, also you can learn more,"
        		+ " and you can leave early";
        
        String [] array = str.split(",");
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
        
        System.out.println("******************************************");
        
        //split in 2 elements in array range of how many sentences you want
        String str1="Welcome To Syntax Technologies";
       // str1.split(regex, limit)
        String[] array2=str1.split(" ", 3);
        System.out.println(array2.length);
        
        for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
        
        
        
        
        
        
        
    }
}



