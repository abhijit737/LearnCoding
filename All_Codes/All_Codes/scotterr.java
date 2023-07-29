abstract class vechile{
   abstract void start ();
        
    }

class car extends vechile{
    void start(){
        System.out.println("Car start with key ");
    }
}
class scotterr extends vechile{
    void start(){
        System.out.println("scotter start with kick");
    }
    public static void main(String[] args) {
        car c =new car();
        c.start();
        scotterr s= new scotterr();
        s.start();
    }
}