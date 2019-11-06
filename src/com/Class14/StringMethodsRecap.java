package com.Class14;

public class StringMethodsRecap {

	public static void main(String[] args) {
		//.replace : if occurance  repeated more than once will replace all those characters
		String str="Syntax Technologies";
		System.out.println(str.replace('y', 'i'));
		
		System.out.println("*********************************");
		//System.out.println(str.replace(target, replacement));
		//looks for occurance of sequence of characters AND WILL replace
		System.out.println(str.replace("your", "my"));
		
		System.out.println("**********************");
		//replaceALL
		//regular expression:
		//
		//System.out.println(str2.replaceAll(regex, replacement)
		String str2="Video provies a powerful way";
		
		System.out.println("****************************");
		//System.out.println(str2.replaceFirst(regex, replacement)
		System.out.println(str2.replaceFirst(" ", ""));
		
		System.out.println("***************************");
		
		String str3="27327*&^^&*Hello&****";//??
		//System.out.println(str3.replaceAll(regex, replacement)("\\W",""));
		//keep just text
		
		
		

	}

}
