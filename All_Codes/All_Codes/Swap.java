import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        a = sc.nextInt();
        System.out.println("Enter b:");
        b= sc.nextInt();
        a = a+b;
        b= a-b;
        a = a-b;
        System.out.println("a is " +a+ " b is " +b);
    }
    
}
