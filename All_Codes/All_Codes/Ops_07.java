class Circle{
    float r;
    float pie=3.14f;
    public float area(){
        return pie*r*r;
    }
    public float circumference(){
        return 2*pie*r;
    }
}
public class Ops_07 {
    public static void main(String[] args) {
        Circle c= new Circle();
        c.r = 3;
        System.out.println(c.area());
        System.out.println(c.circumference());
    }
    
}
