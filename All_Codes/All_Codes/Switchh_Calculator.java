import java.util.Scanner;
//import java.lang.*;

public class Switchh_Calculator {
    public static void main(String[] args) {
       // String choice = "+","-","*","/";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int n2=sc.nextInt();
        System.out.println("choose your option");
        char sym = sc.next().charAt(0);// for character

        
       int res;
        
        switch(sym)
        {
            case '+':
            res = n1+n2;
            System.out.println(res);
            break;

            case '-':
            res=n1-n2;
            System.out.println(res);
            break;

            case '*':
            res = n1*n2;
            System.out.println(res);
            break;

            case '/':
            res = n1/n2;
            System.out.println(res);
            break;
            default:
            System.out.println("Wrong input");


        }


    }
}
