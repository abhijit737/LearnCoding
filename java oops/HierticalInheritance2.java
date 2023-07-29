// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven");
    }
}

// Another child class inheriting from Vehicle
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is being ridden");
    }
}

public class HierticalInheritance2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();  // Accessing start() method from Vehicle class
        car.drive();  // Accessing drive() method from Car class

        Bike bike = new Bike();
        bike.start();  // Accessing start() method from Vehicle class
        bike.ride();  // Accessing ride() method from Bike class
    }
}
