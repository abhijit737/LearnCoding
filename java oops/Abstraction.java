// Abstract Car class
abstract class Car 
{
    // Abstract method for starting the car
    public abstract void start();

    // Abstract method for stopping the car
    public abstract void stop();
}

// Concrete subclass representing a Sedan car
class Sedan extends Car 
{
    @Override
    public void start() {
        System.out.println("Sedan car started.");
    }

    @Override
    public void stop() {
        System.out.println("Sedan car stopped.");
    }
}

// Concrete subclass representing an SUV car
class SUV extends Car 
{
    @Override
    public void start() {
        System.out.println("SUV car started.");
    }

    @Override
    public void stop() {
        System.out.println("SUV car stopped.");
    }
}

public class Abstraction 
{
    public static void main(String[] args) {
        Car sedan = new Sedan();
        Car suv = new SUV();

        sedan.start();
        sedan.stop();

        suv.start();
        suv.stop();
    }
}





