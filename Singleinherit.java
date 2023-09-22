package inheritenceoops;

public class Singleinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Dog myDog = new Dog();
		myDog.sound();
		
		myDog.noise();
		
		
		

	}
}
	class Animal {
	    void noise() {
	        System.out.println("Some generic sound");
	    }
	}

	class Dog extends Animal {
	    void sound() {
	        System.out.println("Bark");
	    }
	}



