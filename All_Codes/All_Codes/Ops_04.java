class Square{
    int side;
    // public void side(){
    //     System.out.println("The side of Square is:");
    // }
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class Ops_04 {
    public static void main(String[] args) {
        
    
    Square Sq = new Square();
    //Sq.side();
    Sq.side=4;
   // Sq.perimeter();
   System.out.println(Sq.area());
   System.out.println(Sq.perimeter());



    
    }
}
