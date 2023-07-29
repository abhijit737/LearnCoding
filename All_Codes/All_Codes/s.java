 class Super { 
    int i=10;

    
}
class s extends Super{
    int i=20;

    void show(int i)
    {
        System.out.println(super.i); //i = 10
        //this.i = 20;
        //i = 30;
    }
    
    public static void main(String[] args) {
        s su = new s();
        su.show(30);

        
    }
}
