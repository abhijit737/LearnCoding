 //interface example
 interface I1 {
    public abstract void show();
       // System.out.println();
    
    
}
interface I2{
    abstract void display();
    static void run(){
        System.out.println("auwujsb");
    }
}


class Test implements I1,I2{
   public  void show(){
        System.out.println("I am showing 1");
    }
    public void display(){

    }
    

   static void run(){
        System.out.println("i am running");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.display();
        t.run();

    }
}

// int a will be final int a
//static method will have a blank body first then during implements its body will be given
