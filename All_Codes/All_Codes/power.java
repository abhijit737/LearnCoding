import java.util.Scanner;

// enter two number and show second number as power of first without using java builtin meethods
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 1;

        System.out.println("Enter the number:");
        int base = sc.nextInt();

        System.out.println("Enter the power :");
        int power = sc.nextInt();

        for( int i =1;i<=power;i++){
            res = base*(res);
        }
        System.out.println(res);
    }
    
}
