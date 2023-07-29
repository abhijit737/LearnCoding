class FinalKey{
    final void m1(){
        System.out.println("I m method one");

    }
    
}
class Final extends FinalKey{
    
    void m1(){  //overriding can be stopped by final keyword,if we give our class as final word before parent class then we can stop inheritance
        System.out.println("i m not m1");
    }


public static void main(String[] args) {
    FinalKey fk = new FinalKey();
        fk.m1();
        
    }
}