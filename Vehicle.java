public class Vehicle {
    void run() {
        System.out.println("Vehicle is running...");
    }
    
}
class Car extends Vehicle {
    void accelerates() {
        System.out.println("Car is accelerating.");
    }
}
class Bike extends Vehicle {
    void pedal() {
        System.out.println("Bike is being pedeled");
    }
}


