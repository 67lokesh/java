package inheritenceoops;

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       GoldenRetriever gd=new GoldenRetriever();
       gd.sound();
       gd.scream();
       gd.noise();
	}

}
class Animals {
    void noise() {
        System.out.println("Some generic sound");
    }
}

class Dogs extends Animals {
    void scream() {
        System.out.println("Bark");
    }
}

class GoldenRetriever extends Dogs {
    void sound() {
        System.out.println("Woof");
    }
}
