import java.util.Scanner;

//multiply two floating point number

public class Multiply_Two_Floating_number {
    public static void main(String[] args) {
       //float b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        float a = sc.nextFloat();
        System.out.println("Enter second number:");
        float b = sc.nextFloat();
        float c =  a * b;


        System.out.println(c);

    }
    
}
