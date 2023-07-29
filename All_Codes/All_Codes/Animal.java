class Dog extends Animal{ //inheritance
    String color = "Blue";
    public void eating(){
        System.out.println("THE DOG is eating");
    }
    
}
public class Animal {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eating();
        System.out.println(d1.color);

        
    }
    
}
