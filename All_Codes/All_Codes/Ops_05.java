class Rectangle{
    int l,b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }
}
public class Ops_05 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.l=2;
        r.b=4;
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
    
}
