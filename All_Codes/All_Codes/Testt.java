interface I1{
    abstract void show();
}

interface I2{
    abstract void start();
}
class Testt implements I1,I2{
    public void show(){
        System.out.println("i am showing");
    }
    public void start(){
        System.out.println("Car start with key");
    }

    public static void main(String[] args) {
        Testt t = new Testt();
        t.show();
        t.start();
    }
}