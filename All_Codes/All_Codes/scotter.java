// //abstraction same methods
abstract class abstraction{
    abstract void start();



     
        //System.out.println();
    
}
class car extends abstraction{
    void start(){
        System.out.println("Car start with key");
    }
}
class scotter extends abstraction{
    void start(){
        System.out.println("Scotter start with kick");
    }
    public static void main(String[] args) {
        car c = new car();
        c.start();
        scotter s = new scotter();
        s.start();
    }
}