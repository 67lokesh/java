package inheritenceoops;

public class Heirarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Dogg d=new Dogg();
          d.sound();
          d.sounds();
          
          Cat c=new Cat();
          c.sounding();
          c.sounds();
	}

}
class Animale {
    void sounds() {
        System.out.println("Some generic sound");
    }
}

class Dogg extends Animale {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animale {
    void sounding() {
        System.out.println("Meow");
    }
}
