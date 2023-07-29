//static method in java
class staticc{
    static int a=10;

    static void display(){
        System.out.println("I am static method");

    }
    public static void main(String[] args) {
        // int a=11;
        staticc.display();  //called using class name can be called by object but not needed;
    }

}