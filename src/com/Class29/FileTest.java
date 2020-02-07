package com.Class29;

public class FileTest {

	public static void main(String[] args) {
		
		FileTask obj=new JavaFile();
		obj.edit();
		obj.close();
		obj.open();// from child
		
		FileTask obj1=new WordFile();
		
		
		FileTask pbj2=new PDFFile();

	}

}
