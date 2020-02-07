package come.Class17;

public class Phone {
	/*Create a Class “Phone”. Create 3 Objects of it:
	 *  iPhone, Android, Nokia with specific  
	 *  attributes and behaviours.
	 */

	//public static void main(String[] args) {
		//attributes/features
		
		String model, brand;
		int memory, ram;
		boolean camera, touchscreen;
		
		//define behavior methods
		
		void call() {
			System.out.println("I can make calls on my "+model);
		}
		void text() {
			System.out.println("I can text  on my "+model);
		}
		void photos() {
			System.out.println("I can take photo on my "+model);
		}
		//////////////////////////////////////////////
		public static void main(String[] args) {
			
			Phone phone1=new Phone();
			phone1.model="iPhone";
			phone1.brand="X";
			phone1.memory=200;
			phone1.camera=true;
			
			phone1.call();
			phone1.text();
			phone1.photos();
			
			
			System.out.println("--2nd obj of phone--");
			
			
			Phone phone2=new Phone();
			phone2.model="Android";
			phone2.brand="Google";
			phone2.memory=600;
			phone2.camera=true;
			
			phone2.call();
			phone2.text();
			phone2.photos();
			
			
			System.out.println("--3rd obj of phone----");
			
			Phone phone3=new Phone();
			phone3.model="Nokia";
			phone3.brand="flip";
			phone3.memory=250;
			phone3.camera=true;
			
			phone3.call();
			phone3.text();
			phone3.photos();
			
			
			
			
			
		}
}
