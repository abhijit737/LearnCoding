//single inheritance
class A{
    void showA(){

        System.out.println("a class method");
    }
    
}
public class B extends A {
    void showB(){
        System.out.println("b class method");


    }
    public static void main(String[] args) {
         A  obj1= new A();

         obj1.showA();

        B obj2 = new B();
        System.out.println("--------------------");

          obj2.showB();
        obj2.showA();

        
        
    }
    
}
