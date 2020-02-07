package com.Class14;

public class StringMethodsRecap {

	public static void main(String[] args) {
		//.replace :if occurrence  repeated more than once will replace all those characters
		String str="Syntax Technologies";
		System.out.println(str.replace('y', 'i'));
		
		System.out.println("*********************************");
		//System.out.println(str.replace(target, replacement));
		//looks for occurance of sequence of characters AND WILL replace
		System.out.println(str.replace("your", "my"));
		
		System.out.println("**********************");
		//.replaceALL
		//regular expression:
		//System.out.println(str2.replaceAll(regex, replacement)
		
		String str2="Video provides a powerful way to help you prove your point. "
				+ "When you click Online Video, you can paste in the embed "
				+ "code for the video you want to add. ";
		System.out.println(str2.replaceAll("to(.*)", ""));
		
		System.out.println("**************");

		String str3="23423Hell3049o^&*^&*$%$";
		System.out.println(str3.replaceAll("[0-9]", ""));
		System.out.println(str3.replaceAll("[^a-zA-Z^]", ""));
		
		System.out.println("**************");
		System.out.println(str2.replaceFirst(" ", ""));
		System.out.println(str3.replaceAll("\\w", ""));
		
		
	}

}