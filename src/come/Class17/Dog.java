package come.Class17;

public class Dog {
	
	/*Create a Dog Class and create 3 different objects of it:
	 *  Husky, Bulldog, Labrador  with specific attributes
	 *   and behaviours.
	 */

		//attributes
		String breed, name, color;
		int age;
		
		//define behavior
		void bark() {
			System.out.println(name+ "can bark");
		}
		void play() {
			System.out.println(name+ " can play");
		}
		void eat() {
			System.out.println(name+" can eat");
		}
		///////////////////////////////////////////
		public static void main(String[] args) {
			
		
		Dog dog1=new Dog();
		dog1.name="Aegon";
		dog1.breed="Husky";
		dog1.color="Tan";
		dog1.age=4;
		
		dog1.bark();
		dog1.play();
		dog1.eat();
		
		System.out.println("---2nd obj of Dog-----");
		Dog dog2=new Dog();
		dog2.name="George";
		dog2.breed="Bulldog";
		dog2.color="brown";
		dog2.age=5;
		
		dog2.bark();
		dog2.play();
		dog2.eat();
		
		
		System.out.println("---3rd obj of Dog-----");
		
		Dog dog3=new Dog();
		dog3.name="Cindy";
		dog3.breed="Labrador";
		dog3.color="black";
		dog3.age=1;
		
		dog3.bark();
		dog3.play();
		dog3.eat();
		
		
		
		
		
		
		
		
		
		
	}
}
