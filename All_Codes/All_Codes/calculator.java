import java.util.Scanner;

//package 08_Practice;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sc.close ();
        System.out.println("Enter the first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int n2 = sc.nextInt();
        System.out.println("Enter the choice: +,-,*,/");
        String choice = sc.next();
        int res;
        switch(choice){
            case "+":
            res = n1+n2;
            System.out.println(res);
            break;
            case "-":
            res = n1-n2;
            System.out.println(res);
            break;
            case "*":
            res = n1*n2;
            System.out.println(res);
            break;
            case "/":
            res = n1/n2;
            System.out.println(res); 
            break;
            default : 
            System.out.println("Invalid Symbol.");
        }
        
    }
    
}
