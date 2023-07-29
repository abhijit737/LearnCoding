import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a= sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();
        //sc.close();
        if(a>b && a>c){
            System.out.println("A is Greater.");
        }
        else if(b>a && b>c){
            System.out.println("B is Greater.");
        }
        else{
            System.out.println("C is Greater.");
        }

    }
    
}
