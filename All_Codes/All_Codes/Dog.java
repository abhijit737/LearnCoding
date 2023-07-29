class Animal_inheritance{
    void eat (){
        System.out.println("I am eating");
    }

}
 class Dog extends Animal_inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        
    }
    
}
