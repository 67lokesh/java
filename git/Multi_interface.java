package git;

// first interface
interface Interface1 {
 void method1();
}

// second interface
interface Interface2 {
 void method2();
}

public class Multi_interface {
 public static void main(String[] args) {
     //  object creation for MyClass
     MyClass myObject = new MyClass();

     // Call methods from the interfaces
     myObject.method1();
     myObject.method2();
 }
}

//Implement the interfaces in a class
class MyClass implements Interface1, Interface2 {
@Override
public void method1() {
   System.out.println("Implementation of method1");
}

@Override
public void method2() {
   System.out.println("Implementation of method2");
}
}


