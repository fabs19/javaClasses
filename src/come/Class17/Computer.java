package come.Class17;

public class Computer {


	// Define attributes/feaures
	String name, brand;
	boolean keyboard, monitor, mouse;
	int screen, memory, ram;

	//define behavior,actions
	void playGames() { //method header
		System.out.println("I can play on my "+name); //method body
	}
	
	void javaCoding() {//define method
		System.out.println("I can do Java conding on my "+name);
	}
	
	void watchMovie() {
		System.out.println("I can watch movie on my "+name);
	}
	//////////////////////////////////////////////////////////
	//using main method for code execution
	public static void main(String[] args) {// makes our class be executable
		//place code u wanna execute here
		
		
		Computer comp1=new Computer();//new obj
		comp1.brand="Apple"; //assigning values for 1st obj
		comp1.name="MacBook Pro";
		comp1.memory=250;
		
		//i have apple macBook pro
		System.out.println("I have "+comp1.brand+" "+comp1.name);
		comp1.javaCoding(); //calling method for 1st obj
		comp1.watchMovie();
		
		System.out.println("---Creating 2nd object of a computer type--------");
		Computer computer2=new Computer(); //new object
		computer2.brand="Dell"; //assigning valuegos for 2nd obj
		computer2.name="420";
		computer2.memory=125;
		
		computer2.javaCoding();//calling methods for 2nd obj
		computer2.watchMovie();
		computer2.playGames();
		
		
	}

}

