// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class inheriting from Dog
class Labrador extends Dog {
    void color() {
        System.out.println("Labrador is brown");
    }
}

public class MultilevelInheritance2 {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat();    // Accessing eat() method from Animal class
        labrador.bark();   // Accessing bark() method from Dog class
        labrador.color();  // Accessing color() method from Labrador class
    }
}
