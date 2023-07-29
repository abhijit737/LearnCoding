import java.util.Scanner;

public class Largest_Among_three {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a= sc.nextInt();
        System.out.println("Enter second number:");
        int b =sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();
        if(a>b&&a>c)
        System.out.println("A is the largest.");
        else if(b>c&&b>a)
        System.out.println("B is larges.t");
        else
        System.out.println("C is largest.");

    }
    
}
