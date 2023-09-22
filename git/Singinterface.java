package git;

// interface named Vehicle
interface Vehicle {
 void start();
 void stop();
 
}



//Create a main class to demonstrate the program
public class Singinterface {
 public static void main(String[] args) {
     Car myCar = new Car();
     
     // Call methods from the Vehicle interface
     myCar.start();
     myCar.stop();
     
     // Call the method specific to the Car class
     myCar.drive();
 }
}

//Creating a class Car that implements the Vehicle interface
class Car implements Vehicle {
@Override
public void start() {
   System.out.println("Car started");
}

@Override
public void stop() {
   System.out.println("Car stopped");
}

public void drive() {
   System.out.println("Car is driving");
}
}
