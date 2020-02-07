package com.Class29;
/*
 * Create a class File that will have the following behaviors: open, edit, close.
 * Edit and close are implemented method while open is an abstract.
 * Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide 
 * specific implementation of open behaviour: Example:
 * to open .java file we need notepad++ or sublime text, 
 * to open .doc file we need Microsoft word to be installed etc
 */
public abstract class FileTask {
	//unimplemented abstract
	public abstract void open();
	//implemented method
	public void edit() {
		System.out.println("Make edits");
	}
	public void close() {
		System.out.println("close");
	}
	
	}
class JavaFile extends FileTask{

	@Override
	public void open() {
		System.out.println("to open file need sublime text");
		
	}
	
}
class WordFile extends FileTask{

	@Override
	public void open() {
		System.out.println("need Microsoft word to be installed");
		
	}
	
}
class PDFFile extends FileTask{

	@Override
	public void open() {
		System.out.println("need PDF to be installed");
		
	}
	
}

