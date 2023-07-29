//prg showing that a normal method cannot be called in static method
public class static3 {
    static void display() {
         show();
        System.out.println("hello how are you");
    }

    public static void main(String[] args) {

    }

}

class xyz {
     void show() {
        System.out.println("i am show");
    }
}
