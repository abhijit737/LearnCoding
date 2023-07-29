//multilevel inheritance
class a{
    void showA(){
        System.out.println("Hello how are you");
    }
}
class b extends a {
    void showB(){
        System.out.println("i am fine");
    }
    
}
class c extends b {
    void showC(){
        System.out.println("What about you");
    }
    public static void main(String[] args) {
        a obj1 = new a();
        obj1.showA();
        System.out.println("-----------");

        b obj2= new b();
        obj2.showB();
        System.out.println("--------------");

        c obj3 = new c();
        obj3.showA();
        obj3.showB();
        obj3.showC();



    }
    
}
