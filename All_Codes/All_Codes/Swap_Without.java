public class Swap_Without {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        a = a+b;
        b= a-b;
        a = a-b;
        System.out.println("The value of a is " +a + " : " + "The value of b is" +b);
    }
    
}
