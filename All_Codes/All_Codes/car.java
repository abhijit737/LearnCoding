abstract class Vechile{
    void start(){

    }
}
class scooter extends Vechile{
    void start(){
        System.out.println("scooter starts with key");
    }
}
class car extends Vechile{
    void start(){
        System.out.println("Car start with key");
    }

    public static void main(String[] args) {
        scooter s = new scooter();
        s.start();
        car c = new car();
        c.start();

    }
}