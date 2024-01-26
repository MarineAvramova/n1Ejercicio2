
import java.lang.String;
import java.lang.*;
public class Car {
    /*Exercise 2
Create a class "Car" with the attributes: brand, model and power.
Brand must be static final, model static and power final.
Show the difference between the three. Is there one that can be initialized
in the class constructor?
Add two methods to the "Car" class. A static method called break()
and a non-static method called accelerate(). The accelerate method
must show by console: “The vehicle is accelerating”
and the brake() method must show: “The vehicle is braking”.
Demonstrate how to invoke static and non-static method from main() of main class.*/

    //Attributes
    final static String BRAND = "Nissan"; //is a constant that belongs to the class
    // cannot be changed, and it is shared among all instances of the class.
    static String model; //static variable belongs to the class rather than to instances of the class.
    // 1.Initialize at the time of declaration. 2.Initialize within a static block
    //3.Initialize in a static method
    final int power; //final variables must be initialized when declared or in the constructor

    static {
        model = "GTR";
    }
    public Car(final int power) {
     this.power = 200; //final variables must be initialized in the constructor
    }

     static void slow() {
        System.out.println("The car is accelerating");
    }

    void accelerate(){
        System.out.println("The car is braking");
    }
}
